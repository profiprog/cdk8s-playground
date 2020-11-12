package com.mycompany.app;

import imports.k8s.*;
import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;
import software.constructs.Construct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main extends Chart
{

  public Main(final Construct scope, final String id) {
    this(scope, id, null);
  }

  public Main(final Construct scope, final String id, final ChartOptions options) {
    super(scope, id, options);

    final Map<String, String> labels = new HashMap<>();
    labels.put("app", "cdk8s-java");

    new Service(this, "service", new ServiceOptions.Builder()
        .spec(new ServiceSpec.Builder()
            .type("LoadBalancer")
            .ports(Arrays.asList(
                new ServicePort.Builder()
                    .port(80)
                    .targetPort(IntOrString.fromNumber(80))
                    .build()
            ))
            .selector(labels)
            .build()
        )
        .build()
    );

    new Deployment(this, "deployment", new DeploymentOptions.Builder()
        .spec(new DeploymentSpec.Builder()
            .replicas(2)
            .template(new PodTemplateSpec.Builder()
                .metadata(new ObjectMeta.Builder()
                    .labels(labels)
                    .build())
                .spec(new PodSpec.Builder()
                    .containers(Arrays.asList(
                        new Container.Builder()
                            .name(id)
                            .image("nginxdemos/hello")
                            .ports(Arrays.asList(
                                new ContainerPort.Builder()
                                    .containerPort(80)
                                    .build()
                            ))
                            .build()
                    ))
                    .build())
                .build())
            .selector(new LabelSelector.Builder()
                .matchLabels(labels)
                .build()
            ).build()
        ).build()
    );
    // define resources here
  }

  public static void main(String[] args) {
    final App app = new App();
    new Main(app, "cdk8s-java-example");
    app.synth();

  }
}