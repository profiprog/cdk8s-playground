package imports.k8s;

/**
 * Represents a Photon Controller persistent disk resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.307Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PhotonPersistentDiskVolumeSource")
@software.amazon.jsii.Jsii.Proxy(PhotonPersistentDiskVolumeSource.Jsii$Proxy.class)
public interface PhotonPersistentDiskVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * ID that identifies Photon Controller persistent disk.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getPdId();

    /**
     * Filesystem type to mount.
     * <p>
     * Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PhotonPersistentDiskVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PhotonPersistentDiskVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PhotonPersistentDiskVolumeSource> {
        private java.lang.String pdId;
        private java.lang.String fsType;

        /**
         * Sets the value of {@link PhotonPersistentDiskVolumeSource#getPdId}
         * @param pdId ID that identifies Photon Controller persistent disk. This parameter is required.
         * @return {@code this}
         */
        public Builder pdId(java.lang.String pdId) {
            this.pdId = pdId;
            return this;
        }

        /**
         * Sets the value of {@link PhotonPersistentDiskVolumeSource#getFsType}
         * @param fsType Filesystem type to mount.
         *               Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PhotonPersistentDiskVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PhotonPersistentDiskVolumeSource build() {
            return new Jsii$Proxy(pdId, fsType);
        }
    }

    /**
     * An implementation for {@link PhotonPersistentDiskVolumeSource}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PhotonPersistentDiskVolumeSource {
        private final java.lang.String pdId;
        private final java.lang.String fsType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pdId = software.amazon.jsii.Kernel.get(this, "pdID", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fsType = software.amazon.jsii.Kernel.get(this, "fsType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String pdId, final java.lang.String fsType) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pdId = java.util.Objects.requireNonNull(pdId, "pdId is required");
            this.fsType = fsType;
        }

        @Override
        public final java.lang.String getPdId() {
            return this.pdId;
        }

        @Override
        public final java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("pdID", om.valueToTree(this.getPdId()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PhotonPersistentDiskVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PhotonPersistentDiskVolumeSource.Jsii$Proxy that = (PhotonPersistentDiskVolumeSource.Jsii$Proxy) o;

            if (!pdId.equals(that.pdId)) return false;
            return this.fsType != null ? this.fsType.equals(that.fsType) : that.fsType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.pdId.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            return result;
        }
    }
}
