package imports.k8s;

/**
 * Lease defines a lease concept.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.251Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Lease")
public class Lease extends org.cdk8s.ApiObject {

    protected Lease(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected Lease(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.coordination.v1.Lease" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public Lease(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable imports.k8s.LeaseOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.coordination.v1.Lease" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public Lease(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.Lease}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.Lease> {
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
        private imports.k8s.LeaseOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
         * <p>
         * @return {@code this}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * Specification of the Lease.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
         * <p>
         * @return {@code this}
         * @param spec Specification of the Lease. This parameter is required.
         */
        public Builder spec(final imports.k8s.LeaseSpec spec) {
            this.options().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.Lease}.
         */
        @Override
        public imports.k8s.Lease build() {
            return new imports.k8s.Lease(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private imports.k8s.LeaseOptions.Builder options() {
            if (this.options == null) {
                this.options = new imports.k8s.LeaseOptions.Builder();
            }
            return this.options;
        }
    }
}
