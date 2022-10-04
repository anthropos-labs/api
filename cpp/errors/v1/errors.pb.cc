// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: errors/v1/errors.proto

#include "errors/v1/errors.pb.h"

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

namespace errors {
namespace v1 {
PROTOBUF_CONSTEXPR Error::Error(
    ::_pbi::ConstantInitialized): _impl_{
    /*decltype(_impl_.message_)*/{&::_pbi::fixed_address_empty_string, ::_pbi::ConstantInitialized{}}
  , /*decltype(_impl_.code_)*/0
  , /*decltype(_impl_._cached_size_)*/{}} {}
struct ErrorDefaultTypeInternal {
  PROTOBUF_CONSTEXPR ErrorDefaultTypeInternal()
      : _instance(::_pbi::ConstantInitialized{}) {}
  ~ErrorDefaultTypeInternal() {}
  union {
    Error _instance;
  };
};
PROTOBUF_ATTRIBUTE_NO_DESTROY PROTOBUF_CONSTINIT PROTOBUF_ATTRIBUTE_INIT_PRIORITY1 ErrorDefaultTypeInternal _Error_default_instance_;
}  // namespace v1
}  // namespace errors
static ::_pb::Metadata file_level_metadata_errors_2fv1_2ferrors_2eproto[1];
static constexpr ::_pb::EnumDescriptor const** file_level_enum_descriptors_errors_2fv1_2ferrors_2eproto = nullptr;
static constexpr ::_pb::ServiceDescriptor const** file_level_service_descriptors_errors_2fv1_2ferrors_2eproto = nullptr;

const uint32_t TableStruct_errors_2fv1_2ferrors_2eproto::offsets[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  ~0u,  // no _has_bits_
  PROTOBUF_FIELD_OFFSET(::errors::v1::Error, _internal_metadata_),
  ~0u,  // no _extensions_
  ~0u,  // no _oneof_case_
  ~0u,  // no _weak_field_map_
  ~0u,  // no _inlined_string_donated_
  PROTOBUF_FIELD_OFFSET(::errors::v1::Error, _impl_.code_),
  PROTOBUF_FIELD_OFFSET(::errors::v1::Error, _impl_.message_),
};
static const ::_pbi::MigrationSchema schemas[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) = {
  { 0, -1, -1, sizeof(::errors::v1::Error)},
};

static const ::_pb::Message* const file_default_instances[] = {
  &::errors::v1::_Error_default_instance_._instance,
};

const char descriptor_table_protodef_errors_2fv1_2ferrors_2eproto[] PROTOBUF_SECTION_VARIABLE(protodesc_cold) =
  "\n\026errors/v1/errors.proto\022\terrors.v1\032\033err"
  "ors/v1/error_codes.proto\"F\n\005Error\022#\n\004cod"
  "e\030\001 \001(\0162\017.errors.v1.CodeR\004code\022\030\n\007messag"
  "e\030\002 \001(\tR\007messageB\211\001\n\025io.a13s.api.errors."
  "v1B\013ErrorsProtoP\001Z\036a13s.io/api/errors/v1"
  ";errorsv1\242\002\003EXX\252\002\tErrors.V1\312\002\tErrors\\V1\342"
  "\002\025Errors\\V1\\GPBMetadata\352\002\nErrors::V1b\006pr"
  "oto3"
  ;
static const ::_pbi::DescriptorTable* const descriptor_table_errors_2fv1_2ferrors_2eproto_deps[1] = {
  &::descriptor_table_errors_2fv1_2ferror_5fcodes_2eproto,
};
static ::_pbi::once_flag descriptor_table_errors_2fv1_2ferrors_2eproto_once;
const ::_pbi::DescriptorTable descriptor_table_errors_2fv1_2ferrors_2eproto = {
    false, false, 284, descriptor_table_protodef_errors_2fv1_2ferrors_2eproto,
    "errors/v1/errors.proto",
    &descriptor_table_errors_2fv1_2ferrors_2eproto_once, descriptor_table_errors_2fv1_2ferrors_2eproto_deps, 1, 1,
    schemas, file_default_instances, TableStruct_errors_2fv1_2ferrors_2eproto::offsets,
    file_level_metadata_errors_2fv1_2ferrors_2eproto, file_level_enum_descriptors_errors_2fv1_2ferrors_2eproto,
    file_level_service_descriptors_errors_2fv1_2ferrors_2eproto,
};
PROTOBUF_ATTRIBUTE_WEAK const ::_pbi::DescriptorTable* descriptor_table_errors_2fv1_2ferrors_2eproto_getter() {
  return &descriptor_table_errors_2fv1_2ferrors_2eproto;
}

