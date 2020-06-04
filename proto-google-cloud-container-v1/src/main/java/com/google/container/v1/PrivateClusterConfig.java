/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

/**
 *
 *
 * <pre>
 * Configuration options for private clusters.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.PrivateClusterConfig}
 */
public final class PrivateClusterConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1.PrivateClusterConfig)
    PrivateClusterConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PrivateClusterConfig.newBuilder() to construct.
  private PrivateClusterConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PrivateClusterConfig() {
    masterIpv4CidrBlock_ = "";
    privateEndpoint_ = "";
    publicEndpoint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PrivateClusterConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PrivateClusterConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              enablePrivateNodes_ = input.readBool();
              break;
            }
          case 16:
            {
              enablePrivateEndpoint_ = input.readBool();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              masterIpv4CidrBlock_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              privateEndpoint_ = s;
              break;
            }
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              publicEndpoint_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_PrivateClusterConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto
        .internal_static_google_container_v1_PrivateClusterConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.PrivateClusterConfig.class,
            com.google.container.v1.PrivateClusterConfig.Builder.class);
  }

  public static final int ENABLE_PRIVATE_NODES_FIELD_NUMBER = 1;
  private boolean enablePrivateNodes_;
  /**
   *
   *
   * <pre>
   * Whether nodes have internal IP addresses only. If enabled, all nodes are
   * given only RFC 1918 private addresses and communicate with the master via
   * private networking.
   * </pre>
   *
   * <code>bool enable_private_nodes = 1;</code>
   *
   * @return The enablePrivateNodes.
   */
  @java.lang.Override
  public boolean getEnablePrivateNodes() {
    return enablePrivateNodes_;
  }

  public static final int ENABLE_PRIVATE_ENDPOINT_FIELD_NUMBER = 2;
  private boolean enablePrivateEndpoint_;
  /**
   *
   *
   * <pre>
   * Whether the master's internal IP address is used as the cluster endpoint.
   * </pre>
   *
   * <code>bool enable_private_endpoint = 2;</code>
   *
   * @return The enablePrivateEndpoint.
   */
  @java.lang.Override
  public boolean getEnablePrivateEndpoint() {
    return enablePrivateEndpoint_;
  }

  public static final int MASTER_IPV4_CIDR_BLOCK_FIELD_NUMBER = 3;
  private volatile java.lang.Object masterIpv4CidrBlock_;
  /**
   *
   *
   * <pre>
   * The IP range in CIDR notation to use for the hosted master network. This
   * range will be used for assigning internal IP addresses to the master or
   * set of masters, as well as the ILB VIP. This range must not overlap with
   * any other ranges in use within the cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 3;</code>
   *
   * @return The masterIpv4CidrBlock.
   */
  @java.lang.Override
  public java.lang.String getMasterIpv4CidrBlock() {
    java.lang.Object ref = masterIpv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      masterIpv4CidrBlock_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The IP range in CIDR notation to use for the hosted master network. This
   * range will be used for assigning internal IP addresses to the master or
   * set of masters, as well as the ILB VIP. This range must not overlap with
   * any other ranges in use within the cluster's network.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 3;</code>
   *
   * @return The bytes for masterIpv4CidrBlock.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMasterIpv4CidrBlockBytes() {
    java.lang.Object ref = masterIpv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      masterIpv4CidrBlock_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIVATE_ENDPOINT_FIELD_NUMBER = 4;
  private volatile java.lang.Object privateEndpoint_;
  /**
   *
   *
   * <pre>
   * Output only. The internal IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string private_endpoint = 4;</code>
   *
   * @return The privateEndpoint.
   */
  @java.lang.Override
  public java.lang.String getPrivateEndpoint() {
    java.lang.Object ref = privateEndpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      privateEndpoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The internal IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string private_endpoint = 4;</code>
   *
   * @return The bytes for privateEndpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrivateEndpointBytes() {
    java.lang.Object ref = privateEndpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      privateEndpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_ENDPOINT_FIELD_NUMBER = 5;
  private volatile java.lang.Object publicEndpoint_;
  /**
   *
   *
   * <pre>
   * Output only. The external IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string public_endpoint = 5;</code>
   *
   * @return The publicEndpoint.
   */
  @java.lang.Override
  public java.lang.String getPublicEndpoint() {
    java.lang.Object ref = publicEndpoint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicEndpoint_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The external IP address of this cluster's master endpoint.
   * </pre>
   *
   * <code>string public_endpoint = 5;</code>
   *
   * @return The bytes for publicEndpoint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicEndpointBytes() {
    java.lang.Object ref = publicEndpoint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      publicEndpoint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (enablePrivateNodes_ != false) {
      output.writeBool(1, enablePrivateNodes_);
    }
    if (enablePrivateEndpoint_ != false) {
      output.writeBool(2, enablePrivateEndpoint_);
    }
    if (!getMasterIpv4CidrBlockBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, masterIpv4CidrBlock_);
    }
    if (!getPrivateEndpointBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, privateEndpoint_);
    }
    if (!getPublicEndpointBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, publicEndpoint_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enablePrivateNodes_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enablePrivateNodes_);
    }
    if (enablePrivateEndpoint_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, enablePrivateEndpoint_);
    }
    if (!getMasterIpv4CidrBlockBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, masterIpv4CidrBlock_);
    }
    if (!getPrivateEndpointBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, privateEndpoint_);
    }
    if (!getPublicEndpointBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, publicEndpoint_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.container.v1.PrivateClusterConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1.PrivateClusterConfig other =
        (com.google.container.v1.PrivateClusterConfig) obj;

    if (getEnablePrivateNodes() != other.getEnablePrivateNodes()) return false;
    if (getEnablePrivateEndpoint() != other.getEnablePrivateEndpoint()) return false;
    if (!getMasterIpv4CidrBlock().equals(other.getMasterIpv4CidrBlock())) return false;
    if (!getPrivateEndpoint().equals(other.getPrivateEndpoint())) return false;
    if (!getPublicEndpoint().equals(other.getPublicEndpoint())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ENABLE_PRIVATE_NODES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnablePrivateNodes());
    hash = (37 * hash) + ENABLE_PRIVATE_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnablePrivateEndpoint());
    hash = (37 * hash) + MASTER_IPV4_CIDR_BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getMasterIpv4CidrBlock().hashCode();
    hash = (37 * hash) + PRIVATE_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getPrivateEndpoint().hashCode();
    hash = (37 * hash) + PUBLIC_ENDPOINT_FIELD_NUMBER;
    hash = (53 * hash) + getPublicEndpoint().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.PrivateClusterConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.PrivateClusterConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1.PrivateClusterConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.container.v1.PrivateClusterConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Configuration options for private clusters.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.PrivateClusterConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.PrivateClusterConfig)
      com.google.container.v1.PrivateClusterConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_PrivateClusterConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_PrivateClusterConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.PrivateClusterConfig.class,
              com.google.container.v1.PrivateClusterConfig.Builder.class);
    }

    // Construct using com.google.container.v1.PrivateClusterConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      enablePrivateNodes_ = false;

      enablePrivateEndpoint_ = false;

      masterIpv4CidrBlock_ = "";

      privateEndpoint_ = "";

      publicEndpoint_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto
          .internal_static_google_container_v1_PrivateClusterConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.PrivateClusterConfig getDefaultInstanceForType() {
      return com.google.container.v1.PrivateClusterConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.PrivateClusterConfig build() {
      com.google.container.v1.PrivateClusterConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.PrivateClusterConfig buildPartial() {
      com.google.container.v1.PrivateClusterConfig result =
          new com.google.container.v1.PrivateClusterConfig(this);
      result.enablePrivateNodes_ = enablePrivateNodes_;
      result.enablePrivateEndpoint_ = enablePrivateEndpoint_;
      result.masterIpv4CidrBlock_ = masterIpv4CidrBlock_;
      result.privateEndpoint_ = privateEndpoint_;
      result.publicEndpoint_ = publicEndpoint_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.container.v1.PrivateClusterConfig) {
        return mergeFrom((com.google.container.v1.PrivateClusterConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.PrivateClusterConfig other) {
      if (other == com.google.container.v1.PrivateClusterConfig.getDefaultInstance()) return this;
      if (other.getEnablePrivateNodes() != false) {
        setEnablePrivateNodes(other.getEnablePrivateNodes());
      }
      if (other.getEnablePrivateEndpoint() != false) {
        setEnablePrivateEndpoint(other.getEnablePrivateEndpoint());
      }
      if (!other.getMasterIpv4CidrBlock().isEmpty()) {
        masterIpv4CidrBlock_ = other.masterIpv4CidrBlock_;
        onChanged();
      }
      if (!other.getPrivateEndpoint().isEmpty()) {
        privateEndpoint_ = other.privateEndpoint_;
        onChanged();
      }
      if (!other.getPublicEndpoint().isEmpty()) {
        publicEndpoint_ = other.publicEndpoint_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.container.v1.PrivateClusterConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.container.v1.PrivateClusterConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enablePrivateNodes_;
    /**
     *
     *
     * <pre>
     * Whether nodes have internal IP addresses only. If enabled, all nodes are
     * given only RFC 1918 private addresses and communicate with the master via
     * private networking.
     * </pre>
     *
     * <code>bool enable_private_nodes = 1;</code>
     *
     * @return The enablePrivateNodes.
     */
    @java.lang.Override
    public boolean getEnablePrivateNodes() {
      return enablePrivateNodes_;
    }
    /**
     *
     *
     * <pre>
     * Whether nodes have internal IP addresses only. If enabled, all nodes are
     * given only RFC 1918 private addresses and communicate with the master via
     * private networking.
     * </pre>
     *
     * <code>bool enable_private_nodes = 1;</code>
     *
     * @param value The enablePrivateNodes to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePrivateNodes(boolean value) {

      enablePrivateNodes_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether nodes have internal IP addresses only. If enabled, all nodes are
     * given only RFC 1918 private addresses and communicate with the master via
     * private networking.
     * </pre>
     *
     * <code>bool enable_private_nodes = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnablePrivateNodes() {

      enablePrivateNodes_ = false;
      onChanged();
      return this;
    }

    private boolean enablePrivateEndpoint_;
    /**
     *
     *
     * <pre>
     * Whether the master's internal IP address is used as the cluster endpoint.
     * </pre>
     *
     * <code>bool enable_private_endpoint = 2;</code>
     *
     * @return The enablePrivateEndpoint.
     */
    @java.lang.Override
    public boolean getEnablePrivateEndpoint() {
      return enablePrivateEndpoint_;
    }
    /**
     *
     *
     * <pre>
     * Whether the master's internal IP address is used as the cluster endpoint.
     * </pre>
     *
     * <code>bool enable_private_endpoint = 2;</code>
     *
     * @param value The enablePrivateEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setEnablePrivateEndpoint(boolean value) {

      enablePrivateEndpoint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the master's internal IP address is used as the cluster endpoint.
     * </pre>
     *
     * <code>bool enable_private_endpoint = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnablePrivateEndpoint() {

      enablePrivateEndpoint_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object masterIpv4CidrBlock_ = "";
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the hosted master network. This
     * range will be used for assigning internal IP addresses to the master or
     * set of masters, as well as the ILB VIP. This range must not overlap with
     * any other ranges in use within the cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 3;</code>
     *
     * @return The masterIpv4CidrBlock.
     */
    public java.lang.String getMasterIpv4CidrBlock() {
      java.lang.Object ref = masterIpv4CidrBlock_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        masterIpv4CidrBlock_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the hosted master network. This
     * range will be used for assigning internal IP addresses to the master or
     * set of masters, as well as the ILB VIP. This range must not overlap with
     * any other ranges in use within the cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 3;</code>
     *
     * @return The bytes for masterIpv4CidrBlock.
     */
    public com.google.protobuf.ByteString getMasterIpv4CidrBlockBytes() {
      java.lang.Object ref = masterIpv4CidrBlock_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        masterIpv4CidrBlock_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the hosted master network. This
     * range will be used for assigning internal IP addresses to the master or
     * set of masters, as well as the ILB VIP. This range must not overlap with
     * any other ranges in use within the cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 3;</code>
     *
     * @param value The masterIpv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setMasterIpv4CidrBlock(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      masterIpv4CidrBlock_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the hosted master network. This
     * range will be used for assigning internal IP addresses to the master or
     * set of masters, as well as the ILB VIP. This range must not overlap with
     * any other ranges in use within the cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMasterIpv4CidrBlock() {

      masterIpv4CidrBlock_ = getDefaultInstance().getMasterIpv4CidrBlock();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP range in CIDR notation to use for the hosted master network. This
     * range will be used for assigning internal IP addresses to the master or
     * set of masters, as well as the ILB VIP. This range must not overlap with
     * any other ranges in use within the cluster's network.
     * </pre>
     *
     * <code>string master_ipv4_cidr_block = 3;</code>
     *
     * @param value The bytes for masterIpv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setMasterIpv4CidrBlockBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      masterIpv4CidrBlock_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object privateEndpoint_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The internal IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string private_endpoint = 4;</code>
     *
     * @return The privateEndpoint.
     */
    public java.lang.String getPrivateEndpoint() {
      java.lang.Object ref = privateEndpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        privateEndpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The internal IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string private_endpoint = 4;</code>
     *
     * @return The bytes for privateEndpoint.
     */
    public com.google.protobuf.ByteString getPrivateEndpointBytes() {
      java.lang.Object ref = privateEndpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        privateEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The internal IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string private_endpoint = 4;</code>
     *
     * @param value The privateEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      privateEndpoint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The internal IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string private_endpoint = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrivateEndpoint() {

      privateEndpoint_ = getDefaultInstance().getPrivateEndpoint();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The internal IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string private_endpoint = 4;</code>
     *
     * @param value The bytes for privateEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      privateEndpoint_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object publicEndpoint_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The external IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string public_endpoint = 5;</code>
     *
     * @return The publicEndpoint.
     */
    public java.lang.String getPublicEndpoint() {
      java.lang.Object ref = publicEndpoint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicEndpoint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The external IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string public_endpoint = 5;</code>
     *
     * @return The bytes for publicEndpoint.
     */
    public com.google.protobuf.ByteString getPublicEndpointBytes() {
      java.lang.Object ref = publicEndpoint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        publicEndpoint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The external IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string public_endpoint = 5;</code>
     *
     * @param value The publicEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setPublicEndpoint(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      publicEndpoint_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The external IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string public_endpoint = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPublicEndpoint() {

      publicEndpoint_ = getDefaultInstance().getPublicEndpoint();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The external IP address of this cluster's master endpoint.
     * </pre>
     *
     * <code>string public_endpoint = 5;</code>
     *
     * @param value The bytes for publicEndpoint to set.
     * @return This builder for chaining.
     */
    public Builder setPublicEndpointBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      publicEndpoint_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.container.v1.PrivateClusterConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.PrivateClusterConfig)
  private static final com.google.container.v1.PrivateClusterConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1.PrivateClusterConfig();
  }

  public static com.google.container.v1.PrivateClusterConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrivateClusterConfig> PARSER =
      new com.google.protobuf.AbstractParser<PrivateClusterConfig>() {
        @java.lang.Override
        public PrivateClusterConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PrivateClusterConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PrivateClusterConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrivateClusterConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.PrivateClusterConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
