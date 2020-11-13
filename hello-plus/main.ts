import { Construct } from 'constructs';
import { ApiObjectMetadata, App, Chart } from 'cdk8s';
import { Container, Deployment, ImagePullPolicy, Ingress, IngressBackend, Protocol, Service, ServiceType } from 'cdk8s-plus';
import { Namespace } from './imports/k8s';

export interface SimpleWebAppChartOptions {
  domain?: string;
  appImage: string;
  /** default 80 */
  cotnainerPort?: number;
  servicePort: number;
  /** default 1 */
  replicas?: number;
  namespace?: string;
}

export class SimpleWebAppChart extends Chart {
  constructor(scope: Construct, name: string, opts: SimpleWebAppChartOptions) {
    super(scope, name);

    let metadata: ApiObjectMetadata = {};
    if (opts.namespace) metadata = {...metadata, namespace: opts.namespace};

    const service = new Service(this, 'service', {
      metadata,
      type: ServiceType.LOAD_BALANCER,
      ports: [{port: opts.servicePort, targetPort: opts.cotnainerPort || 80, protocol: Protocol.TCP }],
    });
    service.addSelector('app', `web-${name}`);

    if (opts.domain) {
      new Ingress(this, 'ingress', {
        metadata,
        rules: [
          { host: opts.domain, path: '/', backend: IngressBackend.fromService(service) },
        ],
      });
    }

    const deployment = new Deployment(this, 'deployment', {
      metadata,
      replicas: opts.replicas || 1,
      defaultSelector: false,
      containers: [
        new Container({
          image: opts.appImage,
          imagePullPolicy: ImagePullPolicy.IF_NOT_PRESENT,
          name: name,
          port: opts.cotnainerPort || 80,
        }),
      ],
    });
    deployment.podMetadata.addLabel('app', `web-${name}`)
    deployment.selectByLabel('app', `web-${name}`);

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

new SimpleWebAppChart(app, 'hellok8s', {
  appImage: 'paulbouwer/hello-kubernetes:1.7',
  cotnainerPort: 8080,
  servicePort: 9001,
  replicas: 2,
  domain: 'k8s.local',
  namespace: ns.name,
}).addDependency(ns);

new SimpleWebAppChart(app, 'nginxdemo', {
  appImage: 'nginxdemos/hello',
  servicePort: 9002,
  replicas: 2,
  domain: 'nginx.local',
  namespace: ns.name,
}).addDependency(ns);

new SimpleWebAppChart(app, 'realcount', {
  appImage: 'tutum/hello-world',
  servicePort: 9003,
  replicas: 2,
  domain: 'tutum.local',
  namespace: ns.name,
}).addDependency(ns);

app.synth();
