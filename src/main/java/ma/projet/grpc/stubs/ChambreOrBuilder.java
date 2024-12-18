// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.projet.grpc.stubs;

public interface ChambreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Chambre)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID de la chambre
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Type de chambre (Standard, Deluxe, etc.)
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Type de chambre (Standard, Deluxe, etc.)
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Prix de la chambre
   * </pre>
   *
   * <code>float prix = 3;</code>
   * @return The prix.
   */
  float getPrix();

  /**
   * <pre>
   * Disponibilité de la chambre
   * </pre>
   *
   * <code>bool disponible = 4;</code>
   * @return The disponible.
   */
  boolean getDisponible();
}
