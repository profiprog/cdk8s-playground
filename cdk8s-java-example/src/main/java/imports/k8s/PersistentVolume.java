package imports.k8s;

/**
 * PersistentVolume (PV) is a storage resource provisioned by an administrator.
 * <p>
 * It is analogous to a node. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.301Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PersistentVolume")
public class PersistentVolume extends org.cdk8s.ApiObject {

    protected PersistentVolume(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected PersistentVolume(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.core.v1.PersistentVolume" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options.
     */
    public PersistentVolume(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.Nullable imports.k8s.PersistentVolumeOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), options });
    }

    /**
     * Defines a "io.k8s.api.core.v1.PersistentVolume" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     */
    public PersistentVolume(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.PersistentVolume}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.PersistentVolume> {
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
        private imports.k8s.PersistentVolumeOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
        }

        /**
         * Standard object's metadata.
         * <p>
         * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * <p>
         * @return {@code this}
         * @param metadata Standard object's metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ObjectMeta metadata) {
            this.options().metadata(metadata);
            return this;
        }

        /**
         * Spec defines a specification of a persistent volume owned by the cluster.
         * <p>
         * Provisioned by an administrator. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistent-volumes
         * <p>
         * @return {@code this}
         * @param spec Spec defines a specification of a persistent volume owned by the cluster. This parameter is required.
         */
        public Builder spec(final imports.k8s.PersistentVolumeSpec spec) {
            this.options().spec(spec);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.PersistentVolume}.
         */
        @Override
        public imports.k8s.PersistentVolume build() {
            return new imports.k8s.PersistentVolume(
                this.scope,
                this.name,
                this.options != null ? this.options.build() : null
            );
        }

        private imports.k8s.PersistentVolumeOptions.Builder options() {
            if (this.options == null) {
                this.options = new imports.k8s.PersistentVolumeOptions.Builder();
            }
            return this.options;
        }
    }
}
