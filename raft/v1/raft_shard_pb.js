// @generated by protoc-gen-es v0.1.1 with parameter "target=js+dts"
// @generated from file raft/v1/raft_shard.proto (package raft.v1, syntax proto3)
/* eslint-disable */
/* @ts-nocheck */

import {proto3, Timestamp} from "@bufbuild/protobuf";

/**
 * @generated from enum raft.v1.StateMachineType
 */
export const StateMachineType = proto3.makeEnum(
  "raft.v1.StateMachineType",
  [
    {no: 0, name: "STATE_MACHINE_TYPE_UNSPECIFIED", localName: "UNSPECIFIED"},
    {no: 1, name: "STATE_MACHINE_TYPE_TEST", localName: "TEST"},
    {no: 2, name: "STATE_MACHINE_TYPE_KV", localName: "KV"},
  ],
);

/**
 * @generated from message raft.v1.ShardStateEvent
 */
export const ShardStateEvent = proto3.makeMessageType(
  "raft.v1.ShardStateEvent",
  () => [
    { no: 1, name: "cmd", kind: "enum", T: proto3.getEnumType(ShardStateEvent_CmdType) },
    { no: 2, name: "event", kind: "message", T: ShardState },
  ],
);

/**
 * @generated from enum raft.v1.ShardStateEvent.CmdType
 */
export const ShardStateEvent_CmdType = proto3.makeEnum(
  "raft.v1.ShardStateEvent.CmdType",
  [
    {no: 0, name: "CMD_TYPE_UNSPECIFIED", localName: "UNSPECIFIED"},
    {no: 1, name: "CMD_TYPE_PUT", localName: "PUT"},
    {no: 2, name: "CMD_TYPE_DELETE", localName: "DELETE"},
  ],
);

/**
 * @generated from message raft.v1.ShardState
 */
export const ShardState = proto3.makeMessageType(
  "raft.v1.ShardState",
  () => [
    { no: 1, name: "last_updated", kind: "message", T: Timestamp },
    { no: 2, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "config_change_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 4, name: "replicas", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 5, name: "observers", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 6, name: "witnesses", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 7, name: "removed", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 8, name: "type", kind: "enum", T: proto3.getEnumType(StateMachineType) },
  ],
);

/**
 * @generated from message raft.v1.AddReplicaRequest
 */
export const AddReplicaRequest = proto3.makeMessageType(
  "raft.v1.AddReplicaRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 4, name: "hostname", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 5, name: "timeout", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
  ],
);

/**
 * @generated from message raft.v1.AddReplicaResponse
 */
export const AddReplicaResponse = proto3.makeMessageType(
  "raft.v1.AddReplicaResponse",
  [],
);

/**
 * @generated from message raft.v1.AddReplicaObserverRequest
 */
export const AddReplicaObserverRequest = proto3.makeMessageType(
  "raft.v1.AddReplicaObserverRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "hostname", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "timeout", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
  ],
);

/**
 * @generated from message raft.v1.AddReplicaObserverResponse
 */
export const AddReplicaObserverResponse = proto3.makeMessageType(
  "raft.v1.AddReplicaObserverResponse",
  [],
);

/**
 * @generated from message raft.v1.AddReplicaWitnessRequest
 */
export const AddReplicaWitnessRequest = proto3.makeMessageType(
  "raft.v1.AddReplicaWitnessRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "hostname", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 4, name: "timeout", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
  ],
);

/**
 * @generated from message raft.v1.AddReplicaWitnessResponse
 */
export const AddReplicaWitnessResponse = proto3.makeMessageType(
  "raft.v1.AddReplicaWitnessResponse",
  [],
);

/**
 * @generated from message raft.v1.RemoveReplicaRequest
 */
export const RemoveReplicaRequest = proto3.makeMessageType(
  "raft.v1.RemoveReplicaRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "timeout", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
  ],
);

/**
 * @generated from message raft.v1.RemoveReplicaResponse
 */
