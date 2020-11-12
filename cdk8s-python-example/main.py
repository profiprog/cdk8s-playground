#!/usr/bin/env python
from constructs import Construct
from cdk8s import App, Chart
from imports import k8s

class MyChart(Chart):
    def __init__(self, scope: Construct, ns: str):
        super().__init__(scope, ns)

        labels = {"app": "cdk8s-python"}

        k8s.Service(
            self,
            'service',
            spec=k8s.ServiceSpec(
                type='LoadBalancer',
                ports=[
                    k8s.ServicePort(
                        port=80,
                        target_port=k8s.IntOrString.from_number(80)
                    ),
                ],
                selector=labels,
            ),
        )

        k8s.Deployment(
            self,
            'deployment',
            spec=k8s.DeploymentSpec(
                replicas=2,
                selector=k8s.LabelSelector(match_labels=labels),
                template=k8s.PodTemplateSpec(
                    metadata=k8s.ObjectMeta(labels=labels),
                    spec=k8s.PodSpec(
                        containers=[
                            k8s.Container(
                                name=ns,
                                image='nginxdemos/hello',
                                ports=[
                                    k8s.ContainerPort(container_port=80),
                                ],
                            ),
                        ],
                    ),
                ),
            ),
        )


app = App()
MyChart(app, "cdk8s-python-example")

app.synth()
