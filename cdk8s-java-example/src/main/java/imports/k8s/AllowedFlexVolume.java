package imports.k8s;

/**
 * AllowedFlexVolume represents a single Flexvolume that is allowed to be used.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.097Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.AllowedFlexVolume")
@software.amazon.jsii.Jsii.Proxy(AllowedFlexVolume.Jsii$Proxy.class)
public interface AllowedFlexVolume extends software.amazon.jsii.JsiiSerializable {

    /**
     * driver is the name of the Flexvolume driver.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getDriver();

    /**
     * @return a {@link Builder} of {@link AllowedFlexVolume}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link AllowedFlexVolume}
     */
    public static final class Builder implements software.amazon.jsii.Builder<AllowedFlexVolume> {
        private java.lang.String driver;

        /**
         * Sets the value of {@link AllowedFlexVolume#getDriver}
         * @param driver driver is the name of the Flexvolume driver. This parameter is required.
         * @return {@code this}
         */
        public Builder driver(java.lang.String driver) {
            this.driver = driver;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link AllowedFlexVolume}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public AllowedFlexVolume build() {
            return new Jsii$Proxy(driver);
        }
    }

    /**
     * An implementation for {@link AllowedFlexVolume}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements AllowedFlexVolume {
        private final java.lang.String driver;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.driver = software.amazon.jsii.Kernel.get(this, "driver", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String driver) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.driver = java.util.Objects.requireNonNull(driver, "driver is required");
        }

        @Override
        public final java.lang.String getDriver() {
            return this.driver;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("driver", om.valueToTree(this.getDriver()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.AllowedFlexVolume"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AllowedFlexVolume.Jsii$Proxy that = (AllowedFlexVolume.Jsii$Proxy) o;

            return this.driver.equals(that.driver);
        }

        @Override
        public final int hashCode() {
            int result = this.driver.hashCode();
            return result;
        }
    }
}
