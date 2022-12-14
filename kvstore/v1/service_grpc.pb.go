// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             (unknown)
// source: kvstore/v1/service.proto

package kvstorev1

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// KvStoreServiceClient is the client API for KvStoreService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type KvStoreServiceClient interface {
	CreateAccount(ctx context.Context, in *CreateAccountRequest, opts ...grpc.CallOption) (*CreateAccountResponse, error)
	DeleteAccount(ctx context.Context, in *DeleteAccountRequest, opts ...grpc.CallOption) (*DeleteAccountResponse, error)
	CreateBucket(ctx context.Context, in *CreateBucketRequest, opts ...grpc.CallOption) (*CreateBucketResponse, error)
	DeleteBucket(ctx context.Context, in *DeleteBucketRequest, opts ...grpc.CallOption) (*DeleteBucketResponse, error)
	GetKey(ctx context.Context, in *GetKeyRequest, opts ...grpc.CallOption) (*GetKeyResponse, error)
	PutKey(ctx context.Context, in *PutKeyRequest, opts ...grpc.CallOption) (*PutKeyResponse, error)
	DeleteKey(ctx context.Context, in *DeleteKeyRequest, opts ...grpc.CallOption) (*DeleteKeyResponse, error)
}

type kvStoreServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewKvStoreServiceClient(cc grpc.ClientConnInterface) KvStoreServiceClient {
	return &kvStoreServiceClient{cc}
}

