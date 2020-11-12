package imports.k8s;

/**
 * ResourceQuotaList is a list of ResourceQuota items.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.345Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ResourceQuotaList")
public class ResourceQuotaList extends org.cdk8s.ApiObject {

    protected ResourceQuotaList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected ResourceQuotaList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.core.v1.ResourceQuotaList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public ResourceQuotaList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.ResourceQuotaListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.ResourceQuotaList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.ResourceQuotaList> {
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
        private final imports.k8s.ResourceQuotaListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.ResourceQuotaListOptions.Builder();
        }

        /**
         * Items is a list of ResourceQuota objects.
         * <p>
         * More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
         * <p>
         * @return {@code this}
         * @param items Items is a list of ResourceQuota objects. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.ResourceQuota> items) {
            this.options.items(items);
            return this;
        }

        /**
         * Standard list metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
         * <p>
         * @return {@code this}
         * @param metadata Standard list metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.ResourceQuotaList}.
         */
        @Override
        public imports.k8s.ResourceQuotaList build() {
            return new imports.k8s.ResourceQuotaList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
