// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: raft/v1/service.proto

#include "raft/v1/service.pb.h"

#include <algorithm>

#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/wire_format_lite.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)
#include <google/protobuf/port_def.inc>

PROTOBUF_PRAGMA_INIT_SEG

namespace _pb = ::PROTOBUF_NAMESPACE_ID;
namespace _pbi = _pb::internal;

namespace raft {
namespace v1 {
}  // namespace v1
}  // namespace raft
static constexpr ::_pb::EnumDescriptor const** file_level_enum_descriptors_raft_2fv1_2fservice_2eproto = nullptr;
static constexpr ::_pb::ServiceDescriptor const** file_level_service_descriptors_raft_2fv1_2fservice_2eproto = nullptr;
const uint32_t TableStruct_raft_2fv1_2fservice_2eproto::offsets[1] = {};
static constexpr ::_pbi::MigrationSchema* schemas = nullptr;
static constexpr ::_pb::Message* const* file_default_instances = nullptr;

const char descriptor_table_protodef_raft_2fv1_2fservice_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\025raft/v1/service.proto\022\007raft.v1\032\027raft/v"
  "1/raft_host.proto\032\030raft/v1/raft_shard.pr"
  "oto2\204\007\n\014ShardService\022E\n\nAddReplica\022\032.raf"
  "t.v1.AddReplicaRequest\032\033.raft.v1.AddRepl"
  "icaResponse\022]\n\022AddReplicaObserver\022\".raft"
  ".v1.AddReplicaObserverRequest\032#.raft.v1."
  "AddReplicaObserverResponse\022Z\n\021AddReplica"
  "Witness\022!.raft.v1.AddReplicaWitnessReque"
  "st\032\".raft.v1.AddReplicaWitnessResponse\022H"
  "\n\013GetLeaderId\022\033.raft.v1.GetLeaderIdReque"
  "st\032\034.raft.v1.GetLeaderIdResponse\022T\n\017GetS"
  "hardMembers\022\037.raft.v1.GetShardMembersReq"
  "uest\032 .raft.v1.GetShardMembersResponse\022\?"
  "\n\010NewShard\022\030.raft.v1.NewShardRequest\032\031.r"
  "aft.v1.NewShardResponse\022E\n\nRemoveData\022\032."
  "raft.v1.RemoveDataRequest\032\033.raft.v1.Remo"
  "veDataResponse\022N\n\rRemoveReplica\022\035.raft.v"
  "1.RemoveReplicaRequest\032\036.raft.v1.RemoveR"
  "eplicaResponse\022K\n\014StartReplica\022\034.raft.v1"
  ".StartReplicaRequest\032\035.raft.v1.StartRepl"
  "icaResponse\022c\n\024StartReplicaObserver\022$.ra"
  "ft.v1.StartReplicaObserverRequest\032%.raft"
  ".v1.StartReplicaObserverResponse\022H\n\013Stop"
  "Replica\022\033.raft.v1.StopReplicaRequest\032\034.r"
  "aft.v1.StopReplicaResponse2\221\002\n\013HostServi"
  "ce\022<\n\007Compact\022\027.raft.v1.CompactRequest\032\030"
  ".raft.v1.CompactResponse\022N\n\rGetHostConfi"
  "g\022\035.raft.v1.GetHostConfigRequest\032\036.raft."
  "v1.GetHostConfigResponse\022\?\n\010Snapshot\022\030.r"
  "aft.v1.SnapshotRequest\032\031.raft.v1.Snapsho"
  "tResponse\0223\n\004Stop\022\024.raft.v1.StopRequest\032"
  "\025.raft.v1.StopResponseB|\n\023io.a13s.api.ra"
  "ft.v1B\014ServiceProtoP\001Z\032a13s.io/api/raft/"
  "v1;raftv1\242\002\003RXX\252\002\007Raft.V1\312\002\007Raft\\V1\342\002\023Ra"
  "ft\\V1\\GPBMetadata\352\002\010Raft::V1b\006proto3"
  ;
static const ::_pbi::DescriptorTable* const descriptor_table_raft_2fv1_2fservice_2eproto_deps[2] = {
  &::descriptor_table_raft_2fv1_2fraft_5fhost_2eproto,
  &::descriptor_table_raft_2fv1_2fraft_5fshard_2eproto,
};
static ::_pbi::once_flag descriptor_table_raft_2fv1_2fservice_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_raft_2fv1_2fservice_2eproto = {
    false, false, 1396, descriptor_table_protodef_raft_2fv1_2fservice_2eproto,
    "raft/v1/service.proto",
    &descriptor_table_raft_2fv1_2fservice_2eproto_once, descriptor_table_raft_2fv1_2fservice_2eproto_deps, 2, 0,
    schemas, file_default_instances, TableStruct_raft_2fv1_2fservice_2eproto::offsets,
    nullptr, file_level_enum_descriptors_raft_2fv1_2fservice_2eproto,
    file_level_service_descriptors_raft_2fv1_2fservice_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_raft_2fv1_2fservice_2eproto_getter() {
  return &descriptor_table_raft_2fv1_2fservice_2eproto;
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2 static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_raft_2fv1_2fservice_2eproto(&descriptor_table_raft_2fv1_2fservice_2eproto);
namespace raft {
namespace v1 {

// @@protoc_insertion_point(namespace_scope)
}  // namespace v1
}  // namespace raft
PROTOBUF_NAMESPACE_OPEN
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
