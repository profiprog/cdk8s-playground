package imports.k8s;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.128Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ClusterRole")
public class ClusterRole extends org.cdk8s.ApiObject {

    protected ClusterRole(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ClusterRole(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.rbac.v1.ClusterRole" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public ClusterRole(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable imports.k8s.ClusterRoleOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.rbac.v1.ClusterRole" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public ClusterRole(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.ClusterRole}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.ClusterRole> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private imports.k8s.ClusterRoleOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole.
         * <p>
         * If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
         * <p>
         * @return {@code this}
         * @param aggregationRule AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. This parameter is required.
         */
        public Builder aggregationRule(final imports.k8s.AggregationRule aggregationRule) {
            this.options().aggregationRule(aggregationRule);
            return this;
        }

        /**
         * Standard object's metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * Rules holds all the PolicyRules for this ClusterRole.
         * <p>
         * @return {@code this}
         * @param rules Rules holds all the PolicyRules for this ClusterRole. This parameter is required.
         */
        public Builder rules(final java.util.List<? extends imports.k8s.PolicyRule> rules) {
            this.options().rules(rules);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.ClusterRole}.
         */
        @Override
        public imports.k8s.ClusterRole build() {
            return new imports.k8s.ClusterRole(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private imports.k8s.ClusterRoleOptions.Builder options() {
            if (this.options == null) {
                this.options = new imports.k8s.ClusterRoleOptions.Builder();
            }
            return this.options;
        }
    }
}
