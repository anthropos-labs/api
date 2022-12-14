// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kvstore/v1/kv.proto

package io.a13s.api.kvstore.v1;

/**
 * Protobuf type {@code kvstore.v1.CreateAccountResponse}
 */
public final class CreateAccountResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kvstore.v1.CreateAccountResponse)
    CreateAccountResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAccountResponse.newBuilder() to construct.
  private CreateAccountResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAccountResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAccountResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateAccountResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateAccountResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.a13s.api.kvstore.v1.CreateAccountResponse.class, io.a13s.api.kvstore.v1.CreateAccountResponse.Builder.class);
  }

  public static final int ACCOUNT_DESCRIPTOR_FIELD_NUMBER = 1;
  private io.a13s.api.kvstore.v1.AccountDescriptor accountDescriptor_;
  /**
   * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
   * @return Whether the accountDescriptor field is set.
   */
  @java.lang.Override
  public boolean hasAccountDescriptor() {
    return accountDescriptor_ != null;
  }
  /**
   * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
   * @return The accountDescriptor.
   */
  @java.lang.Override
  public io.a13s.api.kvstore.v1.AccountDescriptor getAccountDescriptor() {
    return accountDescriptor_ == null ? io.a13s.api.kvstore.v1.AccountDescriptor.getDefaultInstance() : accountDescriptor_;
  }
  /**
   * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
   */
  @java.lang.Override
  public io.a13s.api.kvstore.v1.AccountDescriptorOrBuilder getAccountDescriptorOrBuilder() {
    return getAccountDescriptor();
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
    if (accountDescriptor_ != null) {
      output.writeMessage(1, getAccountDescriptor());
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
    if (accountDescriptor_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccountDescriptor());
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
    if (!(obj instanceof io.a13s.api.kvstore.v1.CreateAccountResponse)) {
      return super.equals(obj);
    }
    io.a13s.api.kvstore.v1.CreateAccountResponse other = (io.a13s.api.kvstore.v1.CreateAccountResponse) obj;

    if (hasAccountDescriptor() != other.hasAccountDescriptor()) return false;
    if (hasAccountDescriptor()) {
      if (!getAccountDescriptor()
          .equals(other.getAccountDescriptor())) return false;
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
    if (hasAccountDescriptor()) {
      hash = (37 * hash) + ACCOUNT_DESCRIPTOR_FIELD_NUMBER;
      hash = (53 * hash) + getAccountDescriptor().hashCode();
    }
    if (hasTransaction()) {
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.a13s.api.kvstore.v1.CreateAccountResponse parseFrom(
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
  public static Builder newBuilder(io.a13s.api.kvstore.v1.CreateAccountResponse prototype) {
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
   * Protobuf type {@code kvstore.v1.CreateAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kvstore.v1.CreateAccountResponse)
      io.a13s.api.kvstore.v1.CreateAccountResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateAccountResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateAccountResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.a13s.api.kvstore.v1.CreateAccountResponse.class, io.a13s.api.kvstore.v1.CreateAccountResponse.Builder.class);
    }

    // Construct using io.a13s.api.kvstore.v1.CreateAccountResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (accountDescriptorBuilder_ == null) {
        accountDescriptor_ = null;
      } else {
        accountDescriptor_ = null;
        accountDescriptorBuilder_ = null;
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
      return io.a13s.api.kvstore.v1.KvProto.internal_static_kvstore_v1_CreateAccountResponse_descriptor;
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.CreateAccountResponse getDefaultInstanceForType() {
      return io.a13s.api.kvstore.v1.CreateAccountResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.CreateAccountResponse build() {
      io.a13s.api.kvstore.v1.CreateAccountResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.a13s.api.kvstore.v1.CreateAccountResponse buildPartial() {
      io.a13s.api.kvstore.v1.CreateAccountResponse result = new io.a13s.api.kvstore.v1.CreateAccountResponse(this);
      if (accountDescriptorBuilder_ == null) {
        result.accountDescriptor_ = accountDescriptor_;
      } else {
        result.accountDescriptor_ = accountDescriptorBuilder_.build();
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
      if (other instanceof io.a13s.api.kvstore.v1.CreateAccountResponse) {
        return mergeFrom((io.a13s.api.kvstore.v1.CreateAccountResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.a13s.api.kvstore.v1.CreateAccountResponse other) {
      if (other == io.a13s.api.kvstore.v1.CreateAccountResponse.getDefaultInstance()) return this;
      if (other.hasAccountDescriptor()) {
        mergeAccountDescriptor(other.getAccountDescriptor());
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
                  getAccountDescriptorFieldBuilder().getBuilder(),
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

    private io.a13s.api.kvstore.v1.AccountDescriptor accountDescriptor_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.a13s.api.kvstore.v1.AccountDescriptor, io.a13s.api.kvstore.v1.AccountDescriptor.Builder, io.a13s.api.kvstore.v1.AccountDescriptorOrBuilder> accountDescriptorBuilder_;
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     * @return Whether the accountDescriptor field is set.
     */
    public boolean hasAccountDescriptor() {
      return accountDescriptorBuilder_ != null || accountDescriptor_ != null;
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     * @return The accountDescriptor.
     */
    public io.a13s.api.kvstore.v1.AccountDescriptor getAccountDescriptor() {
      if (accountDescriptorBuilder_ == null) {
        return accountDescriptor_ == null ? io.a13s.api.kvstore.v1.AccountDescriptor.getDefaultInstance() : accountDescriptor_;
      } else {
        return accountDescriptorBuilder_.getMessage();
      }
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     */
    public Builder setAccountDescriptor(io.a13s.api.kvstore.v1.AccountDescriptor value) {
      if (accountDescriptorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accountDescriptor_ = value;
        onChanged();
      } else {
        accountDescriptorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     */
    public Builder setAccountDescriptor(
        io.a13s.api.kvstore.v1.AccountDescriptor.Builder builderForValue) {
      if (accountDescriptorBuilder_ == null) {
        accountDescriptor_ = builderForValue.build();
        onChanged();
      } else {
        accountDescriptorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     */
    public Builder mergeAccountDescriptor(io.a13s.api.kvstore.v1.AccountDescriptor value) {
      if (accountDescriptorBuilder_ == null) {
        if (accountDescriptor_ != null) {
          accountDescriptor_ =
            io.a13s.api.kvstore.v1.AccountDescriptor.newBuilder(accountDescriptor_).mergeFrom(value).buildPartial();
        } else {
          accountDescriptor_ = value;
        }
        onChanged();
      } else {
        accountDescriptorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     */
    public Builder clearAccountDescriptor() {
      if (accountDescriptorBuilder_ == null) {
        accountDescriptor_ = null;
        onChanged();
      } else {
        accountDescriptor_ = null;
        accountDescriptorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     */
    public io.a13s.api.kvstore.v1.AccountDescriptor.Builder getAccountDescriptorBuilder() {
      
      onChanged();
      return getAccountDescriptorFieldBuilder().getBuilder();
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     */
    public io.a13s.api.kvstore.v1.AccountDescriptorOrBuilder getAccountDescriptorOrBuilder() {
      if (accountDescriptorBuilder_ != null) {
        return accountDescriptorBuilder_.getMessageOrBuilder();
      } else {
        return accountDescriptor_ == null ?
            io.a13s.api.kvstore.v1.AccountDescriptor.getDefaultInstance() : accountDescriptor_;
      }
    }
    /**
     * <code>.kvstore.v1.AccountDescriptor account_descriptor = 1 [json_name = "accountDescriptor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.a13s.api.kvstore.v1.AccountDescriptor, io.a13s.api.kvstore.v1.AccountDescriptor.Builder, io.a13s.api.kvstore.v1.AccountDescriptorOrBuilder> 
        getAccountDescriptorFieldBuilder() {
      if (accountDescriptorBuilder_ == null) {
        accountDescriptorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.a13s.api.kvstore.v1.AccountDescriptor, io.a13s.api.kvstore.v1.AccountDescriptor.Builder, io.a13s.api.kvstore.v1.AccountDescriptorOrBuilder>(
                getAccountDescriptor(),
                getParentForChildren(),
                isClean());
        accountDescriptor_ = null;
      }
      return accountDescriptorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kvstore.v1.CreateAccountResponse)
  }

  // @@protoc_insertion_point(class_scope:kvstore.v1.CreateAccountResponse)
  private static final io.a13s.api.kvstore.v1.CreateAccountResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.a13s.api.kvstore.v1.CreateAccountResponse();
  }

  public static io.a13s.api.kvstore.v1.CreateAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAccountResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateAccountResponse>() {
    @java.lang.Override
    public CreateAccountResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAccountResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAccountResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.a13s.api.kvstore.v1.CreateAccountResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

