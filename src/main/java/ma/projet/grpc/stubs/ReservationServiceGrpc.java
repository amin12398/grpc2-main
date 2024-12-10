package ma.projet.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service gRPC pour gérer les réservations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationsRequest,
      ma.projet.grpc.stubs.GetReservationsResponse> getGetReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservations",
      requestType = ma.projet.grpc.stubs.GetReservationsRequest.class,
      responseType = ma.projet.grpc.stubs.GetReservationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationsRequest,
      ma.projet.grpc.stubs.GetReservationsResponse> getGetReservationsMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationsRequest, ma.projet.grpc.stubs.GetReservationsResponse> getGetReservationsMethod;
    if ((getGetReservationsMethod = ReservationServiceGrpc.getGetReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationsMethod = ReservationServiceGrpc.getGetReservationsMethod) == null) {
          ReservationServiceGrpc.getGetReservationsMethod = getGetReservationsMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetReservationsRequest, ma.projet.grpc.stubs.GetReservationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetReservationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetReservationsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservations"))
                  .build();
          }
        }
     }
     return getGetReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationRequest,
      ma.projet.grpc.stubs.GetReservationResponse> getGetReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservation",
      requestType = ma.projet.grpc.stubs.GetReservationRequest.class,
      responseType = ma.projet.grpc.stubs.GetReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationRequest,
      ma.projet.grpc.stubs.GetReservationResponse> getGetReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationRequest, ma.projet.grpc.stubs.GetReservationResponse> getGetReservationMethod;
    if ((getGetReservationMethod = ReservationServiceGrpc.getGetReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationMethod = ReservationServiceGrpc.getGetReservationMethod) == null) {
          ReservationServiceGrpc.getGetReservationMethod = getGetReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetReservationRequest, ma.projet.grpc.stubs.GetReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservation"))
                  .build();
          }
        }
     }
     return getGetReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.CreateReservationRequest,
      ma.projet.grpc.stubs.CreateReservationResponse> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = ma.projet.grpc.stubs.CreateReservationRequest.class,
      responseType = ma.projet.grpc.stubs.CreateReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.CreateReservationRequest,
      ma.projet.grpc.stubs.CreateReservationResponse> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.CreateReservationRequest, ma.projet.grpc.stubs.CreateReservationResponse> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.CreateReservationRequest, ma.projet.grpc.stubs.CreateReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.CreateReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationRequest,
      com.google.protobuf.Empty> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = ma.projet.grpc.stubs.GetReservationRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationRequest,
      com.google.protobuf.Empty> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<ma.projet.grpc.stubs.GetReservationRequest, com.google.protobuf.Empty> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<ma.projet.grpc.stubs.GetReservationRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.projet.grpc.stubs.GetReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Obtenir toutes les réservations
     * </pre>
     */
    public void getReservations(ma.projet.grpc.stubs.GetReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetReservationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Obtenir une réservation par ID
     * </pre>
     */
    public void getReservation(ma.projet.grpc.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public void createReservation(ma.projet.grpc.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.CreateReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public void deleteReservation(ma.projet.grpc.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.GetReservationsRequest,
                ma.projet.grpc.stubs.GetReservationsResponse>(
                  this, METHODID_GET_RESERVATIONS)))
          .addMethod(
            getGetReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.GetReservationRequest,
                ma.projet.grpc.stubs.GetReservationResponse>(
                  this, METHODID_GET_RESERVATION)))
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.CreateReservationRequest,
                ma.projet.grpc.stubs.CreateReservationResponse>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.projet.grpc.stubs.GetReservationRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_RESERVATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtenir toutes les réservations
     * </pre>
     */
    public void getReservations(ma.projet.grpc.stubs.GetReservationsRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetReservationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Obtenir une réservation par ID
     * </pre>
     */
    public void getReservation(ma.projet.grpc.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public void createReservation(ma.projet.grpc.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.CreateReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public void deleteReservation(ma.projet.grpc.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtenir toutes les réservations
     * </pre>
     */
    public ma.projet.grpc.stubs.GetReservationsResponse getReservations(ma.projet.grpc.stubs.GetReservationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Obtenir une réservation par ID
     * </pre>
     */
    public ma.projet.grpc.stubs.GetReservationResponse getReservation(ma.projet.grpc.stubs.GetReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public ma.projet.grpc.stubs.CreateReservationResponse createReservation(ma.projet.grpc.stubs.CreateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public com.google.protobuf.Empty deleteReservation(ma.projet.grpc.stubs.GetReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service gRPC pour gérer les réservations
   * </pre>
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Obtenir toutes les réservations
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetReservationsResponse> getReservations(
        ma.projet.grpc.stubs.GetReservationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Obtenir une réservation par ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.GetReservationResponse> getReservation(
        ma.projet.grpc.stubs.GetReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Créer une réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.projet.grpc.stubs.CreateReservationResponse> createReservation(
        ma.projet.grpc.stubs.CreateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Supprimer une réservation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteReservation(
        ma.projet.grpc.stubs.GetReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RESERVATIONS = 0;
  private static final int METHODID_GET_RESERVATION = 1;
  private static final int METHODID_CREATE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RESERVATIONS:
          serviceImpl.getReservations((ma.projet.grpc.stubs.GetReservationsRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetReservationsResponse>) responseObserver);
          break;
        case METHODID_GET_RESERVATION:
          serviceImpl.getReservation((ma.projet.grpc.stubs.GetReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.GetReservationResponse>) responseObserver);
          break;
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((ma.projet.grpc.stubs.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<ma.projet.grpc.stubs.CreateReservationResponse>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((ma.projet.grpc.stubs.GetReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.projet.grpc.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getGetReservationsMethod())
              .addMethod(getGetReservationMethod())
              .addMethod(getCreateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
