// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestService.proto

package net.devh.test.grpc.proto;

public final class TestServiceProto {
  private TestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SomeType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SomeType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021TestService.proto\032\033google/protobuf/emp" +
      "ty.proto\"\033\n\010SomeType\022\017\n\007version\030\001 \001(\t2\241\001" +
      "\n\013TestService\022-\n\006normal\022\026.google.protobu" +
      "f.Empty\032\t.SomeType\"\000\0224\n\runimplemented\022\026." +
      "google.protobuf.Empty\032\t.SomeType\"\000\022-\n\006se" +
      "cure\022\026.google.protobuf.Empty\032\t.SomeType\"" +
      "\000B.\n\030net.devh.test.grpc.protoB\020TestServi" +
      "ceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_SomeType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SomeType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SomeType_descriptor,
        new java.lang.String[] { "Version", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