export const RemoveReplicaResponse = proto3.makeMessageType(
  "raft.v1.RemoveReplicaResponse",
  [],
);

/**
 * @generated from message raft.v1.GetLeaderIdRequest
 */
export const GetLeaderIdRequest = proto3.makeMessageType(
  "raft.v1.GetLeaderIdRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "timeout", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
  ],
);

/**
 * @generated from message raft.v1.GetLeaderIdResponse
 */
export const GetLeaderIdResponse = proto3.makeMessageType(
  "raft.v1.GetLeaderIdResponse",
  () => [
    { no: 1, name: "leader", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "available", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
  ],
);

/**
 * @generated from message raft.v1.GetShardMembersRequest
 */
export const GetShardMembersRequest = proto3.makeMessageType(
  "raft.v1.GetShardMembersRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
  ],
);

/**
 * @generated from message raft.v1.GetShardMembersResponse
 */
export const GetShardMembersResponse = proto3.makeMessageType(
  "raft.v1.GetShardMembersResponse",
  () => [
    { no: 1, name: "config_change_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replicas", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 3, name: "observers", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 4, name: "witnesses", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
    { no: 5, name: "removed", kind: "map", K: 4 /* ScalarType.UINT64 */, V: {kind: "scalar", T: 9 /* ScalarType.STRING */} },
  ],
);

/**
 * @generated from message raft.v1.NewShardRequest
 */
export const NewShardRequest = proto3.makeMessageType(
  "raft.v1.NewShardRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "type", kind: "enum", T: proto3.getEnumType(StateMachineType) },
    { no: 4, name: "hostname", kind: "scalar", T: 9 /* ScalarType.STRING */ },
    { no: 5, name: "timeout", kind: "scalar", T: 3 /* ScalarType.INT64 */ },
  ],
);

/**
 * @generated from message raft.v1.NewShardResponse
 */
export const NewShardResponse = proto3.makeMessageType(
  "raft.v1.NewShardResponse",
  [],
);

/**
 * @generated from message raft.v1.RemoveDataRequest
 */
export const RemoveDataRequest = proto3.makeMessageType(
  "raft.v1.RemoveDataRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
  ],
);

/**
 * @generated from message raft.v1.RemoveDataResponse
 */
export const RemoveDataResponse = proto3.makeMessageType(
  "raft.v1.RemoveDataResponse",
  [],
);

/**
 * @generated from message raft.v1.StartReplicaRequest
 */
export const StartReplicaRequest = proto3.makeMessageType(
  "raft.v1.StartReplicaRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "type", kind: "enum", T: proto3.getEnumType(StateMachineType) },
    { no: 4, name: "restart", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
  ],
);

/**
 * @generated from message raft.v1.StartReplicaResponse
 */
export const StartReplicaResponse = proto3.makeMessageType(
  "raft.v1.StartReplicaResponse",
  [],
);

/**
 * @generated from message raft.v1.StartReplicaObserverRequest
 */
export const StartReplicaObserverRequest = proto3.makeMessageType(
  "raft.v1.StartReplicaObserverRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 3, name: "type", kind: "enum", T: proto3.getEnumType(StateMachineType) },
    { no: 4, name: "restart", kind: "scalar", T: 8 /* ScalarType.BOOL */ },
  ],
);

/**
 * @generated from message raft.v1.StartReplicaObserverResponse
 */
export const StartReplicaObserverResponse = proto3.makeMessageType(
  "raft.v1.StartReplicaObserverResponse",
  [],
);

/**
 * @generated from message raft.v1.StopReplicaRequest
 */
export const StopReplicaRequest = proto3.makeMessageType(
  "raft.v1.StopReplicaRequest",
  () => [
    { no: 1, name: "shard_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
    { no: 2, name: "replica_id", kind: "scalar", T: 4 /* ScalarType.UINT64 */ },
  ],
);

/**
 * @generated from message raft.v1.StopReplicaResponse
 */
export const StopReplicaResponse = proto3.makeMessageType(
  "raft.v1.StopReplicaResponse",
  [],
);