func (c *kvStoreServiceClient) CreateAccount(ctx context.Context, in *CreateAccountRequest, opts ...grpc.CallOption) (*CreateAccountResponse, error) {
	out := new(CreateAccountResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.KvStoreService/CreateAccount", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kvStoreServiceClient) DeleteAccount(ctx context.Context, in *DeleteAccountRequest, opts ...grpc.CallOption) (*DeleteAccountResponse, error) {
	out := new(DeleteAccountResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.KvStoreService/DeleteAccount", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kvStoreServiceClient) CreateBucket(ctx context.Context, in *CreateBucketRequest, opts ...grpc.CallOption) (*CreateBucketResponse, error) {
	out := new(CreateBucketResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.KvStoreService/CreateBucket", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kvStoreServiceClient) DeleteBucket(ctx context.Context, in *DeleteBucketRequest, opts ...grpc.CallOption) (*DeleteBucketResponse, error) {
	out := new(DeleteBucketResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.KvStoreService/DeleteBucket", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kvStoreServiceClient) GetKey(ctx context.Context, in *GetKeyRequest, opts ...grpc.CallOption) (*GetKeyResponse, error) {
	out := new(GetKeyResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.KvStoreService/GetKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kvStoreServiceClient) PutKey(ctx context.Context, in *PutKeyRequest, opts ...grpc.CallOption) (*PutKeyResponse, error) {
	out := new(PutKeyResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.KvStoreService/PutKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *kvStoreServiceClient) DeleteKey(ctx context.Context, in *DeleteKeyRequest, opts ...grpc.CallOption) (*DeleteKeyResponse, error) {
	out := new(DeleteKeyResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.KvStoreService/DeleteKey", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// KvStoreServiceServer is the server API for KvStoreService service.
// All implementations should embed UnimplementedKvStoreServiceServer
// for forward compatibility
type KvStoreServiceServer interface {
	CreateAccount(context.Context, *CreateAccountRequest) (*CreateAccountResponse, error)
	DeleteAccount(context.Context, *DeleteAccountRequest) (*DeleteAccountResponse, error)
	CreateBucket(context.Context, *CreateBucketRequest) (*CreateBucketResponse, error)
	DeleteBucket(context.Context, *DeleteBucketRequest) (*DeleteBucketResponse, error)
	GetKey(context.Context, *GetKeyRequest) (*GetKeyResponse, error)
	PutKey(context.Context, *PutKeyRequest) (*PutKeyResponse, error)
	DeleteKey(context.Context, *DeleteKeyRequest) (*DeleteKeyResponse, error)
}

// UnimplementedKvStoreServiceServer should be embedded to have forward compatible implementations.
type UnimplementedKvStoreServiceServer struct {
}

func (UnimplementedKvStoreServiceServer) CreateAccount(context.Context, *CreateAccountRequest) (*CreateAccountResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateAccount not implemented")
}
func (UnimplementedKvStoreServiceServer) DeleteAccount(context.Context, *DeleteAccountRequest) (*DeleteAccountResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteAccount not implemented")
}
func (UnimplementedKvStoreServiceServer) CreateBucket(context.Context, *CreateBucketRequest) (*CreateBucketResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateBucket not implemented")
}
func (UnimplementedKvStoreServiceServer) DeleteBucket(context.Context, *DeleteBucketRequest) (*DeleteBucketResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteBucket not implemented")
}
func (UnimplementedKvStoreServiceServer) GetKey(context.Context, *GetKeyRequest) (*GetKeyResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetKey not implemented")
}
func (UnimplementedKvStoreServiceServer) PutKey(context.Context, *PutKeyRequest) (*PutKeyResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method PutKey not implemented")
}
func (UnimplementedKvStoreServiceServer) DeleteKey(context.Context, *DeleteKeyRequest) (*DeleteKeyResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteKey not implemented")
}

// UnsafeKvStoreServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to KvStoreServiceServer will
// result in compilation errors.
type UnsafeKvStoreServiceServer interface {
	mustEmbedUnimplementedKvStoreServiceServer()
}

func RegisterKvStoreServiceServer(s grpc.ServiceRegistrar, srv KvStoreServiceServer) {
	s.RegisterService(&KvStoreService_ServiceDesc, srv)
}

func _KvStoreService_CreateAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateAccountRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KvStoreServiceServer).CreateAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.KvStoreService/CreateAccount",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KvStoreServiceServer).CreateAccount(ctx, req.(*CreateAccountRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KvStoreService_DeleteAccount_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteAccountRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KvStoreServiceServer).DeleteAccount(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.KvStoreService/DeleteAccount",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KvStoreServiceServer).DeleteAccount(ctx, req.(*DeleteAccountRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KvStoreService_CreateBucket_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateBucketRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KvStoreServiceServer).CreateBucket(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.KvStoreService/CreateBucket",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KvStoreServiceServer).CreateBucket(ctx, req.(*CreateBucketRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KvStoreService_DeleteBucket_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteBucketRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KvStoreServiceServer).DeleteBucket(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.KvStoreService/DeleteBucket",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KvStoreServiceServer).DeleteBucket(ctx, req.(*DeleteBucketRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KvStoreService_GetKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetKeyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KvStoreServiceServer).GetKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.KvStoreService/GetKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KvStoreServiceServer).GetKey(ctx, req.(*GetKeyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KvStoreService_PutKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(PutKeyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KvStoreServiceServer).PutKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.KvStoreService/PutKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KvStoreServiceServer).PutKey(ctx, req.(*PutKeyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _KvStoreService_DeleteKey_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteKeyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(KvStoreServiceServer).DeleteKey(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.KvStoreService/DeleteKey",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(KvStoreServiceServer).DeleteKey(ctx, req.(*DeleteKeyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// KvStoreService_ServiceDesc is the grpc.ServiceDesc for KvStoreService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var KvStoreService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "kvstore.v1.KvStoreService",
	HandlerType: (*KvStoreServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateAccount",
			Handler:    _KvStoreService_CreateAccount_Handler,
		},
		{
			MethodName: "DeleteAccount",
			Handler:    _KvStoreService_DeleteAccount_Handler,
		},
		{
			MethodName: "CreateBucket",
			Handler:    _KvStoreService_CreateBucket_Handler,
		},
		{
			MethodName: "DeleteBucket",
			Handler:    _KvStoreService_DeleteBucket_Handler,
		},
		{
			MethodName: "GetKey",
			Handler:    _KvStoreService_GetKey_Handler,
		},
		{
			MethodName: "PutKey",
			Handler:    _KvStoreService_PutKey_Handler,
		},
		{
			MethodName: "DeleteKey",
			Handler:    _KvStoreService_DeleteKey_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "kvstore/v1/service.proto",
}

// TransactionsServiceClient is the client API for TransactionsService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type TransactionsServiceClient interface {
	NewTransaction(ctx context.Context, in *NewTransactionRequest, opts ...grpc.CallOption) (*NewTransactionResponse, error)
	CloseTransaction(ctx context.Context, in *CloseTransactionRequest, opts ...grpc.CallOption) (*CloseTransactionResponse, error)
	Commit(ctx context.Context, in *CommitRequest, opts ...grpc.CallOption) (*CommitResponse, error)
}

type transactionsServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewTransactionsServiceClient(cc grpc.ClientConnInterface) TransactionsServiceClient {
	return &transactionsServiceClient{cc}
}

func (c *transactionsServiceClient) NewTransaction(ctx context.Context, in *NewTransactionRequest, opts ...grpc.CallOption) (*NewTransactionResponse, error) {
	out := new(NewTransactionResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.TransactionsService/NewTransaction", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *transactionsServiceClient) CloseTransaction(ctx context.Context, in *CloseTransactionRequest, opts ...grpc.CallOption) (*CloseTransactionResponse, error) {
	out := new(CloseTransactionResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.TransactionsService/CloseTransaction", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *transactionsServiceClient) Commit(ctx context.Context, in *CommitRequest, opts ...grpc.CallOption) (*CommitResponse, error) {
	out := new(CommitResponse)
	err := c.cc.Invoke(ctx, "/kvstore.v1.TransactionsService/Commit", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// TransactionsServiceServer is the server API for TransactionsService service.
// All implementations should embed UnimplementedTransactionsServiceServer
// for forward compatibility
type TransactionsServiceServer interface {
	NewTransaction(context.Context, *NewTransactionRequest) (*NewTransactionResponse, error)
	CloseTransaction(context.Context, *CloseTransactionRequest) (*CloseTransactionResponse, error)
	Commit(context.Context, *CommitRequest) (*CommitResponse, error)
}

// UnimplementedTransactionsServiceServer should be embedded to have forward compatible implementations.
type UnimplementedTransactionsServiceServer struct {
}

func (UnimplementedTransactionsServiceServer) NewTransaction(context.Context, *NewTransactionRequest) (*NewTransactionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method NewTransaction not implemented")
}
func (UnimplementedTransactionsServiceServer) CloseTransaction(context.Context, *CloseTransactionRequest) (*CloseTransactionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CloseTransaction not implemented")
}
func (UnimplementedTransactionsServiceServer) Commit(context.Context, *CommitRequest) (*CommitResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Commit not implemented")
}

// UnsafeTransactionsServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to TransactionsServiceServer will
// result in compilation errors.
type UnsafeTransactionsServiceServer interface {
	mustEmbedUnimplementedTransactionsServiceServer()
}

func RegisterTransactionsServiceServer(s grpc.ServiceRegistrar, srv TransactionsServiceServer) {
	s.RegisterService(&TransactionsService_ServiceDesc, srv)
}

func _TransactionsService_NewTransaction_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(NewTransactionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TransactionsServiceServer).NewTransaction(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.TransactionsService/NewTransaction",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TransactionsServiceServer).NewTransaction(ctx, req.(*NewTransactionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TransactionsService_CloseTransaction_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CloseTransactionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TransactionsServiceServer).CloseTransaction(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.TransactionsService/CloseTransaction",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TransactionsServiceServer).CloseTransaction(ctx, req.(*CloseTransactionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _TransactionsService_Commit_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CommitRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TransactionsServiceServer).Commit(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/kvstore.v1.TransactionsService/Commit",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TransactionsServiceServer).Commit(ctx, req.(*CommitRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// TransactionsService_ServiceDesc is the grpc.ServiceDesc for TransactionsService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var TransactionsService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "kvstore.v1.TransactionsService",
	HandlerType: (*TransactionsServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "NewTransaction",
			Handler:    _TransactionsService_NewTransaction_Handler,
		},
		{
			MethodName: "CloseTransaction",
			Handler:    _TransactionsService_CloseTransaction_Handler,
		},
		{
			MethodName: "Commit",
			Handler:    _TransactionsService_Commit_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "kvstore/v1/service.proto",
}
