// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kvstore/v1/kv.proto

package io.a13s.api.kvstore.v1;

public interface DeleteKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kvstore.v1.DeleteKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool ok = 1 [json_name = "ok"];</code>
   * @return The ok.
   */
  boolean getOk();

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
