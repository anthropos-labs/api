// @generated by protoc-gen-es v0.1.1 with parameter "target=js+dts"
// @generated from file kvstore/v1/transactions.proto (package kvstore.v1, syntax proto3)
/* eslint-disable */
/* @ts-nocheck */

import type {BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage} from "@bufbuild/protobuf";
import {Message, proto3} from "@bufbuild/protobuf";

/**
 * @generated from message kvstore.v1.CloseTransactionRequest
 */
export declare class CloseTransactionRequest extends Message<CloseTransactionRequest> {
  /**
   * @generated from field: kvstore.v1.Transaction transaction = 1;
   */
  transaction?: Transaction;

  /**
   * @generated from field: int64 timeout = 2;
   */
  timeout: bigint;

  constructor(data?: PartialMessage<CloseTransactionRequest>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "kvstore.v1.CloseTransactionRequest";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CloseTransactionRequest;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CloseTransactionRequest;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CloseTransactionRequest;

  static equals(a: CloseTransactionRequest | PlainMessage<CloseTransactionRequest> | undefined, b: CloseTransactionRequest | PlainMessage<CloseTransactionRequest> | undefined): boolean;
}

/**
 * @generated from message kvstore.v1.CloseTransactionResponse
 */
export declare class CloseTransactionResponse extends Message<CloseTransactionResponse> {
  /**
   * @generated from field: kvstore.v1.Transaction transaction = 1;
   */
  transaction?: Transaction;

  /**
   * @generated from field: int64 timeout = 2;
   */
  timeout: bigint;

  constructor(data?: PartialMessage<CloseTransactionResponse>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "kvstore.v1.CloseTransactionResponse";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CloseTransactionResponse;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CloseTransactionResponse;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CloseTransactionResponse;

  static equals(a: CloseTransactionResponse | PlainMessage<CloseTransactionResponse> | undefined, b: CloseTransactionResponse | PlainMessage<CloseTransactionResponse> | undefined): boolean;
}

/**
 * @generated from message kvstore.v1.CommitRequest
 */
export declare class CommitRequest extends Message<CommitRequest> {
  /**
   * @generated from field: kvstore.v1.Transaction transaction = 1;
   */
  transaction?: Transaction;

  constructor(data?: PartialMessage<CommitRequest>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "kvstore.v1.CommitRequest";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CommitRequest;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CommitRequest;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CommitRequest;

  static equals(a: CommitRequest | PlainMessage<CommitRequest> | undefined, b: CommitRequest | PlainMessage<CommitRequest> | undefined): boolean;
}

/**
 * @generated from message kvstore.v1.CommitResponse
 */
export declare class CommitResponse extends Message<CommitResponse> {
  /**
   * @generated from field: kvstore.v1.Transaction transaction = 1;
   */
  transaction?: Transaction;

  constructor(data?: PartialMessage<CommitResponse>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "kvstore.v1.CommitResponse";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CommitResponse;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CommitResponse;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CommitResponse;

  static equals(a: CommitResponse | PlainMessage<CommitResponse> | undefined, b: CommitResponse | PlainMessage<CommitResponse> | undefined): boolean;
}

/**
 * @generated from message kvstore.v1.Transaction
 */
export declare class Transaction extends Message<Transaction> {
  /**
   * @generated from field: uint64 shard_id = 1;
   */
  shardId: bigint;

  /**
   * @generated from field: uint64 client_id = 2;
   */
  clientId: bigint;

  /**
   * @generated from field: uint64 transaction_id = 3;
   */
  transactionId: bigint;

  /**
   * @generated from field: uint64 responded_to = 4;
   */
  respondedTo: bigint;

  constructor(data?: PartialMessage<Transaction>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "kvstore.v1.Transaction";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Transaction;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Transaction;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Transaction;

  static equals(a: Transaction | PlainMessage<Transaction> | undefined, b: Transaction | PlainMessage<Transaction> | undefined): boolean;
}

/**
 * @generated from message kvstore.v1.NewTransactionRequest
 */
export declare class NewTransactionRequest extends Message<NewTransactionRequest> {
  /**
   * @generated from field: uint64 shard_id = 1;
   */
  shardId: bigint;

  /**
   * @generated from field: uint64 client_id = 2;
   */
  clientId: bigint;

  constructor(data?: PartialMessage<NewTransactionRequest>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "kvstore.v1.NewTransactionRequest";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): NewTransactionRequest;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): NewTransactionRequest;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): NewTransactionRequest;

  static equals(a: NewTransactionRequest | PlainMessage<NewTransactionRequest> | undefined, b: NewTransactionRequest | PlainMessage<NewTransactionRequest> | undefined): boolean;
}

/**
 * @generated from message kvstore.v1.NewTransactionResponse
 */
export declare class NewTransactionResponse extends Message<NewTransactionResponse> {
  /**
   * @generated from field: kvstore.v1.Transaction transaction = 1;
   */
  transaction?: Transaction;

  constructor(data?: PartialMessage<NewTransactionResponse>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "kvstore.v1.NewTransactionResponse";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): NewTransactionResponse;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): NewTransactionResponse;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): NewTransactionResponse;

  static equals(a: NewTransactionResponse | PlainMessage<NewTransactionResponse> | undefined, b: NewTransactionResponse | PlainMessage<NewTransactionResponse> | undefined): boolean;
}

