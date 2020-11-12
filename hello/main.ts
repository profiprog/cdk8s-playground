import { Construct } from 'constructs';
import { App, Chart } from 'cdk8s';

import { Deployment, Service, Ingress, IntOrString, Namespace, ObjectMeta } from './imports/k8s'

export interface SimpleWebAppOption {
  domain?: string;
  appImage: string;
  /** default 80 */
  cotnainerPort?: number;
  servicePort: number;
  /** default 1 */
  replicas?: number;
  namespace?: string;
}

export class SimpleWebApp extends Chart {
  constructor(scope: Construct, name: string, opts: SimpleWebAppOption) {
    super(scope, name);

    const label = { app: `web-${name}` };

    let metadata: ObjectMeta = {};
    if (opts.namespace) metadata = {...metadata, namespace: opts.namespace};

    const service = new Service(this, 'service', {
      metadata,
      spec: {
        type: 'LoadBalancer',
        ports: [
          {
            port: opts.servicePort,
            targetPort: IntOrString.fromNumber(opts.cotnainerPort || 80),
            protocol: 'TCP',
          },
        ],
        selector: label,
      },
    });

    if (opts.domain) {
      new Ingress(this, 'ingress', {
        metadata,
        spec: {
          rules: [
            {
              host: opts.domain,
              http: {
                paths: [
                  {
                    path: '/',
                    backend: {
                      serviceName: service.name,
                      servicePort: opts.servicePort,
                    },
                  },
                ],
              },
            },
          ],
        },
      });
    }

    new Deployment(this, 'deployment', {
      metadata,
      spec: {
        replicas: opts.replicas || 1,
        selector: {
          matchLabels: label,
        },
        template: {
          metadata: { labels: label },
          spec: {
            containers: [
              {
                name: name,
                image: opts.appImage,
                ports: [ { containerPort: opts.cotnainerPort || 80 } ],
              },
            ],
          },
        },
      }
    });
  }
}



export class NamespaceChart extends Chart {
  private readonly _namespace: Namespace;

  constructor(scope: Construct, name: string) {
    super(scope, name);

    this._namespace = new Namespace(this, 'namespace', { metadata: { name } });
  }

  getNamespace(): Namespace {
    return this._namespace;
  }

  get name(): string {
    return this._namespace.name;
  }
}




const app = new App();
const ns = new NamespaceChart(app, 'web-apps');

new SimpleWebApp(app, 'hellok8s', {
  appImage: 'paulbouwer/hello-kubernetes:1.7',
  cotnainerPort: 8080,
  servicePort: 9001,
  replicas: 2,
  domain: 'k8s.local',
  namespace: ns.name,
}).addDependency(ns);

new SimpleWebApp(app, 'nginxdemo', {
  appImage: 'nginxdemos/hello',
  servicePort: 9002,
  replicas: 2,
  domain: 'nginx.local',
  namespace: ns.name,
}).addDependency(ns);

new SimpleWebApp(app, 'realcount', {
  appImage: 'tutum/hello-world',
  servicePort: 9003,
  replicas: 2,
  domain: 'tutum.local',
  namespace: ns.name,
}).addDependency(ns);

app.synth();
