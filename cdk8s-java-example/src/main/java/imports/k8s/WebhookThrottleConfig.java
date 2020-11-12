package imports.k8s;

/**
 * WebhookThrottleConfig holds the configuration for throttling events.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.409Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.WebhookThrottleConfig")
@software.amazon.jsii.Jsii.Proxy(WebhookThrottleConfig.Jsii$Proxy.class)
public interface WebhookThrottleConfig extends software.amazon.jsii.JsiiSerializable {

    /**
     * ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getBurst() {
        return null;
    }

    /**
     * ThrottleQPS maximum number of batches per second default 10 QPS.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getQps() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link WebhookThrottleConfig}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link WebhookThrottleConfig}
     */
    public static final class Builder implements software.amazon.jsii.Builder<WebhookThrottleConfig> {
        private java.lang.Number burst;
        private java.lang.Number qps;

        /**
         * Sets the value of {@link WebhookThrottleConfig#getBurst}
         * @param burst ThrottleBurst is the maximum number of events sent at the same moment default 15 QPS.
         * @return {@code this}
         */
        public Builder burst(java.lang.Number burst) {
            this.burst = burst;
            return this;
        }

        /**
         * Sets the value of {@link WebhookThrottleConfig#getQps}
         * @param qps ThrottleQPS maximum number of batches per second default 10 QPS.
         * @return {@code this}
         */
        public Builder qps(java.lang.Number qps) {
            this.qps = qps;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link WebhookThrottleConfig}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public WebhookThrottleConfig build() {
            return new Jsii$Proxy(burst, qps);
        }
    }

    /**
     * An implementation for {@link WebhookThrottleConfig}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements WebhookThrottleConfig {
        private final java.lang.Number burst;
        private final java.lang.Number qps;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.burst = software.amazon.jsii.Kernel.get(this, "burst", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.qps = software.amazon.jsii.Kernel.get(this, "qps", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.Number burst, final java.lang.Number qps) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.burst = burst;
            this.qps = qps;
        }

        @Override
        public final java.lang.Number getBurst() {
            return this.burst;
        }

        @Override
        public final java.lang.Number getQps() {
            return this.qps;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getBurst() != null) {
                data.set("burst", om.valueToTree(this.getBurst()));
            }
            if (this.getQps() != null) {
                data.set("qps", om.valueToTree(this.getQps()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.WebhookThrottleConfig"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            WebhookThrottleConfig.Jsii$Proxy that = (WebhookThrottleConfig.Jsii$Proxy) o;

            if (this.burst != null ? !this.burst.equals(that.burst) : that.burst != null) return false;
            return this.qps != null ? this.qps.equals(that.qps) : that.qps == null;
        }

        @Override
        public final int hashCode() {
            int result = this.burst != null ? this.burst.hashCode() : 0;
            result = 31 * result + (this.qps != null ? this.qps.hashCode() : 0);
            return result;
        }
    }
}