// Force running AddDescriptors() at dynamic initialization time.
PROTOBUF_ATTRIBUTE_INIT_PRIORITY2 static ::_pbi::AddDescriptorsRunner dynamic_init_dummy_errors_2fv1_2ferrors_2eproto(&descriptor_table_errors_2fv1_2ferrors_2eproto);
namespace errors {
namespace v1 {

// ===================================================================

class Error::_Internal {
 public:
};

Error::Error(::PROTOBUF_NAMESPACE_ID::Arena* arena,
                         bool is_message_owned)
  : ::PROTOBUF_NAMESPACE_ID::Message(arena, is_message_owned) {
  SharedCtor(arena, is_message_owned);
  // @@protoc_insertion_point(arena_constructor:errors.v1.Error)
}
Error::Error(const Error& from)
  : ::PROTOBUF_NAMESPACE_ID::Message() {
  Error* const _this = this; (void)_this;
  new (&_impl_) Impl_{
      decltype(_impl_.message_){}
    , decltype(_impl_.code_){}
    , /*decltype(_impl_._cached_size_)*/{}};

  _internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
  _impl_.message_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.message_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
  if (!from._internal_message().empty()) {
    _this->_impl_.message_.Set(from._internal_message(), 
      _this->GetArenaForAllocation());
  }
  _this->_impl_.code_ = from._impl_.code_;
  // @@protoc_insertion_point(copy_constructor:errors.v1.Error)
}

inline void Error::SharedCtor(
    ::_pb::Arena* arena, bool is_message_owned) {
  (void)arena;
  (void)is_message_owned;
  new (&_impl_) Impl_{
      decltype(_impl_.message_){}
    , decltype(_impl_.code_){0}
    , /*decltype(_impl_._cached_size_)*/{}
  };
  _impl_.message_.InitDefault();
  #ifdef PROTOBUF_FORCE_COPY_DEFAULT_STRING
    _impl_.message_.Set("", GetArenaForAllocation());
  #endif // PROTOBUF_FORCE_COPY_DEFAULT_STRING
}

Error::~Error() {
  // @@protoc_insertion_point(destructor:errors.v1.Error)
  if (auto *arena = _internal_metadata_.DeleteReturnArena<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>()) {
  (void)arena;
    return;
  }
  SharedDtor();
}

inline void Error::SharedDtor() {
  GOOGLE_DCHECK(GetArenaForAllocation() == nullptr);
  _impl_.message_.Destroy();
}

void Error::SetCachedSize(int size) const {
  _impl_._cached_size_.Set(size);
}

void Error::Clear() {
// @@protoc_insertion_point(message_clear_start:errors.v1.Error)
  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  _impl_.message_.ClearToEmpty();
  _impl_.code_ = 0;
  _internal_metadata_.Clear<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>();
}

const char* Error::_InternalParse(const char* ptr, ::_pbi::ParseContext* ctx) {
#define CHK_(x) if (PROTOBUF_PREDICT_FALSE(!(x))) goto failure
  while (!ctx->Done(&ptr)) {
    uint32_t tag;
    ptr = ::_pbi::ReadTag(ptr, &tag);
    switch (tag >> 3) {
      // .errors.v1.Code code = 1 [json_name = "code"];
      case 1:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 8)) {
          uint64_t val = ::PROTOBUF_NAMESPACE_ID::internal::ReadVarint64(&ptr);
          CHK_(ptr);
          _internal_set_code(static_cast<::errors::v1::Code>(val));
        } else
          goto handle_unusual;
        continue;
      // string message = 2 [json_name = "message"];
      case 2:
        if (PROTOBUF_PREDICT_TRUE(static_cast<uint8_t>(tag) == 18)) {
          auto str = _internal_mutable_message();
          ptr = ::_pbi::InlineGreedyStringParser(str, ptr, ctx);
          CHK_(ptr);
          CHK_(::_pbi::VerifyUTF8(str, "errors.v1.Error.message"));
        } else
          goto handle_unusual;
        continue;
      default:
        goto handle_unusual;
    }  // switch
  handle_unusual:
    if ((tag == 0) || ((tag & 7) == 4)) {
      CHK_(ptr);
      ctx->SetLastTag(tag);
      goto message_done;
    }
    ptr = UnknownFieldParse(
        tag,
        _internal_metadata_.mutable_unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(),
        ptr, ctx);
    CHK_(ptr != nullptr);
  }  // while
message_done:
  return ptr;
failure:
  ptr = nullptr;
  goto message_done;
#undef CHK_
}

