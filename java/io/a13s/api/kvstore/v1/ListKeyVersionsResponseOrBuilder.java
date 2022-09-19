// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kvstore/v1/kv.proto

package io.a13s.api.kvstore.v1;

public interface ListKeyVersionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kvstore.v1.ListKeyVersionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 versions = 1 [json_name = "versions"];</code>
   * @return A list containing the versions.
   */
  java.util.List<java.lang.Integer> getVersionsList();
  /**
   * <code>repeated uint32 versions = 1 [json_name = "versions"];</code>
   * @return The count of versions.
   */
  int getVersionsCount();
  /**
   * <code>repeated uint32 versions = 1 [json_name = "versions"];</code>
   * @param index The index of the element to return.
   * @return The versions at the given index.
   */
  int getVersions(int index);
}
