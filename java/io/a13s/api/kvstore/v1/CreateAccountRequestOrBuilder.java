// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kvstore/v1/kv.proto

package io.a13s.api.kvstore.v1;

public interface CreateAccountRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kvstore.v1.CreateAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 account_id = 1 [json_name = "accountId"];</code>
   * @return The accountId.
   */
  long getAccountId();

  /**
   * <code>string owner = 2 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 2 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>.kvstore.v1.Transaction transaction = 3 [json_name = "transaction"];</code>
   * @return Whether the transaction field is set.
   */
  boolean hasTransaction();
  /**
   * <code>.kvstore.v1.Transaction transaction = 3 [json_name = "transaction"];</code>
   * @return The transaction.
   */
  io.a13s.api.kvstore.v1.Transaction getTransaction();
  /**
   * <code>.kvstore.v1.Transaction transaction = 3 [json_name = "transaction"];</code>
   */
  io.a13s.api.kvstore.v1.TransactionOrBuilder getTransactionOrBuilder();
}
