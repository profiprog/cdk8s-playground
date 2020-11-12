package imports.k8s;

/**
 * ClusterRoleBinding references a ClusterRole, but not contain it.
 * <p>
 * It can reference a ClusterRole in the global namespace, and adds who information via Subject.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.14.1 (build 828de8a)", date = "2020-11-09T01:37:02.130Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ClusterRoleBindingOptions")
@software.amazon.jsii.Jsii.Proxy(ClusterRoleBindingOptions.Jsii$Proxy.class)
public interface ClusterRoleBindingOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * RoleRef can only reference a ClusterRole in the global namespace.
     * <p>
     * If the RoleRef cannot be resolved, the Authorizer must return an error.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.RoleRef getRoleRef();

    /**
     * Standard object's metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Subjects holds references to the objects the role applies to.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.Subject> getSubjects() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ClusterRoleBindingOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ClusterRoleBindingOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ClusterRoleBindingOptions> {
        private imports.k8s.RoleRef roleRef;
        private imports.k8s.ObjectMeta metadata;
        private java.util.List<imports.k8s.Subject> subjects;

        /**
         * Sets the value of {@link ClusterRoleBindingOptions#getRoleRef}
         * @param roleRef RoleRef can only reference a ClusterRole in the global namespace. This parameter is required.
         *                If the RoleRef cannot be resolved, the Authorizer must return an error.
         * @return {@code this}
         */
        public Builder roleRef(imports.k8s.RoleRef roleRef) {
            this.roleRef = roleRef;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleBindingOptions#getMetadata}
         * @param metadata Standard object's metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ClusterRoleBindingOptions#getSubjects}
         * @param subjects Subjects holds references to the objects the role applies to.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder subjects(java.util.List<? extends imports.k8s.Subject> subjects) {
            this.subjects = (java.util.List<imports.k8s.Subject>)subjects;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ClusterRoleBindingOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ClusterRoleBindingOptions build() {
            return new Jsii$Proxy(roleRef, metadata, subjects);
        }
    }

    /**
     * An implementation for {@link ClusterRoleBindingOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ClusterRoleBindingOptions {
        private final imports.k8s.RoleRef roleRef;
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.Subject> subjects;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.roleRef = software.amazon.jsii.Kernel.get(this, "roleRef", software.amazon.jsii.NativeType.forClass(imports.k8s.RoleRef.class));
            this.metadata = software.amazon.jsii.Kernel.get(this, "metadata", software.amazon.jsii.NativeType.forClass(imports.k8s.ObjectMeta.class));
            this.subjects = software.amazon.jsii.Kernel.get(this, "subjects", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Subject.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        protected Jsii$Proxy(final imports.k8s.RoleRef roleRef, final imports.k8s.ObjectMeta metadata, final java.util.List<? extends imports.k8s.Subject> subjects) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.roleRef = java.util.Objects.requireNonNull(roleRef, "roleRef is required");
            this.metadata = metadata;
            this.subjects = (java.util.List<imports.k8s.Subject>)subjects;
        }

        @Override
        public final imports.k8s.RoleRef getRoleRef() {
            return this.roleRef;
        }

        @Override
        public final imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public final java.util.List<imports.k8s.Subject> getSubjects() {
            return this.subjects;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("roleRef", om.valueToTree(this.getRoleRef()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSubjects() != null) {
                data.set("subjects", om.valueToTree(this.getSubjects()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ClusterRoleBindingOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClusterRoleBindingOptions.Jsii$Proxy that = (ClusterRoleBindingOptions.Jsii$Proxy) o;

            if (!roleRef.equals(that.roleRef)) return false;
            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.subjects != null ? this.subjects.equals(that.subjects) : that.subjects == null;
        }

        @Override
        public final int hashCode() {
            int result = this.roleRef.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            result = 31 * result + (this.subjects != null ? this.subjects.hashCode() : 0);
            return result;
        }
    }
}
