// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package ma.projet.grpc.stubs;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID de la réservation
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Le client qui effectue la réservation
   * </pre>
   *
   * <code>.Client client = 2;</code>
   * @return Whether the client field is set.
   */
  boolean hasClient();
  /**
   * <pre>
   * Le client qui effectue la réservation
   * </pre>
   *
   * <code>.Client client = 2;</code>
   * @return The client.
   */
  ma.projet.grpc.stubs.Client getClient();
  /**
   * <pre>
   * Le client qui effectue la réservation
   * </pre>
   *
   * <code>.Client client = 2;</code>
   */
  ma.projet.grpc.stubs.ClientOrBuilder getClientOrBuilder();

  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.Chambre chambre = 3;</code>
   * @return Whether the chambre field is set.
   */
  boolean hasChambre();
  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.Chambre chambre = 3;</code>
   * @return The chambre.
   */
  ma.projet.grpc.stubs.Chambre getChambre();
  /**
   * <pre>
   * La chambre réservée
   * </pre>
   *
   * <code>.Chambre chambre = 3;</code>
   */
  ma.projet.grpc.stubs.ChambreOrBuilder getChambreOrBuilder();

  /**
   * <pre>
   * Date de début de la réservation
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dateDebut = 4;</code>
   * @return Whether the dateDebut field is set.
   */
  boolean hasDateDebut();
  /**
   * <pre>
   * Date de début de la réservation
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dateDebut = 4;</code>
   * @return The dateDebut.
   */
  com.google.protobuf.Timestamp getDateDebut();
  /**
   * <pre>
   * Date de début de la réservation
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dateDebut = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateDebutOrBuilder();

  /**
   * <pre>
   * Date de fin de la réservation
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dateFin = 5;</code>
   * @return Whether the dateFin field is set.
   */
  boolean hasDateFin();
  /**
   * <pre>
   * Date de fin de la réservation
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dateFin = 5;</code>
   * @return The dateFin.
   */
  com.google.protobuf.Timestamp getDateFin();
  /**
   * <pre>
   * Date de fin de la réservation
   * </pre>
   *
   * <code>.google.protobuf.Timestamp dateFin = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getDateFinOrBuilder();

  /**
   * <pre>
   * Préférences du client
   * </pre>
   *
   * <code>string preferences = 6;</code>
   * @return The preferences.
   */
  java.lang.String getPreferences();
  /**
   * <pre>
   * Préférences du client
   * </pre>
   *
   * <code>string preferences = 6;</code>
   * @return The bytes for preferences.
   */
  com.google.protobuf.ByteString
      getPreferencesBytes();
}
