// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kvstore/v1/kv.proto

package io.a13s.api.kvstore.v1;

/**
 * Protobuf type {@code kvstore.v1.CreateBucketResponse}
 */
public final class CreateBucketResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kvstore.v1.CreateBucketResponse)
    CreateBucketResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateBucketResponse.newBuilder() to construct.
  private CreateBucketResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateBucketResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateBucketResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateBucketResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateBucketResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.a13s.api.kvstore.v1.CreateBucketResponse.class, io.a13s.api.kvstore.v1.CreateBucketResponse.Builder.class);
  }

  public static final int BUCKET_DESCRIPTOR_FIELD_NUMBER = 1;
  private io.a13s.api.kvstore.v1.BucketDescriptor bucketDescriptor_;
  /**
   * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
   * @return Whether the bucketDescriptor field is set.
   */
  @java.lang.Override
  public boolean hasBucketDescriptor() {
    return bucketDescriptor_ != null;
  }
  /**
   * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
   * @return The bucketDescriptor.
   */
  @java.lang.Override
  public io.a13s.api.kvstore.v1.BucketDescriptor getBucketDescriptor() {
    return bucketDescriptor_ == null ? io.a13s.api.kvstore.v1.BucketDescriptor.getDefaultInstance() : bucketDescriptor_;
  }
  /**
   * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
   */
  @java.lang.Override
  public io.a13s.api.kvstore.v1.BucketDescriptorOrBuilder getBucketDescriptorOrBuilder() {
    return getBucketDescriptor();
  }

  public static final int TRANSACTION_FIELD_NUMBER = 2;
  private io.a13s.api.kvstore.v1.Transaction transaction_;
  /**
   * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
   * @return Whether the transaction field is set.
   */
  @java.lang.Override
  public boolean hasTransaction() {
    return transaction_ != null;
  }
  /**
   * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
   * @return The transaction.
   */
  @java.lang.Override
  public io.a13s.api.kvstore.v1.Transaction getTransaction() {
    return transaction_ == null ? io.a13s.api.kvstore.v1.Transaction.getDefaultInstance() : transaction_;
  }
  /**
   * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
   */
  @java.lang.Override
  public io.a13s.api.kvstore.v1.TransactionOrBuilder getTransactionOrBuilder() {
    return getTransaction();
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
    if (bucketDescriptor_ != null) {
      output.writeMessage(1, getBucketDescriptor());
    }
    if (transaction_ != null) {
      output.writeMessage(2, getTransaction());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bucketDescriptor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBucketDescriptor());
    }
    if (transaction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTransaction());
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
    if (!(obj instanceof io.a13s.api.kvstore.v1.CreateBucketResponse)) {
      return super.equals(obj);
    }
    io.a13s.api.kvstore.v1.CreateBucketResponse other = (io.a13s.api.kvstore.v1.CreateBucketResponse) obj;

    if (hasBucketDescriptor() != other.hasBucketDescriptor()) return false;
    if (hasBucketDescriptor()) {
      if (!getBucketDescriptor()
          .equals(other.getBucketDescriptor())) return false;
    }
    if (hasTransaction() != other.hasTransaction()) return false;
    if (hasTransaction()) {
      if (!getTransaction()
          .equals(other.getTransaction())) return false;
    }
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
    if (hasBucketDescriptor()) {
      hash = (37 * hash) + BUCKET_DESCRIPTOR_FIELD_NUMBER;
      hash = (53 * hash) + getBucketDescriptor().hashCode();
    }
    if (hasTransaction()) {
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.CreateBucketResponse parseFrom(
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
  public static Builder newBuilder(io.a13s.api.kvstore.v1.CreateBucketResponse prototype) {
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
   * Protobuf type {@code kvstore.v1.CreateBucketResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kvstore.v1.CreateBucketResponse)
      io.a13s.api.kvstore.v1.CreateBucketResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateBucketResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateBucketResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.a13s.api.kvstore.v1.CreateBucketResponse.class, io.a13s.api.kvstore.v1.CreateBucketResponse.Builder.class);
    }

    // Construct using io.a13s.api.kvstore.v1.CreateBucketResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (bucketDescriptorBuilder_ == null) {
        bucketDescriptor_ = null;
      } else {
        bucketDescriptor_ = null;
        bucketDescriptorBuilder_ = null;
      }
      if (transactionBuilder_ == null) {
        transaction_ = null;
      } else {
        transaction_ = null;
        transactionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateBucketResponse_descriptor;
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.CreateBucketResponse getDefaultInstanceForType() {
      return io.a13s.api.kvstore.v1.CreateBucketResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.CreateBucketResponse build() {
      io.a13s.api.kvstore.v1.CreateBucketResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.CreateBucketResponse buildPartial() {
      io.a13s.api.kvstore.v1.CreateBucketResponse result = new io.a13s.api.kvstore.v1.CreateBucketResponse(this);
      if (bucketDescriptorBuilder_ == null) {
        result.bucketDescriptor_ = bucketDescriptor_;
      } else {
        result.bucketDescriptor_ = bucketDescriptorBuilder_.build();
      }
      if (transactionBuilder_ == null) {
        result.transaction_ = transaction_;
      } else {
        result.transaction_ = transactionBuilder_.build();
      }
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
      if (other instanceof io.a13s.api.kvstore.v1.CreateBucketResponse) {
        return mergeFrom((io.a13s.api.kvstore.v1.CreateBucketResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.a13s.api.kvstore.v1.CreateBucketResponse other) {
      if (other == io.a13s.api.kvstore.v1.CreateBucketResponse.getDefaultInstance()) return this;
      if (other.hasBucketDescriptor()) {
        mergeBucketDescriptor(other.getBucketDescriptor());
      }
      if (other.hasTransaction()) {
        mergeTransaction(other.getTransaction());
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
              input.readMessage(
                  getBucketDescriptorFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTransactionFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
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

    private io.a13s.api.kvstore.v1.BucketDescriptor bucketDescriptor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.a13s.api.kvstore.v1.BucketDescriptor, io.a13s.api.kvstore.v1.BucketDescriptor.Builder, io.a13s.api.kvstore.v1.BucketDescriptorOrBuilder> bucketDescriptorBuilder_;
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     * @return Whether the bucketDescriptor field is set.
     */
    public boolean hasBucketDescriptor() {
      return bucketDescriptorBuilder_ != null || bucketDescriptor_ != null;
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     * @return The bucketDescriptor.
     */
    public io.a13s.api.kvstore.v1.BucketDescriptor getBucketDescriptor() {
      if (bucketDescriptorBuilder_ == null) {
        return bucketDescriptor_ == null ? io.a13s.api.kvstore.v1.BucketDescriptor.getDefaultInstance() : bucketDescriptor_;
      } else {
        return bucketDescriptorBuilder_.getMessage();
      }
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     */
    public Builder setBucketDescriptor(io.a13s.api.kvstore.v1.BucketDescriptor value) {
      if (bucketDescriptorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bucketDescriptor_ = value;
        onChanged();
      } else {
        bucketDescriptorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     */
    public Builder setBucketDescriptor(
        io.a13s.api.kvstore.v1.BucketDescriptor.Builder builderForValue) {
      if (bucketDescriptorBuilder_ == null) {
        bucketDescriptor_ = builderForValue.build();
        onChanged();
      } else {
        bucketDescriptorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     */
    public Builder mergeBucketDescriptor(io.a13s.api.kvstore.v1.BucketDescriptor value) {
      if (bucketDescriptorBuilder_ == null) {
        if (bucketDescriptor_ != null) {
          bucketDescriptor_ =
            io.a13s.api.kvstore.v1.BucketDescriptor.newBuilder(bucketDescriptor_).mergeFrom(value).buildPartial();
        } else {
          bucketDescriptor_ = value;
        }
        onChanged();
      } else {
        bucketDescriptorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     */
    public Builder clearBucketDescriptor() {
      if (bucketDescriptorBuilder_ == null) {
        bucketDescriptor_ = null;
        onChanged();
      } else {
        bucketDescriptor_ = null;
        bucketDescriptorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     */
    public io.a13s.api.kvstore.v1.BucketDescriptor.Builder getBucketDescriptorBuilder() {
      
      onChanged();
      return getBucketDescriptorFieldBuilder().getBuilder();
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     */
    public io.a13s.api.kvstore.v1.BucketDescriptorOrBuilder getBucketDescriptorOrBuilder() {
      if (bucketDescriptorBuilder_ != null) {
        return bucketDescriptorBuilder_.getMessageOrBuilder();
      } else {
        return bucketDescriptor_ == null ?
            io.a13s.api.kvstore.v1.BucketDescriptor.getDefaultInstance() : bucketDescriptor_;
      }
    }
    /**
     * <code>.kvstore.v1.BucketDescriptor bucket_descriptor = 1 [json_name = "bucketDescriptor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.a13s.api.kvstore.v1.BucketDescriptor, io.a13s.api.kvstore.v1.BucketDescriptor.Builder, io.a13s.api.kvstore.v1.BucketDescriptorOrBuilder> 
        getBucketDescriptorFieldBuilder() {
      if (bucketDescriptorBuilder_ == null) {
        bucketDescriptorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.a13s.api.kvstore.v1.BucketDescriptor, io.a13s.api.kvstore.v1.BucketDescriptor.Builder, io.a13s.api.kvstore.v1.BucketDescriptorOrBuilder>(
                getBucketDescriptor(),
                getParentForChildren(),
                isClean());
        bucketDescriptor_ = null;
      }
      return bucketDescriptorBuilder_;
    }

    private io.a13s.api.kvstore.v1.Transaction transaction_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.a13s.api.kvstore.v1.Transaction, io.a13s.api.kvstore.v1.Transaction.Builder, io.a13s.api.kvstore.v1.TransactionOrBuilder> transactionBuilder_;
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     * @return Whether the transaction field is set.
     */
    public boolean hasTransaction() {
      return transactionBuilder_ != null || transaction_ != null;
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     * @return The transaction.
     */
    public io.a13s.api.kvstore.v1.Transaction getTransaction() {
      if (transactionBuilder_ == null) {
        return transaction_ == null ? io.a13s.api.kvstore.v1.Transaction.getDefaultInstance() : transaction_;
      } else {
        return transactionBuilder_.getMessage();
      }
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     */
    public Builder setTransaction(io.a13s.api.kvstore.v1.Transaction value) {
      if (transactionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transaction_ = value;
        onChanged();
      } else {
        transactionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     */
    public Builder setTransaction(
        io.a13s.api.kvstore.v1.Transaction.Builder builderForValue) {
      if (transactionBuilder_ == null) {
        transaction_ = builderForValue.build();
        onChanged();
      } else {
        transactionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     */
    public Builder mergeTransaction(io.a13s.api.kvstore.v1.Transaction value) {
      if (transactionBuilder_ == null) {
        if (transaction_ != null) {
          transaction_ =
            io.a13s.api.kvstore.v1.Transaction.newBuilder(transaction_).mergeFrom(value).buildPartial();
        } else {
          transaction_ = value;
        }
        onChanged();
      } else {
        transactionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     */
    public Builder clearTransaction() {
      if (transactionBuilder_ == null) {
        transaction_ = null;
        onChanged();
      } else {
        transaction_ = null;
        transactionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     */
    public io.a13s.api.kvstore.v1.Transaction.Builder getTransactionBuilder() {
      
      onChanged();
      return getTransactionFieldBuilder().getBuilder();
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     */
    public io.a13s.api.kvstore.v1.TransactionOrBuilder getTransactionOrBuilder() {
      if (transactionBuilder_ != null) {
        return transactionBuilder_.getMessageOrBuilder();
      } else {
        return transaction_ == null ?
            io.a13s.api.kvstore.v1.Transaction.getDefaultInstance() : transaction_;
      }
    }
    /**
     * <code>.kvstore.v1.Transaction transaction = 2 [json_name = "transaction"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.a13s.api.kvstore.v1.Transaction, io.a13s.api.kvstore.v1.Transaction.Builder, io.a13s.api.kvstore.v1.TransactionOrBuilder> 
        getTransactionFieldBuilder() {
      if (transactionBuilder_ == null) {
        transactionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.a13s.api.kvstore.v1.Transaction, io.a13s.api.kvstore.v1.Transaction.Builder, io.a13s.api.kvstore.v1.TransactionOrBuilder>(
                getTransaction(),
                getParentForChildren(),
                isClean());
        transaction_ = null;
      }
      return transactionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kvstore.v1.CreateBucketResponse)
  }

  // @@protoc_insertion_point(class_scope:kvstore.v1.CreateBucketResponse)
  private static final io.a13s.api.kvstore.v1.CreateBucketResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.a13s.api.kvstore.v1.CreateBucketResponse();
  }

  public static io.a13s.api.kvstore.v1.CreateBucketResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateBucketResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateBucketResponse>() {
    @java.lang.Override
    public CreateBucketResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateBucketResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateBucketResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.a13s.api.kvstore.v1.CreateBucketResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

