package imports.k8s;

/**
 * MutatingWebhookConfigurationList is a list of MutatingWebhookConfiguration.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.270Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MutatingWebhookConfigurationList")
public class MutatingWebhookConfigurationList extends org.cdk8s.ApiObject {

    protected MutatingWebhookConfigurationList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected MutatingWebhookConfigurationList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.admissionregistration.v1beta1.MutatingWebhookConfigurationList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public MutatingWebhookConfigurationList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.MutatingWebhookConfigurationListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.MutatingWebhookConfigurationList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.MutatingWebhookConfigurationList> {
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
        private final imports.k8s.MutatingWebhookConfigurationListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.MutatingWebhookConfigurationListOptions.Builder();
        }

        /**
         * List of MutatingWebhookConfiguration.
         * <p>
         * @return {@code this}
         * @param items List of MutatingWebhookConfiguration. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.MutatingWebhookConfiguration> items) {
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
         * @returns a newly built instance of {@link imports.k8s.MutatingWebhookConfigurationList}.
         */
        @Override
        public imports.k8s.MutatingWebhookConfigurationList build() {
            return new imports.k8s.MutatingWebhookConfigurationList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
