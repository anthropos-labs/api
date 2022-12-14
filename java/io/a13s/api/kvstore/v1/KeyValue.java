// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kvstore/v1/kv.proto

package io.a13s.api.kvstore.v1;

/**
 * Protobuf type {@code kvstore.v1.KeyValue}
 */
public final class KeyValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kvstore.v1.KeyValue)
    KeyValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeyValue.newBuilder() to construct.
  private KeyValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyValue() {
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeyValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_KeyValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_KeyValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.a13s.api.kvstore.v1.KeyValue.class, io.a13s.api.kvstore.v1.KeyValue.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString key_;
  /**
   * <pre>
   * key is the key in bytes. An empty key is not allowed.
   * </pre>
   *
   * <code>bytes key = 1 [json_name = "key"];</code>
   * @return The key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int CREATE_REVISION_FIELD_NUMBER = 2;
  private long createRevision_;
  /**
   * <pre>
   * create_revision is the revision of last creation on this key.
   * </pre>
   *
   * <code>int64 create_revision = 2 [json_name = "createRevision"];</code>
   * @return The createRevision.
   */
  @java.lang.Override
  public long getCreateRevision() {
    return createRevision_;
  }

  public static final int MOD_REVISION_FIELD_NUMBER = 3;
  private long modRevision_;
  /**
   * <pre>
   * mod_revision is the revision of last modification on this key.
   * </pre>
   *
   * <code>int64 mod_revision = 3 [json_name = "modRevision"];</code>
   * @return The modRevision.
   */
  @java.lang.Override
  public long getModRevision() {
    return modRevision_;
  }

  public static final int VERSION_FIELD_NUMBER = 4;
  private int version_;
  /**
   * <pre>
   * version is the version of the key. A deletion resets
   * the version to zero and any modification of the key
   * increases its version.
   * </pre>
   *
   * <code>uint32 version = 4 [json_name = "version"];</code>
   * @return The version.
   */
  @java.lang.Override
  public int getVersion() {
    return version_;
  }

  public static final int VALUE_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString value_;
  /**
   * <pre>
   * value is the value held by the key, in bytes.
   * </pre>
   *
   * <code>bytes value = 5 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int LEASE_FIELD_NUMBER = 6;
  private long lease_;
  /**
   * <pre>
   * lease is the ID of the lease that attached to key.
   * When the attached lease expires, the key will be deleted.
   * If lease is 0, then no lease is attached to the key.
   * </pre>
   *
   * <code>int64 lease = 6 [json_name = "lease"];</code>
   * @return The lease.
   */
  @java.lang.Override
  public long getLease() {
    return lease_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!key_.isEmpty()) {
      output.writeBytes(1, key_);
    }
    if (createRevision_ != 0L) {
      output.writeInt64(2, createRevision_);
    }
    if (modRevision_ != 0L) {
      output.writeInt64(3, modRevision_);
    }
    if (version_ != 0) {
      output.writeUInt32(4, version_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(5, value_);
    }
    if (lease_ != 0L) {
      output.writeInt64(6, lease_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, key_);
    }
    if (createRevision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, createRevision_);
    }
    if (modRevision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, modRevision_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, version_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, value_);
    }
    if (lease_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, lease_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.a13s.api.kvstore.v1.KeyValue)) {
      return super.equals(obj);
    }
    io.a13s.api.kvstore.v1.KeyValue other = (io.a13s.api.kvstore.v1.KeyValue) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (getCreateRevision()
        != other.getCreateRevision()) return false;
    if (getModRevision()
        != other.getModRevision()) return false;
    if (getVersion()
        != other.getVersion()) return false;
    if (!getValue()
        .equals(other.getValue())) return false;
    if (getLease()
        != other.getLease()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + CREATE_REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCreateRevision());
    hash = (37 * hash) + MOD_REVISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getModRevision());
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + LEASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLease());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.KeyValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.a13s.api.kvstore.v1.KeyValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code kvstore.v1.KeyValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kvstore.v1.KeyValue)
      io.a13s.api.kvstore.v1.KeyValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_KeyValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_KeyValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.a13s.api.kvstore.v1.KeyValue.class, io.a13s.api.kvstore.v1.KeyValue.Builder.class);
    }

    // Construct using io.a13s.api.kvstore.v1.KeyValue.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      key_ = com.google.protobuf.ByteString.EMPTY;

      createRevision_ = 0L;

      modRevision_ = 0L;

      version_ = 0;

      value_ = com.google.protobuf.ByteString.EMPTY;

      lease_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_KeyValue_descriptor;
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.KeyValue getDefaultInstanceForType() {
      return io.a13s.api.kvstore.v1.KeyValue.getDefaultInstance();
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.KeyValue build() {
      io.a13s.api.kvstore.v1.KeyValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.KeyValue buildPartial() {
      io.a13s.api.kvstore.v1.KeyValue result = new io.a13s.api.kvstore.v1.KeyValue(this);
      result.key_ = key_;
      result.createRevision_ = createRevision_;
      result.modRevision_ = modRevision_;
      result.version_ = version_;
      result.value_ = value_;
      result.lease_ = lease_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.a13s.api.kvstore.v1.KeyValue) {
        return mergeFrom((io.a13s.api.kvstore.v1.KeyValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.a13s.api.kvstore.v1.KeyValue other) {
      if (other == io.a13s.api.kvstore.v1.KeyValue.getDefaultInstance()) return this;
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getCreateRevision() != 0L) {
        setCreateRevision(other.getCreateRevision());
      }
      if (other.getModRevision() != 0L) {
        setModRevision(other.getModRevision());
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getLease() != 0L) {
        setLease(other.getLease());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              key_ = input.readBytes();

              break;
            } // case 10
            case 16: {
              createRevision_ = input.readInt64();

              break;
            } // case 16
            case 24: {
              modRevision_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              version_ = input.readUInt32();

              break;
            } // case 32
            case 42: {
              value_ = input.readBytes();

              break;
            } // case 42
            case 48: {
              lease_ = input.readInt64();

              break;
            } // case 48
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * key is the key in bytes. An empty key is not allowed.
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return The key.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <pre>
     * key is the key in bytes. An empty key is not allowed.
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * key is the key in bytes. An empty key is not allowed.
     * </pre>
     *
     * <code>bytes key = 1 [json_name = "key"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private long createRevision_ ;
    /**
     * <pre>
     * create_revision is the revision of last creation on this key.
     * </pre>
     *
     * <code>int64 create_revision = 2 [json_name = "createRevision"];</code>
     * @return The createRevision.
     */
    @java.lang.Override
    public long getCreateRevision() {
      return createRevision_;
    }
    /**
     * <pre>
     * create_revision is the revision of last creation on this key.
     * </pre>
     *
     * <code>int64 create_revision = 2 [json_name = "createRevision"];</code>
     * @param value The createRevision to set.
     * @return This builder for chaining.
     */
    public Builder setCreateRevision(long value) {
      
      createRevision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * create_revision is the revision of last creation on this key.
     * </pre>
     *
     * <code>int64 create_revision = 2 [json_name = "createRevision"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreateRevision() {
      
      createRevision_ = 0L;
      onChanged();
      return this;
    }

    private long modRevision_ ;
    /**
     * <pre>
     * mod_revision is the revision of last modification on this key.
     * </pre>
     *
     * <code>int64 mod_revision = 3 [json_name = "modRevision"];</code>
     * @return The modRevision.
     */
    @java.lang.Override
    public long getModRevision() {
      return modRevision_;
    }
    /**
     * <pre>
     * mod_revision is the revision of last modification on this key.
     * </pre>
     *
     * <code>int64 mod_revision = 3 [json_name = "modRevision"];</code>
     * @param value The modRevision to set.
     * @return This builder for chaining.
     */
    public Builder setModRevision(long value) {
      
      modRevision_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * mod_revision is the revision of last modification on this key.
     * </pre>
     *
     * <code>int64 mod_revision = 3 [json_name = "modRevision"];</code>
     * @return This builder for chaining.
     */
    public Builder clearModRevision() {
      
      modRevision_ = 0L;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * version is the version of the key. A deletion resets
     * the version to zero and any modification of the key
     * increases its version.
     * </pre>
     *
     * <code>uint32 version = 4 [json_name = "version"];</code>
     * @return The version.
     */
    @java.lang.Override
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * version is the version of the key. A deletion resets
     * the version to zero and any modification of the key
     * increases its version.
     * </pre>
     *
     * <code>uint32 version = 4 [json_name = "version"];</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * version is the version of the key. A deletion resets
     * the version to zero and any modification of the key
     * increases its version.
     * </pre>
     *
     * <code>uint32 version = 4 [json_name = "version"];</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * value is the value held by the key, in bytes.
     * </pre>
     *
     * <code>bytes value = 5 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <pre>
     * value is the value held by the key, in bytes.
     * </pre>
     *
     * <code>bytes value = 5 [json_name = "value"];</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value is the value held by the key, in bytes.
     * </pre>
     *
     * <code>bytes value = 5 [json_name = "value"];</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private long lease_ ;
    /**
     * <pre>
     * lease is the ID of the lease that attached to key.
     * When the attached lease expires, the key will be deleted.
     * If lease is 0, then no lease is attached to the key.
     * </pre>
     *
     * <code>int64 lease = 6 [json_name = "lease"];</code>
     * @return The lease.
     */
    @java.lang.Override
    public long getLease() {
      return lease_;
    }
    /**
     * <pre>
     * lease is the ID of the lease that attached to key.
     * When the attached lease expires, the key will be deleted.
     * If lease is 0, then no lease is attached to the key.
     * </pre>
     *
     * <code>int64 lease = 6 [json_name = "lease"];</code>
     * @param value The lease to set.
     * @return This builder for chaining.
     */
    public Builder setLease(long value) {
      
      lease_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * lease is the ID of the lease that attached to key.
     * When the attached lease expires, the key will be deleted.
     * If lease is 0, then no lease is attached to the key.
     * </pre>
     *
     * <code>int64 lease = 6 [json_name = "lease"];</code>
     * @return This builder for chaining.
     */
    public Builder clearLease() {
      
      lease_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:kvstore.v1.KeyValue)
  }

  // @@protoc_insertion_point(class_scope:kvstore.v1.KeyValue)
  private static final io.a13s.api.kvstore.v1.KeyValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.a13s.api.kvstore.v1.KeyValue();
  }

  public static io.a13s.api.kvstore.v1.KeyValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyValue>
      PARSER = new com.google.protobuf.AbstractParser<KeyValue>() {
    @java.lang.Override
    public KeyValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<KeyValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.a13s.api.kvstore.v1.KeyValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

