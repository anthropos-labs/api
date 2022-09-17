// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft/v1/raft_shard.proto

package io.a13s.api.raft.v1;

public interface StopReplicaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:raft.v1.StopReplicaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * shard_id is the unique value used to identify a Raft cluster.
   * </pre>
   *
   * <code>uint64 shard_id = 1 [json_name = "shardId"];</code>
   * @return The shardId.
   */
  long getShardId();
}
