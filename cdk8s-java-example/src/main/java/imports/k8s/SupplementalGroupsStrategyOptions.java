package imports.k8s;

/**
 * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.387Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.SupplementalGroupsStrategyOptions")
@software.amazon.jsii.Jsii.Proxy(SupplementalGroupsStrategyOptions.Jsii$Proxy.class)
public interface SupplementalGroupsStrategyOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * ranges are the allowed ranges of supplemental groups.
     * <p>
     * If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.IdRange> getRanges() {
        return null;
    }

    /**
     * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getRule() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SupplementalGroupsStrategyOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SupplementalGroupsStrategyOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SupplementalGroupsStrategyOptions> {
        private java.util.List<imports.k8s.IdRange> ranges;
        private java.lang.String rule;

        /**
         * Sets the value of {@link SupplementalGroupsStrategyOptions#getRanges}
         * @param ranges ranges are the allowed ranges of supplemental groups.
         *               If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder ranges(java.util.List<? extends imports.k8s.IdRange> ranges) {
            this.ranges = (java.util.List<imports.k8s.IdRange>)ranges;
            return this;
        }

        /**
         * Sets the value of {@link SupplementalGroupsStrategyOptions#getRule}
         * @param rule rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
         * @return {@code this}
         */
        public Builder rule(java.lang.String rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SupplementalGroupsStrategyOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SupplementalGroupsStrategyOptions build() {
            return new Jsii$Proxy(ranges, rule);
        }
    }

    /**
     * An implementation for {@link SupplementalGroupsStrategyOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SupplementalGroupsStrategyOptions {
        private final java.util.List<imports.k8s.IdRange> ranges;
        private final java.lang.String rule;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.ranges = software.amazon.jsii.Kernel.get(this, "ranges", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.IdRange.class)));
            this.rule = software.amazon.jsii.Kernel.get(this, "rule", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final java.util.List<? extends imports.k8s.IdRange> ranges, final java.lang.String rule) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.ranges = (java.util.List<imports.k8s.IdRange>)ranges;
            this.rule = rule;
        }

        @Override
        public final java.util.List<imports.k8s.IdRange> getRanges() {
            return this.ranges;
        }

        @Override
        public final java.lang.String getRule() {
            return this.rule;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getRanges() != null) {
                data.set("ranges", om.valueToTree(this.getRanges()));
            }
            if (this.getRule() != null) {
                data.set("rule", om.valueToTree(this.getRule()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.SupplementalGroupsStrategyOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SupplementalGroupsStrategyOptions.Jsii$Proxy that = (SupplementalGroupsStrategyOptions.Jsii$Proxy) o;

            if (this.ranges != null ? !this.ranges.equals(that.ranges) : that.ranges != null) return false;
            return this.rule != null ? this.rule.equals(that.rule) : that.rule == null;
        }

        @Override
        public final int hashCode() {
            int result = this.ranges != null ? this.ranges.hashCode() : 0;
            result = 31 * result + (this.rule != null ? this.rule.hashCode() : 0);
            return result;
        }
    }
}