uint8_t* Error::_InternalSerialize(
    uint8_t* target, ::PROTOBUF_NAMESPACE_ID::io::EpsCopyOutputStream* stream) const {
  // @@protoc_insertion_point(serialize_to_array_start:errors.v1.Error)
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  // .errors.v1.Code code = 1 [json_name = "code"];
  if (this->_internal_code() != 0) {
    target = stream->EnsureSpace(target);
    target = ::_pbi::WireFormatLite::WriteEnumToArray(
      1, this->_internal_code(), target);
  }

  // string message = 2 [json_name = "message"];
  if (!this->_internal_message().empty()) {
    ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::VerifyUtf8String(
      this->_internal_message().data(), static_cast<int>(this->_internal_message().length()),
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::SERIALIZE,
      "errors.v1.Error.message");
    target = stream->WriteStringMaybeAliased(
        2, this->_internal_message(), target);
  }

  if (PROTOBUF_PREDICT_FALSE(_internal_metadata_.have_unknown_fields())) {
    target = ::_pbi::WireFormat::InternalSerializeUnknownFieldsToArray(
        _internal_metadata_.unknown_fields<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(::PROTOBUF_NAMESPACE_ID::UnknownFieldSet::default_instance), target, stream);
  }
  // @@protoc_insertion_point(serialize_to_array_end:errors.v1.Error)
  return target;
}

size_t Error::ByteSizeLong() const {
// @@protoc_insertion_point(message_byte_size_start:errors.v1.Error)
  size_t total_size = 0;

  uint32_t cached_has_bits = 0;
  // Prevent compiler warnings about cached_has_bits being unused
  (void) cached_has_bits;

  // string message = 2 [json_name = "message"];
  if (!this->_internal_message().empty()) {
    total_size += 1 +
      ::PROTOBUF_NAMESPACE_ID::internal::WireFormatLite::StringSize(
        this->_internal_message());
  }

  // .errors.v1.Code code = 1 [json_name = "code"];
  if (this->_internal_code() != 0) {
    total_size += 1 +
      ::_pbi::WireFormatLite::EnumSize(this->_internal_code());
  }

  return MaybeComputeUnknownFieldsSize(total_size, &_impl_._cached_size_);
}

const ::PROTOBUF_NAMESPACE_ID::Message::ClassData Error::_class_data_ = {
    ::PROTOBUF_NAMESPACE_ID::Message::CopyWithSourceCheck,
    Error::MergeImpl
};
const ::PROTOBUF_NAMESPACE_ID::Message::ClassData*Error::GetClassData() const { return &_class_data_; }


void Error::MergeImpl(::PROTOBUF_NAMESPACE_ID::Message& to_msg, const ::PROTOBUF_NAMESPACE_ID::Message& from_msg) {
  auto* const _this = static_cast<Error*>(&to_msg);
  auto& from = static_cast<const Error&>(from_msg);
  // @@protoc_insertion_point(class_specific_merge_from_start:errors.v1.Error)
  GOOGLE_DCHECK_NE(&from, _this);
  uint32_t cached_has_bits = 0;
  (void) cached_has_bits;

  if (!from._internal_message().empty()) {
    _this->_internal_set_message(from._internal_message());
  }
  if (from._internal_code() != 0) {
    _this->_internal_set_code(from._internal_code());
  }
  _this->_internal_metadata_.MergeFrom<::PROTOBUF_NAMESPACE_ID::UnknownFieldSet>(from._internal_metadata_);
}

void Error::CopyFrom(const Error& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:errors.v1.Error)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool Error::IsInitialized() const {
  return true;
}

void Error::InternalSwap(Error* other) {
  using std::swap;
  auto* lhs_arena = GetArenaForAllocation();
  auto* rhs_arena = other->GetArenaForAllocation();
  _internal_metadata_.InternalSwap(&other->_internal_metadata_);
  ::PROTOBUF_NAMESPACE_ID::internal::ArenaStringPtr::InternalSwap(
      &_impl_.message_, lhs_arena,
      &other->_impl_.message_, rhs_arena
  );
  swap(_impl_.code_, other->_impl_.code_);
}

::PROTOBUF_NAMESPACE_ID::Metadata Error::GetMetadata() const {
  return ::_pbi::AssignDescriptors(
      &descriptor_table_errors_2fv1_2ferrors_2eproto_getter, &descriptor_table_errors_2fv1_2ferrors_2eproto_once,
      file_level_metadata_errors_2fv1_2ferrors_2eproto[0]);
}

// @@protoc_insertion_point(namespace_scope)
}  // namespace v1
}  // namespace errors
PROTOBUF_NAMESPACE_OPEN
template<> PROTOBUF_NOINLINE ::errors::v1::Error*
Arena::CreateMaybeMessage< ::errors::v1::Error >(Arena* arena) {
  return Arena::CreateMessageInternal< ::errors::v1::Error >(arena);
}
PROTOBUF_NAMESPACE_CLOSE

// @@protoc_insertion_point(global_scope)
#include <google/protobuf/port_undef.inc>
