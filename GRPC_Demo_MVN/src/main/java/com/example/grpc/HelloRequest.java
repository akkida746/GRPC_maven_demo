// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package com.example.grpc;

/**
 * <pre>
 * Request payload
 * </pre>
 *
 * Protobuf type {@code com.example.grpc.HelloRequest}
 */
public  final class HelloRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.example.grpc.HelloRequest)
    HelloRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloRequest.newBuilder() to construct.
  private HelloRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloRequest() {
    name_ = "";
    hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HelloRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              hobbies_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            hobbies_.add(s);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        hobbies_ = hobbies_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.grpc.Hello.internal_static_com_example_grpc_HelloRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.grpc.Hello.internal_static_com_example_grpc_HelloRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.grpc.HelloRequest.class, com.example.grpc.HelloRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Each message attribute is strongly typed.
   * You also must assign a "tag" number.
   * Each tag number is unique within the message.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Each message attribute is strongly typed.
   * You also must assign a "tag" number.
   * Each tag number is unique within the message.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOBBIES_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList hobbies_;
  /**
   * <pre>
   * This defines a strongly typed list of String
   * </pre>
   *
   * <code>repeated string hobbies = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getHobbiesList() {
    return hobbies_;
  }
  /**
   * <pre>
   * This defines a strongly typed list of String
   * </pre>
   *
   * <code>repeated string hobbies = 2;</code>
   */
  public int getHobbiesCount() {
    return hobbies_.size();
  }
  /**
   * <pre>
   * This defines a strongly typed list of String
   * </pre>
   *
   * <code>repeated string hobbies = 2;</code>
   */
  public java.lang.String getHobbies(int index) {
    return hobbies_.get(index);
  }
  /**
   * <pre>
   * This defines a strongly typed list of String
   * </pre>
   *
   * <code>repeated string hobbies = 2;</code>
   */
  public com.google.protobuf.ByteString
      getHobbiesBytes(int index) {
    return hobbies_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < hobbies_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, hobbies_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < hobbies_.size(); i++) {
        dataSize += computeStringSizeNoTag(hobbies_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getHobbiesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.grpc.HelloRequest)) {
      return super.equals(obj);
    }
    com.example.grpc.HelloRequest other = (com.example.grpc.HelloRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getHobbiesList()
        .equals(other.getHobbiesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getHobbiesCount() > 0) {
      hash = (37 * hash) + HOBBIES_FIELD_NUMBER;
      hash = (53 * hash) + getHobbiesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.grpc.HelloRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.HelloRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.HelloRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.HelloRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.HelloRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.grpc.HelloRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.grpc.HelloRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.HelloRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.HelloRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.grpc.HelloRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.grpc.HelloRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.grpc.HelloRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.grpc.HelloRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Request payload
   * </pre>
   *
   * Protobuf type {@code com.example.grpc.HelloRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.example.grpc.HelloRequest)
      com.example.grpc.HelloRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.grpc.Hello.internal_static_com_example_grpc_HelloRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.grpc.Hello.internal_static_com_example_grpc_HelloRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.grpc.HelloRequest.class, com.example.grpc.HelloRequest.Builder.class);
    }

    // Construct using com.example.grpc.HelloRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.grpc.Hello.internal_static_com_example_grpc_HelloRequest_descriptor;
    }

    public com.example.grpc.HelloRequest getDefaultInstanceForType() {
      return com.example.grpc.HelloRequest.getDefaultInstance();
    }

    public com.example.grpc.HelloRequest build() {
      com.example.grpc.HelloRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.grpc.HelloRequest buildPartial() {
      com.example.grpc.HelloRequest result = new com.example.grpc.HelloRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        hobbies_ = hobbies_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.hobbies_ = hobbies_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.grpc.HelloRequest) {
        return mergeFrom((com.example.grpc.HelloRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.grpc.HelloRequest other) {
      if (other == com.example.grpc.HelloRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.hobbies_.isEmpty()) {
        if (hobbies_.isEmpty()) {
          hobbies_ = other.hobbies_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureHobbiesIsMutable();
          hobbies_.addAll(other.hobbies_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.grpc.HelloRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.grpc.HelloRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Each message attribute is strongly typed.
     * You also must assign a "tag" number.
     * Each tag number is unique within the message.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Each message attribute is strongly typed.
     * You also must assign a "tag" number.
     * Each tag number is unique within the message.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Each message attribute is strongly typed.
     * You also must assign a "tag" number.
     * Each tag number is unique within the message.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each message attribute is strongly typed.
     * You also must assign a "tag" number.
     * Each tag number is unique within the message.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each message attribute is strongly typed.
     * You also must assign a "tag" number.
     * Each tag number is unique within the message.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureHobbiesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        hobbies_ = new com.google.protobuf.LazyStringArrayList(hobbies_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getHobbiesList() {
      return hobbies_.getUnmodifiableView();
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public int getHobbiesCount() {
      return hobbies_.size();
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public java.lang.String getHobbies(int index) {
      return hobbies_.get(index);
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHobbiesBytes(int index) {
      return hobbies_.getByteString(index);
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public Builder setHobbies(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHobbiesIsMutable();
      hobbies_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public Builder addHobbies(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureHobbiesIsMutable();
      hobbies_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public Builder addAllHobbies(
        java.lang.Iterable<java.lang.String> values) {
      ensureHobbiesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, hobbies_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public Builder clearHobbies() {
      hobbies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This defines a strongly typed list of String
     * </pre>
     *
     * <code>repeated string hobbies = 2;</code>
     */
    public Builder addHobbiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureHobbiesIsMutable();
      hobbies_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.example.grpc.HelloRequest)
  }

  // @@protoc_insertion_point(class_scope:com.example.grpc.HelloRequest)
  private static final com.example.grpc.HelloRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.grpc.HelloRequest();
  }

  public static com.example.grpc.HelloRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloRequest>
      PARSER = new com.google.protobuf.AbstractParser<HelloRequest>() {
    public HelloRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HelloRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloRequest> getParserForType() {
    return PARSER;
  }

  public com.example.grpc.HelloRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

