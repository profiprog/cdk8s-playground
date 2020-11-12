package imports.k8s;

/**
 * PodSpec is a description of a pod.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.323Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PodSpec")
@software.amazon.jsii.Jsii.Proxy(PodSpec.Jsii$Proxy.class)
public interface PodSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * List of containers belonging to the pod.
     * <p>
     * Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.Container> getContainers();

    /**
     * Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers.
     * <p>
     * Value must be a positive integer.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getActiveDeadlineSeconds() {
        return null;
    }

    /**
     * If specified, the pod's scheduling constraints.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Affinity getAffinity() {
        return null;
    }

    /**
     * AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getAutomountServiceAccountToken() {
        return null;
    }

    /**
     * Specifies the DNS parameters of a pod.
     * <p>
     * Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodDnsConfig getDnsConfig() {
        return null;
    }

    /**
     * Set DNS policy for the pod.
     * <p>
     * Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     * <p>
     * Default: ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDnsPolicy() {
        return null;
    }

    /**
     * EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links.
     * <p>
     * Optional: Defaults to true.
     * <p>
     * Default: true.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getEnableServiceLinks() {
        return null;
    }

    /**
     * HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified.
     * <p>
     * This is only valid for non-hostNetwork pods.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.HostAlias> getHostAliases() {
        return null;
    }

    /**
     * Use the host's ipc namespace.
     * <p>
     * Optional: Default to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHostIpc() {
        return null;
    }

    /**
     * Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHostname() {
        return null;
    }

    /**
     * Host networking requested for this pod.
     * <p>
     * Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHostNetwork() {
        return null;
    }

    /**
     * Use the host's pid namespace.
     * <p>
     * Optional: Default to false.
     * <p>
     * Default: false.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getHostPid() {
        return null;
    }

    /**
     * ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec.
     * <p>
     * If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.LocalObjectReference> getImagePullSecrets() {
        return null;
    }

    /**
     * List of initialization containers belonging to the pod.
     * <p>
     * Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.Container> getInitContainers() {
        return null;
    }

    /**
     * NodeName is a request to schedule this pod onto a specific node.
     * <p>
     * If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getNodeName() {
        return null;
    }

    /**
     * NodeSelector is a selector which must be true for the pod to fit on a node.
     * <p>
     * Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
     */
    default @org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
        return null;
    }

    /**
     * PreemptionPolicy is the Policy for preempting pods with lower priority.
     * <p>
     * One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
     * <p>
     * Default: PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPreemptionPolicy() {
        return null;
    }

    /**
     * The priority value.
     * <p>
     * Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getPriority() {
        return null;
    }

    /**
     * If specified, indicates the pod's priority.
     * <p>
     * "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPriorityClassName() {
        return null;
    }

    /**
     * If specified, all readiness gates will be evaluated for pod readiness.
     * <p>
     * A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.PodReadinessGate> getReadinessGates() {
        return null;
    }

    /**
     * Restart policy for all containers within the pod.
     * <p>
     * One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     * <p>
     * Default: Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRestartPolicy() {
        return null;
    }

    /**
     * RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of Kubernetes v1.14.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRuntimeClassName() {
        return null;
    }

    /**
     * If specified, the pod will be dispatched by specified scheduler.
     * <p>
     * If not specified, the pod will be dispatched by default scheduler.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSchedulerName() {
        return null;
    }

    /**
     * SecurityContext holds pod-level security attributes and common container settings.
     * <p>
     * Optional: Defaults to empty.  See type description for default values of each field.
     * <p>
     * Default: empty.  See type description for default values of each field.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.PodSecurityContext getSecurityContext() {
        return null;
    }

    /**
     * DeprecatedServiceAccount is a depreciated alias for ServiceAccountName.
     * <p>
     * Deprecated: Use serviceAccountName instead.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccount() {
        return null;
    }

    /**
     * ServiceAccountName is the name of the ServiceAccount to use to run this pod.
     * <p>
     * More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getServiceAccountName() {
        return null;
    }

    /**
     * Share a single process namespace between all of the containers in a pod.
     * <p>
     * When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false. This field is beta-level and may be disabled with the PodShareProcessNamespace feature.
     * <p>
     * Default: false. This field is beta-level and may be disabled with the PodShareProcessNamespace feature.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getShareProcessNamespace() {
        return null;
    }

    /**
     * If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSubdomain() {
        return null;
    }

    /**
     * Optional duration in seconds the pod needs to terminate gracefully.
     * <p>
     * May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
     * <p>
     * Default: 30 seconds.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTerminationGracePeriodSeconds() {
        return null;
    }

    /**
     * If specified, the pod's tolerations.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.Toleration> getTolerations() {
        return null;
    }

    /**
     * List of volumes that can be mounted by containers belonging to the pod.
     * <p>
     * More info: https://kubernetes.io/docs/concepts/storage/volumes
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.Volume> getVolumes() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PodSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PodSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PodSpec> {
        private java.util.List<imports.k8s.Container> containers;
        private java.lang.Number activeDeadlineSeconds;
        private imports.k8s.Affinity affinity;
        private java.lang.Boolean automountServiceAccountToken;
        private imports.k8s.PodDnsConfig dnsConfig;
        private java.lang.String dnsPolicy;
        private java.lang.Boolean enableServiceLinks;
        private java.util.List<imports.k8s.HostAlias> hostAliases;
        private java.lang.Boolean hostIpc;
        private java.lang.String hostname;
        private java.lang.Boolean hostNetwork;
        private java.lang.Boolean hostPid;
        private java.util.List<imports.k8s.LocalObjectReference> imagePullSecrets;
        private java.util.List<imports.k8s.Container> initContainers;
        private java.lang.String nodeName;
        private java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private java.lang.String preemptionPolicy;
        private java.lang.Number priority;
        private java.lang.String priorityClassName;
        private java.util.List<imports.k8s.PodReadinessGate> readinessGates;
        private java.lang.String restartPolicy;
        private java.lang.String runtimeClassName;
        private java.lang.String schedulerName;
        private imports.k8s.PodSecurityContext securityContext;
        private java.lang.String serviceAccount;
        private java.lang.String serviceAccountName;
        private java.lang.Boolean shareProcessNamespace;
        private java.lang.String subdomain;
        private java.lang.Number terminationGracePeriodSeconds;
        private java.util.List<imports.k8s.Toleration> tolerations;
        private java.util.List<imports.k8s.Volume> volumes;

        /**
         * Sets the value of {@link PodSpec#getContainers}
         * @param containers List of containers belonging to the pod. This parameter is required.
         *                   Containers cannot currently be added or removed. There must be at least one container in a Pod. Cannot be updated.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder containers(java.util.List<? extends imports.k8s.Container> containers) {
            this.containers = (java.util.List<imports.k8s.Container>)containers;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getActiveDeadlineSeconds}
         * @param activeDeadlineSeconds Optional duration in seconds the pod may be active on the node relative to StartTime before the system will actively try to mark it failed and kill associated containers.
         *                              Value must be a positive integer.
         * @return {@code this}
         */
        public Builder activeDeadlineSeconds(java.lang.Number activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getAffinity}
         * @param affinity If specified, the pod's scheduling constraints.
         * @return {@code this}
         */
        public Builder affinity(imports.k8s.Affinity affinity) {
            this.affinity = affinity;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getAutomountServiceAccountToken}
         * @param automountServiceAccountToken AutomountServiceAccountToken indicates whether a service account token should be automatically mounted.
         * @return {@code this}
         */
        public Builder automountServiceAccountToken(java.lang.Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getDnsConfig}
         * @param dnsConfig Specifies the DNS parameters of a pod.
         *                  Parameters specified here will be merged to the generated DNS configuration based on DNSPolicy.
         * @return {@code this}
         */
        public Builder dnsConfig(imports.k8s.PodDnsConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getDnsPolicy}
         * @param dnsPolicy Set DNS policy for the pod.
         *                  Defaults to "ClusterFirst". Valid values are 'ClusterFirstWithHostNet', 'ClusterFirst', 'Default' or 'None'. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to 'ClusterFirstWithHostNet'.
         * @return {@code this}
         */
        public Builder dnsPolicy(java.lang.String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getEnableServiceLinks}
         * @param enableServiceLinks EnableServiceLinks indicates whether information about services should be injected into pod's environment variables, matching the syntax of Docker links.
         *                           Optional: Defaults to true.
         * @return {@code this}
         */
        public Builder enableServiceLinks(java.lang.Boolean enableServiceLinks) {
            this.enableServiceLinks = enableServiceLinks;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getHostAliases}
         * @param hostAliases HostAliases is an optional list of hosts and IPs that will be injected into the pod's hosts file if specified.
         *                    This is only valid for non-hostNetwork pods.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder hostAliases(java.util.List<? extends imports.k8s.HostAlias> hostAliases) {
            this.hostAliases = (java.util.List<imports.k8s.HostAlias>)hostAliases;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getHostIpc}
         * @param hostIpc Use the host's ipc namespace.
         *                Optional: Default to false.
         * @return {@code this}
         */
        public Builder hostIpc(java.lang.Boolean hostIpc) {
            this.hostIpc = hostIpc;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getHostname}
         * @param hostname Specifies the hostname of the Pod If not specified, the pod's hostname will be set to a system-defined value.
         * @return {@code this}
         */
        public Builder hostname(java.lang.String hostname) {
            this.hostname = hostname;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getHostNetwork}
         * @param hostNetwork Host networking requested for this pod.
         *                    Use the host's network namespace. If this option is set, the ports that will be used must be specified. Default to false.
         * @return {@code this}
         */
        public Builder hostNetwork(java.lang.Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getHostPid}
         * @param hostPid Use the host's pid namespace.
         *                Optional: Default to false.
         * @return {@code this}
         */
        public Builder hostPid(java.lang.Boolean hostPid) {
            this.hostPid = hostPid;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getImagePullSecrets}
         * @param imagePullSecrets ImagePullSecrets is an optional list of references to secrets in the same namespace to use for pulling any of the images used by this PodSpec.
         *                         If specified, these secrets will be passed to individual puller implementations for them to use. For example, in the case of docker, only DockerConfig type secrets are honored. More info: https://kubernetes.io/docs/concepts/containers/images#specifying-imagepullsecrets-on-a-pod
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder imagePullSecrets(java.util.List<? extends imports.k8s.LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = (java.util.List<imports.k8s.LocalObjectReference>)imagePullSecrets;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getInitContainers}
         * @param initContainers List of initialization containers belonging to the pod.
         *                       Init containers are executed in order prior to containers being started. If any init container fails, the pod is considered to have failed and is handled according to its restartPolicy. The name for an init container or normal container must be unique among all containers. Init containers may not have Lifecycle actions, Readiness probes, or Liveness probes. The resourceRequirements of an init container are taken into account during scheduling by finding the highest request/limit for each resource type, and then using the max of of that value or the sum of the normal containers. Limits are applied to init containers in a similar fashion. Init containers cannot currently be added or removed. Cannot be updated. More info: https://kubernetes.io/docs/concepts/workloads/pods/init-containers/
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder initContainers(java.util.List<? extends imports.k8s.Container> initContainers) {
            this.initContainers = (java.util.List<imports.k8s.Container>)initContainers;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getNodeName}
         * @param nodeName NodeName is a request to schedule this pod onto a specific node.
         *                 If it is non-empty, the scheduler simply schedules this pod onto that node, assuming that it fits resource requirements.
         * @return {@code this}
         */
        public Builder nodeName(java.lang.String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getNodeSelector}
         * @param nodeSelector NodeSelector is a selector which must be true for the pod to fit on a node.
         *                     Selector which must match a node's labels for the pod to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/
         * @return {@code this}
         */
        public Builder nodeSelector(java.util.Map<java.lang.String, java.lang.String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getPreemptionPolicy}
         * @param preemptionPolicy PreemptionPolicy is the Policy for preempting pods with lower priority.
         *                         One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level and is only honored by servers that enable the NonPreemptingPriority feature.
         * @return {@code this}
         */
        public Builder preemptionPolicy(java.lang.String preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getPriority}
         * @param priority The priority value.
         *                 Various system components use this field to find the priority of the pod. When Priority Admission Controller is enabled, it prevents users from setting this field. The admission controller populates this field from PriorityClassName. The higher the value, the higher the priority.
         * @return {@code this}
         */
        public Builder priority(java.lang.Number priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getPriorityClassName}
         * @param priorityClassName If specified, indicates the pod's priority.
         *                          "system-node-critical" and "system-cluster-critical" are two special keywords which indicate the highest priorities with the former being the highest priority. Any other name must be defined by creating a PriorityClass object with that name. If not specified, the pod priority will be default or zero if there is no default.
         * @return {@code this}
         */
        public Builder priorityClassName(java.lang.String priorityClassName) {
            this.priorityClassName = priorityClassName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getReadinessGates}
         * @param readinessGates If specified, all readiness gates will be evaluated for pod readiness.
         *                       A pod is ready when all its containers are ready AND all conditions specified in the readiness gates have status equal to "True" More info: https://git.k8s.io/enhancements/keps/sig-network/0007-pod-ready%2B%2B.md
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder readinessGates(java.util.List<? extends imports.k8s.PodReadinessGate> readinessGates) {
            this.readinessGates = (java.util.List<imports.k8s.PodReadinessGate>)readinessGates;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getRestartPolicy}
         * @param restartPolicy Restart policy for all containers within the pod.
         *                      One of Always, OnFailure, Never. Default to Always. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle/#restart-policy
         * @return {@code this}
         */
        public Builder restartPolicy(java.lang.String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getRuntimeClassName}
         * @param runtimeClassName RuntimeClassName refers to a RuntimeClass object in the node.k8s.io group, which should be used to run this pod.  If no RuntimeClass resource matches the named class, the pod will not be run. If unset or empty, the "legacy" RuntimeClass will be used, which is an implicit class with an empty definition that uses the default runtime handler. More info: https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md This is a beta feature as of Kubernetes v1.14.
         * @return {@code this}
         */
        public Builder runtimeClassName(java.lang.String runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getSchedulerName}
         * @param schedulerName If specified, the pod will be dispatched by specified scheduler.
         *                      If not specified, the pod will be dispatched by default scheduler.
         * @return {@code this}
         */
        public Builder schedulerName(java.lang.String schedulerName) {
            this.schedulerName = schedulerName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getSecurityContext}
         * @param securityContext SecurityContext holds pod-level security attributes and common container settings.
         *                        Optional: Defaults to empty.  See type description for default values of each field.
         * @return {@code this}
         */
        public Builder securityContext(imports.k8s.PodSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getServiceAccount}
         * @param serviceAccount DeprecatedServiceAccount is a depreciated alias for ServiceAccountName.
         *                       Deprecated: Use serviceAccountName instead.
         * @return {@code this}
         */
        public Builder serviceAccount(java.lang.String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getServiceAccountName}
         * @param serviceAccountName ServiceAccountName is the name of the ServiceAccount to use to run this pod.
         *                           More info: https://kubernetes.io/docs/tasks/configure-pod-container/configure-service-account/
         * @return {@code this}
         */
        public Builder serviceAccountName(java.lang.String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getShareProcessNamespace}
         * @param shareProcessNamespace Share a single process namespace between all of the containers in a pod.
         *                              When this is set containers will be able to view and signal processes from other containers in the same pod, and the first process in each container will not be assigned PID 1. HostPID and ShareProcessNamespace cannot both be set. Optional: Default to false. This field is beta-level and may be disabled with the PodShareProcessNamespace feature.
         * @return {@code this}
         */
        public Builder shareProcessNamespace(java.lang.Boolean shareProcessNamespace) {
            this.shareProcessNamespace = shareProcessNamespace;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getSubdomain}
         * @param subdomain If specified, the fully qualified Pod hostname will be "<hostname>.<subdomain>.<pod namespace>.svc.<cluster domain>". If not specified, the pod will not have a domainname at all.
         * @return {@code this}
         */
        public Builder subdomain(java.lang.String subdomain) {
            this.subdomain = subdomain;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getTerminationGracePeriodSeconds}
         * @param terminationGracePeriodSeconds Optional duration in seconds the pod needs to terminate gracefully.
         *                                      May be decreased in delete request. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period will be used instead. The grace period is the duration in seconds after the processes running in the pod are sent a termination signal and the time when the processes are forcibly halted with a kill signal. Set this value longer than the expected cleanup time for your process. Defaults to 30 seconds.
         * @return {@code this}
         */
        public Builder terminationGracePeriodSeconds(java.lang.Number terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getTolerations}
         * @param tolerations If specified, the pod's tolerations.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder tolerations(java.util.List<? extends imports.k8s.Toleration> tolerations) {
            this.tolerations = (java.util.List<imports.k8s.Toleration>)tolerations;
            return this;
        }

        /**
         * Sets the value of {@link PodSpec#getVolumes}
         * @param volumes List of volumes that can be mounted by containers belonging to the pod.
         *                More info: https://kubernetes.io/docs/concepts/storage/volumes
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder volumes(java.util.List<? extends imports.k8s.Volume> volumes) {
            this.volumes = (java.util.List<imports.k8s.Volume>)volumes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PodSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PodSpec build() {
            return new Jsii$Proxy(containers, activeDeadlineSeconds, affinity, automountServiceAccountToken, dnsConfig, dnsPolicy, enableServiceLinks, hostAliases, hostIpc, hostname, hostNetwork, hostPid, imagePullSecrets, initContainers, nodeName, nodeSelector, preemptionPolicy, priority, priorityClassName, readinessGates, restartPolicy, runtimeClassName, schedulerName, securityContext, serviceAccount, serviceAccountName, shareProcessNamespace, subdomain, terminationGracePeriodSeconds, tolerations, volumes);
        }
    }

    /**
     * An implementation for {@link PodSpec}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PodSpec {
        private final java.util.List<imports.k8s.Container> containers;
        private final java.lang.Number activeDeadlineSeconds;
        private final imports.k8s.Affinity affinity;
        private final java.lang.Boolean automountServiceAccountToken;
        private final imports.k8s.PodDnsConfig dnsConfig;
        private final java.lang.String dnsPolicy;
        private final java.lang.Boolean enableServiceLinks;
        private final java.util.List<imports.k8s.HostAlias> hostAliases;
        private final java.lang.Boolean hostIpc;
        private final java.lang.String hostname;
        private final java.lang.Boolean hostNetwork;
        private final java.lang.Boolean hostPid;
        private final java.util.List<imports.k8s.LocalObjectReference> imagePullSecrets;
        private final java.util.List<imports.k8s.Container> initContainers;
        private final java.lang.String nodeName;
        private final java.util.Map<java.lang.String, java.lang.String> nodeSelector;
        private final java.lang.String preemptionPolicy;
        private final java.lang.Number priority;
        private final java.lang.String priorityClassName;
        private final java.util.List<imports.k8s.PodReadinessGate> readinessGates;
        private final java.lang.String restartPolicy;
        private final java.lang.String runtimeClassName;
        private final java.lang.String schedulerName;
        private final imports.k8s.PodSecurityContext securityContext;
        private final java.lang.String serviceAccount;
        private final java.lang.String serviceAccountName;
        private final java.lang.Boolean shareProcessNamespace;
        private final java.lang.String subdomain;
        private final java.lang.Number terminationGracePeriodSeconds;
        private final java.util.List<imports.k8s.Toleration> tolerations;
        private final java.util.List<imports.k8s.Volume> volumes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.containers = software.amazon.jsii.Kernel.get(this, "containers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Container.class)));
            this.activeDeadlineSeconds = software.amazon.jsii.Kernel.get(this, "activeDeadlineSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.affinity = software.amazon.jsii.Kernel.get(this, "affinity", software.amazon.jsii.NativeType.forClass(imports.k8s.Affinity.class));
            this.automountServiceAccountToken = software.amazon.jsii.Kernel.get(this, "automountServiceAccountToken", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.dnsConfig = software.amazon.jsii.Kernel.get(this, "dnsConfig", software.amazon.jsii.NativeType.forClass(imports.k8s.PodDnsConfig.class));
            this.dnsPolicy = software.amazon.jsii.Kernel.get(this, "dnsPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.enableServiceLinks = software.amazon.jsii.Kernel.get(this, "enableServiceLinks", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hostAliases = software.amazon.jsii.Kernel.get(this, "hostAliases", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.HostAlias.class)));
            this.hostIpc = software.amazon.jsii.Kernel.get(this, "hostIPC", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hostname = software.amazon.jsii.Kernel.get(this, "hostname", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.hostNetwork = software.amazon.jsii.Kernel.get(this, "hostNetwork", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.hostPid = software.amazon.jsii.Kernel.get(this, "hostPID", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.imagePullSecrets = software.amazon.jsii.Kernel.get(this, "imagePullSecrets", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.LocalObjectReference.class)));
            this.initContainers = software.amazon.jsii.Kernel.get(this, "initContainers", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Container.class)));
            this.nodeName = software.amazon.jsii.Kernel.get(this, "nodeName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.nodeSelector = software.amazon.jsii.Kernel.get(this, "nodeSelector", software.amazon.jsii.NativeType.mapOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.preemptionPolicy = software.amazon.jsii.Kernel.get(this, "preemptionPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.priority = software.amazon.jsii.Kernel.get(this, "priority", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.priorityClassName = software.amazon.jsii.Kernel.get(this, "priorityClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.readinessGates = software.amazon.jsii.Kernel.get(this, "readinessGates", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.PodReadinessGate.class)));
            this.restartPolicy = software.amazon.jsii.Kernel.get(this, "restartPolicy", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.runtimeClassName = software.amazon.jsii.Kernel.get(this, "runtimeClassName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.schedulerName = software.amazon.jsii.Kernel.get(this, "schedulerName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.securityContext = software.amazon.jsii.Kernel.get(this, "securityContext", software.amazon.jsii.NativeType.forClass(imports.k8s.PodSecurityContext.class));
            this.serviceAccount = software.amazon.jsii.Kernel.get(this, "serviceAccount", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.serviceAccountName = software.amazon.jsii.Kernel.get(this, "serviceAccountName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.shareProcessNamespace = software.amazon.jsii.Kernel.get(this, "shareProcessNamespace", software.amazon.jsii.NativeType.forClass(java.lang.Boolean.class));
            this.subdomain = software.amazon.jsii.Kernel.get(this, "subdomain", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.terminationGracePeriodSeconds = software.amazon.jsii.Kernel.get(this, "terminationGracePeriodSeconds", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.tolerations = software.amazon.jsii.Kernel.get(this, "tolerations", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Toleration.class)));
            this.volumes = software.amazon.jsii.Kernel.get(this, "volumes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Volume.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.k8s.Container> containers, final java.lang.Number activeDeadlineSeconds, final imports.k8s.Affinity affinity, final java.lang.Boolean automountServiceAccountToken, final imports.k8s.PodDnsConfig dnsConfig, final java.lang.String dnsPolicy, final java.lang.Boolean enableServiceLinks, final java.util.List<? extends imports.k8s.HostAlias> hostAliases, final java.lang.Boolean hostIpc, final java.lang.String hostname, final java.lang.Boolean hostNetwork, final java.lang.Boolean hostPid, final java.util.List<? extends imports.k8s.LocalObjectReference> imagePullSecrets, final java.util.List<? extends imports.k8s.Container> initContainers, final java.lang.String nodeName, final java.util.Map<java.lang.String, java.lang.String> nodeSelector, final java.lang.String preemptionPolicy, final java.lang.Number priority, final java.lang.String priorityClassName, final java.util.List<? extends imports.k8s.PodReadinessGate> readinessGates, final java.lang.String restartPolicy, final java.lang.String runtimeClassName, final java.lang.String schedulerName, final imports.k8s.PodSecurityContext securityContext, final java.lang.String serviceAccount, final java.lang.String serviceAccountName, final java.lang.Boolean shareProcessNamespace, final java.lang.String subdomain, final java.lang.Number terminationGracePeriodSeconds, final java.util.List<? extends imports.k8s.Toleration> tolerations, final java.util.List<? extends imports.k8s.Volume> volumes) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.containers = (java.util.List<imports.k8s.Container>)java.util.Objects.requireNonNull(containers, "containers is required");
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            this.affinity = affinity;
            this.automountServiceAccountToken = automountServiceAccountToken;
            this.dnsConfig = dnsConfig;
            this.dnsPolicy = dnsPolicy;
            this.enableServiceLinks = enableServiceLinks;
            this.hostAliases = (java.util.List<imports.k8s.HostAlias>)hostAliases;
            this.hostIpc = hostIpc;
            this.hostname = hostname;
            this.hostNetwork = hostNetwork;
            this.hostPid = hostPid;
            this.imagePullSecrets = (java.util.List<imports.k8s.LocalObjectReference>)imagePullSecrets;
            this.initContainers = (java.util.List<imports.k8s.Container>)initContainers;
            this.nodeName = nodeName;
            this.nodeSelector = nodeSelector;
            this.preemptionPolicy = preemptionPolicy;
            this.priority = priority;
            this.priorityClassName = priorityClassName;
            this.readinessGates = (java.util.List<imports.k8s.PodReadinessGate>)readinessGates;
            this.restartPolicy = restartPolicy;
            this.runtimeClassName = runtimeClassName;
            this.schedulerName = schedulerName;
            this.securityContext = securityContext;
            this.serviceAccount = serviceAccount;
            this.serviceAccountName = serviceAccountName;
            this.shareProcessNamespace = shareProcessNamespace;
            this.subdomain = subdomain;
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            this.tolerations = (java.util.List<imports.k8s.Toleration>)tolerations;
            this.volumes = (java.util.List<imports.k8s.Volume>)volumes;
        }

        @Override
        public final java.util.List<imports.k8s.Container> getContainers() {
            return this.containers;
        }

        @Override
        public final java.lang.Number getActiveDeadlineSeconds() {
            return this.activeDeadlineSeconds;
        }

        @Override
        public final imports.k8s.Affinity getAffinity() {
            return this.affinity;
        }

        @Override
        public final java.lang.Boolean getAutomountServiceAccountToken() {
            return this.automountServiceAccountToken;
        }

        @Override
        public final imports.k8s.PodDnsConfig getDnsConfig() {
            return this.dnsConfig;
        }

        @Override
        public final java.lang.String getDnsPolicy() {
            return this.dnsPolicy;
        }

        @Override
        public final java.lang.Boolean getEnableServiceLinks() {
            return this.enableServiceLinks;
        }

        @Override
        public final java.util.List<imports.k8s.HostAlias> getHostAliases() {
            return this.hostAliases;
        }

        @Override
        public final java.lang.Boolean getHostIpc() {
            return this.hostIpc;
        }

        @Override
        public final java.lang.String getHostname() {
            return this.hostname;
        }

        @Override
        public final java.lang.Boolean getHostNetwork() {
            return this.hostNetwork;
        }

        @Override
        public final java.lang.Boolean getHostPid() {
            return this.hostPid;
        }

        @Override
        public final java.util.List<imports.k8s.LocalObjectReference> getImagePullSecrets() {
            return this.imagePullSecrets;
        }

        @Override
        public final java.util.List<imports.k8s.Container> getInitContainers() {
            return this.initContainers;
        }

        @Override
        public final java.lang.String getNodeName() {
            return this.nodeName;
        }

        @Override
        public final java.util.Map<java.lang.String, java.lang.String> getNodeSelector() {
            return this.nodeSelector;
        }

        @Override
        public final java.lang.String getPreemptionPolicy() {
            return this.preemptionPolicy;
        }

        @Override
        public final java.lang.Number getPriority() {
            return this.priority;
        }

        @Override
        public final java.lang.String getPriorityClassName() {
            return this.priorityClassName;
        }

        @Override
        public final java.util.List<imports.k8s.PodReadinessGate> getReadinessGates() {
            return this.readinessGates;
        }

        @Override
        public final java.lang.String getRestartPolicy() {
            return this.restartPolicy;
        }

        @Override
        public final java.lang.String getRuntimeClassName() {
            return this.runtimeClassName;
        }

        @Override
        public final java.lang.String getSchedulerName() {
            return this.schedulerName;
        }

        @Override
        public final imports.k8s.PodSecurityContext getSecurityContext() {
            return this.securityContext;
        }

        @Override
        public final java.lang.String getServiceAccount() {
            return this.serviceAccount;
        }

        @Override
        public final java.lang.String getServiceAccountName() {
            return this.serviceAccountName;
        }

        @Override
        public final java.lang.Boolean getShareProcessNamespace() {
            return this.shareProcessNamespace;
        }

        @Override
        public final java.lang.String getSubdomain() {
            return this.subdomain;
        }

        @Override
        public final java.lang.Number getTerminationGracePeriodSeconds() {
            return this.terminationGracePeriodSeconds;
        }

        @Override
        public final java.util.List<imports.k8s.Toleration> getTolerations() {
            return this.tolerations;
        }

        @Override
        public final java.util.List<imports.k8s.Volume> getVolumes() {
            return this.volumes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("containers", om.valueToTree(this.getContainers()));
            if (this.getActiveDeadlineSeconds() != null) {
                data.set("activeDeadlineSeconds", om.valueToTree(this.getActiveDeadlineSeconds()));
            }
            if (this.getAffinity() != null) {
                data.set("affinity", om.valueToTree(this.getAffinity()));
            }
            if (this.getAutomountServiceAccountToken() != null) {
                data.set("automountServiceAccountToken", om.valueToTree(this.getAutomountServiceAccountToken()));
            }
            if (this.getDnsConfig() != null) {
                data.set("dnsConfig", om.valueToTree(this.getDnsConfig()));
            }
            if (this.getDnsPolicy() != null) {
                data.set("dnsPolicy", om.valueToTree(this.getDnsPolicy()));
            }
            if (this.getEnableServiceLinks() != null) {
                data.set("enableServiceLinks", om.valueToTree(this.getEnableServiceLinks()));
            }
            if (this.getHostAliases() != null) {
                data.set("hostAliases", om.valueToTree(this.getHostAliases()));
            }
            if (this.getHostIpc() != null) {
                data.set("hostIPC", om.valueToTree(this.getHostIpc()));
            }
            if (this.getHostname() != null) {
                data.set("hostname", om.valueToTree(this.getHostname()));
            }
            if (this.getHostNetwork() != null) {
                data.set("hostNetwork", om.valueToTree(this.getHostNetwork()));
            }
            if (this.getHostPid() != null) {
                data.set("hostPID", om.valueToTree(this.getHostPid()));
            }
            if (this.getImagePullSecrets() != null) {
                data.set("imagePullSecrets", om.valueToTree(this.getImagePullSecrets()));
            }
            if (this.getInitContainers() != null) {
                data.set("initContainers", om.valueToTree(this.getInitContainers()));
            }
            if (this.getNodeName() != null) {
                data.set("nodeName", om.valueToTree(this.getNodeName()));
            }
            if (this.getNodeSelector() != null) {
                data.set("nodeSelector", om.valueToTree(this.getNodeSelector()));
            }
            if (this.getPreemptionPolicy() != null) {
                data.set("preemptionPolicy", om.valueToTree(this.getPreemptionPolicy()));
            }
            if (this.getPriority() != null) {
                data.set("priority", om.valueToTree(this.getPriority()));
            }
            if (this.getPriorityClassName() != null) {
                data.set("priorityClassName", om.valueToTree(this.getPriorityClassName()));
            }
            if (this.getReadinessGates() != null) {
                data.set("readinessGates", om.valueToTree(this.getReadinessGates()));
            }
            if (this.getRestartPolicy() != null) {
                data.set("restartPolicy", om.valueToTree(this.getRestartPolicy()));
            }
            if (this.getRuntimeClassName() != null) {
                data.set("runtimeClassName", om.valueToTree(this.getRuntimeClassName()));
            }
            if (this.getSchedulerName() != null) {
                data.set("schedulerName", om.valueToTree(this.getSchedulerName()));
            }
            if (this.getSecurityContext() != null) {
                data.set("securityContext", om.valueToTree(this.getSecurityContext()));
            }
            if (this.getServiceAccount() != null) {
                data.set("serviceAccount", om.valueToTree(this.getServiceAccount()));
            }
            if (this.getServiceAccountName() != null) {
                data.set("serviceAccountName", om.valueToTree(this.getServiceAccountName()));
            }
            if (this.getShareProcessNamespace() != null) {
                data.set("shareProcessNamespace", om.valueToTree(this.getShareProcessNamespace()));
            }
            if (this.getSubdomain() != null) {
                data.set("subdomain", om.valueToTree(this.getSubdomain()));
            }
            if (this.getTerminationGracePeriodSeconds() != null) {
                data.set("terminationGracePeriodSeconds", om.valueToTree(this.getTerminationGracePeriodSeconds()));
            }
            if (this.getTolerations() != null) {
                data.set("tolerations", om.valueToTree(this.getTolerations()));
            }
            if (this.getVolumes() != null) {
                data.set("volumes", om.valueToTree(this.getVolumes()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PodSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PodSpec.Jsii$Proxy that = (PodSpec.Jsii$Proxy) o;

            if (!containers.equals(that.containers)) return false;
            if (this.activeDeadlineSeconds != null ? !this.activeDeadlineSeconds.equals(that.activeDeadlineSeconds) : that.activeDeadlineSeconds != null) return false;
            if (this.affinity != null ? !this.affinity.equals(that.affinity) : that.affinity != null) return false;
            if (this.automountServiceAccountToken != null ? !this.automountServiceAccountToken.equals(that.automountServiceAccountToken) : that.automountServiceAccountToken != null) return false;
            if (this.dnsConfig != null ? !this.dnsConfig.equals(that.dnsConfig) : that.dnsConfig != null) return false;
            if (this.dnsPolicy != null ? !this.dnsPolicy.equals(that.dnsPolicy) : that.dnsPolicy != null) return false;
            if (this.enableServiceLinks != null ? !this.enableServiceLinks.equals(that.enableServiceLinks) : that.enableServiceLinks != null) return false;
            if (this.hostAliases != null ? !this.hostAliases.equals(that.hostAliases) : that.hostAliases != null) return false;
            if (this.hostIpc != null ? !this.hostIpc.equals(that.hostIpc) : that.hostIpc != null) return false;
            if (this.hostname != null ? !this.hostname.equals(that.hostname) : that.hostname != null) return false;
            if (this.hostNetwork != null ? !this.hostNetwork.equals(that.hostNetwork) : that.hostNetwork != null) return false;
            if (this.hostPid != null ? !this.hostPid.equals(that.hostPid) : that.hostPid != null) return false;
            if (this.imagePullSecrets != null ? !this.imagePullSecrets.equals(that.imagePullSecrets) : that.imagePullSecrets != null) return false;
            if (this.initContainers != null ? !this.initContainers.equals(that.initContainers) : that.initContainers != null) return false;
            if (this.nodeName != null ? !this.nodeName.equals(that.nodeName) : that.nodeName != null) return false;
            if (this.nodeSelector != null ? !this.nodeSelector.equals(that.nodeSelector) : that.nodeSelector != null) return false;
            if (this.preemptionPolicy != null ? !this.preemptionPolicy.equals(that.preemptionPolicy) : that.preemptionPolicy != null) return false;
            if (this.priority != null ? !this.priority.equals(that.priority) : that.priority != null) return false;
            if (this.priorityClassName != null ? !this.priorityClassName.equals(that.priorityClassName) : that.priorityClassName != null) return false;
            if (this.readinessGates != null ? !this.readinessGates.equals(that.readinessGates) : that.readinessGates != null) return false;
            if (this.restartPolicy != null ? !this.restartPolicy.equals(that.restartPolicy) : that.restartPolicy != null) return false;
            if (this.runtimeClassName != null ? !this.runtimeClassName.equals(that.runtimeClassName) : that.runtimeClassName != null) return false;
            if (this.schedulerName != null ? !this.schedulerName.equals(that.schedulerName) : that.schedulerName != null) return false;
            if (this.securityContext != null ? !this.securityContext.equals(that.securityContext) : that.securityContext != null) return false;
            if (this.serviceAccount != null ? !this.serviceAccount.equals(that.serviceAccount) : that.serviceAccount != null) return false;
            if (this.serviceAccountName != null ? !this.serviceAccountName.equals(that.serviceAccountName) : that.serviceAccountName != null) return false;
            if (this.shareProcessNamespace != null ? !this.shareProcessNamespace.equals(that.shareProcessNamespace) : that.shareProcessNamespace != null) return false;
            if (this.subdomain != null ? !this.subdomain.equals(that.subdomain) : that.subdomain != null) return false;
            if (this.terminationGracePeriodSeconds != null ? !this.terminationGracePeriodSeconds.equals(that.terminationGracePeriodSeconds) : that.terminationGracePeriodSeconds != null) return false;
            if (this.tolerations != null ? !this.tolerations.equals(that.tolerations) : that.tolerations != null) return false;
            return this.volumes != null ? this.volumes.equals(that.volumes) : that.volumes == null;
        }

        @Override
        public final int hashCode() {
            int result = this.containers.hashCode();
            result = 31 * result + (this.activeDeadlineSeconds != null ? this.activeDeadlineSeconds.hashCode() : 0);
            result = 31 * result + (this.affinity != null ? this.affinity.hashCode() : 0);
            result = 31 * result + (this.automountServiceAccountToken != null ? this.automountServiceAccountToken.hashCode() : 0);
            result = 31 * result + (this.dnsConfig != null ? this.dnsConfig.hashCode() : 0);
            result = 31 * result + (this.dnsPolicy != null ? this.dnsPolicy.hashCode() : 0);
            result = 31 * result + (this.enableServiceLinks != null ? this.enableServiceLinks.hashCode() : 0);
            result = 31 * result + (this.hostAliases != null ? this.hostAliases.hashCode() : 0);
            result = 31 * result + (this.hostIpc != null ? this.hostIpc.hashCode() : 0);
            result = 31 * result + (this.hostname != null ? this.hostname.hashCode() : 0);
            result = 31 * result + (this.hostNetwork != null ? this.hostNetwork.hashCode() : 0);
            result = 31 * result + (this.hostPid != null ? this.hostPid.hashCode() : 0);
            result = 31 * result + (this.imagePullSecrets != null ? this.imagePullSecrets.hashCode() : 0);
            result = 31 * result + (this.initContainers != null ? this.initContainers.hashCode() : 0);
            result = 31 * result + (this.nodeName != null ? this.nodeName.hashCode() : 0);
            result = 31 * result + (this.nodeSelector != null ? this.nodeSelector.hashCode() : 0);
            result = 31 * result + (this.preemptionPolicy != null ? this.preemptionPolicy.hashCode() : 0);
            result = 31 * result + (this.priority != null ? this.priority.hashCode() : 0);
            result = 31 * result + (this.priorityClassName != null ? this.priorityClassName.hashCode() : 0);
            result = 31 * result + (this.readinessGates != null ? this.readinessGates.hashCode() : 0);
            result = 31 * result + (this.restartPolicy != null ? this.restartPolicy.hashCode() : 0);
            result = 31 * result + (this.runtimeClassName != null ? this.runtimeClassName.hashCode() : 0);
            result = 31 * result + (this.schedulerName != null ? this.schedulerName.hashCode() : 0);
            result = 31 * result + (this.securityContext != null ? this.securityContext.hashCode() : 0);
            result = 31 * result + (this.serviceAccount != null ? this.serviceAccount.hashCode() : 0);
            result = 31 * result + (this.serviceAccountName != null ? this.serviceAccountName.hashCode() : 0);
            result = 31 * result + (this.shareProcessNamespace != null ? this.shareProcessNamespace.hashCode() : 0);
            result = 31 * result + (this.subdomain != null ? this.subdomain.hashCode() : 0);
            result = 31 * result + (this.terminationGracePeriodSeconds != null ? this.terminationGracePeriodSeconds.hashCode() : 0);
            result = 31 * result + (this.tolerations != null ? this.tolerations.hashCode() : 0);
            result = 31 * result + (this.volumes != null ? this.volumes.hashCode() : 0);
            return result;
        }
    }
}
