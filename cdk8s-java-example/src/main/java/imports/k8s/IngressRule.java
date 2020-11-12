package imports.k8s;

/**
 * IngressRule represents the rules mapping the paths under a specified host to the related backend services.
 * <p>
 * Incoming requests are first evaluated for a host match, then routed to the backend associated with the matching IngressRuleValue.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.230Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IngressRule")
@software.amazon.jsii.Jsii.Proxy(IngressRule.Jsii$Proxy.class)
public interface IngressRule extends software.amazon.jsii.JsiiSerializable {

    /**
     * Host is the fully qualified domain name of a network host, as defined by RFC 3986.
     * <p>
     * Note the following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
     * IP in the Spec of the parent Ingress.
     * 2. The <code>:</code> delimiter is not respected because ports are not allowed.
     * Currently the port of an Ingress is implicitly :80 for http and
     * :443 for https.
     * Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getHost() {
        return null;
    }

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.HttpIngressRuleValue getHttp() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link IngressRule}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link IngressRule}
     */
    public static final class Builder implements software.amazon.jsii.Builder<IngressRule> {
        private java.lang.String host;
        private imports.k8s.HttpIngressRuleValue http;

        /**
         * Sets the value of {@link IngressRule#getHost}
         * @param host Host is the fully qualified domain name of a network host, as defined by RFC 3986.
         *             Note the following deviations from the "host" part of the URI as defined in the RFC: 1. IPs are not allowed. Currently an IngressRuleValue can only apply to the
         *             IP in the Spec of the parent Ingress.
         *             2. The <code>:</code> delimiter is not respected because ports are not allowed.
         *             Currently the port of an Ingress is implicitly :80 for http and
         *             :443 for https.
         *             Both these may change in the future. Incoming requests are matched against the host before the IngressRuleValue. If the host is unspecified, the Ingress routes all traffic based on the specified IngressRuleValue.
         * @return {@code this}
         */
        public Builder host(java.lang.String host) {
            this.host = host;
            return this;
        }

        /**
         * Sets the value of {@link IngressRule#getHttp}
         * @param http the value to be set.
         * @return {@code this}
         */
        public Builder http(imports.k8s.HttpIngressRuleValue http) {
            this.http = http;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link IngressRule}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public IngressRule build() {
            return new Jsii$Proxy(host, http);
        }
    }

    /**
     * An implementation for {@link IngressRule}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements IngressRule {
        private final java.lang.String host;
        private final imports.k8s.HttpIngressRuleValue http;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.host = software.amazon.jsii.Kernel.get(this, "host", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.http = software.amazon.jsii.Kernel.get(this, "http", software.amazon.jsii.NativeType.forClass(imports.k8s.HttpIngressRuleValue.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final java.lang.String host, final imports.k8s.HttpIngressRuleValue http) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.host = host;
            this.http = http;
        }

        @Override
        public final java.lang.String getHost() {
            return this.host;
        }

        @Override
        public final imports.k8s.HttpIngressRuleValue getHttp() {
            return this.http;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getHost() != null) {
                data.set("host", om.valueToTree(this.getHost()));
            }
            if (this.getHttp() != null) {
                data.set("http", om.valueToTree(this.getHttp()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.IngressRule"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            IngressRule.Jsii$Proxy that = (IngressRule.Jsii$Proxy) o;

            if (this.host != null ? !this.host.equals(that.host) : that.host != null) return false;
            return this.http != null ? this.http.equals(that.http) : that.http == null;
        }

        @Override
        public final int hashCode() {
            int result = this.host != null ? this.host.hashCode() : 0;
            result = 31 * result + (this.http != null ? this.http.hashCode() : 0);
            return result;
        }
    }
}
