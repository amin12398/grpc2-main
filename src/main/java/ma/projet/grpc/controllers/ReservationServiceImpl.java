package ma.projet.grpc.controllers;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import ma.projet.grpc.stubs.*;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@GrpcService
public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase {

    // Simuler les bases de données en mémoire
    private final Map<Long, Reservation> reservationDB = new ConcurrentHashMap<>();
    private final Map<Long, Client> clientDB = new ConcurrentHashMap<>();
    private final Map<Long, Chambre> chambreDB = new ConcurrentHashMap<>();

    @Override
    public void getReservations(GetReservationsRequest request, StreamObserver<GetReservationsResponse> responseObserver) {
        GetReservationsResponse.Builder responseBuilder = GetReservationsResponse.newBuilder();
        responseBuilder.addAllReservations(reservationDB.values());
        responseObserver.onNext(responseBuilder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getReservation(GetReservationRequest request, StreamObserver<GetReservationResponse> responseObserver) {
        Reservation reservation = reservationDB.get(request.getId());
        if (reservation != null) {
            responseObserver.onNext(GetReservationResponse.newBuilder().setReservation(reservation).build());
        } else {
            responseObserver.onError(new Throwable("Reservation not found"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void createReservation(CreateReservationRequest request, StreamObserver<CreateReservationResponse> responseObserver) {
        Client client = clientDB.get(request.getClientId());
        Chambre chambre = chambreDB.get(request.getChambreId());

        if (client == null || chambre == null) {
            responseObserver.onError(new Throwable("Client or Chambre not found"));
            return;
        }

        // Générer un ID unique pour la réservation
        long reservationId = UUID.randomUUID().getLeastSignificantBits();
        Reservation reservation = Reservation.newBuilder()
                .setId(reservationId)
                .setClient(client)
                .setChambre(chambre)
                .setDateDebut(parseDate(request.getDateDebut()))
                .setDateFin(parseDate(request.getDateFin()))
                .setPreferences(request.getPreferences())
                .build();

        // Ajouter la réservation à la "base de données"
        reservationDB.put(reservationId, reservation);

        responseObserver.onNext(CreateReservationResponse.newBuilder().setReservation(reservation).build());
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReservation(GetReservationRequest request, StreamObserver<Empty> responseObserver) {
        Reservation reservation = reservationDB.remove(request.getId());
        if (reservation != null) {
            responseObserver.onNext(Empty.newBuilder().build());
        } else {
            responseObserver.onError(new Throwable("Reservation not found"));
        }
        responseObserver.onCompleted();
    }

    private static com.google.protobuf.Timestamp parseDate(String dateStr) {
        LocalDate localDate = LocalDate.parse(dateStr);
        return com.google.protobuf.Timestamp.newBuilder()
                .setSeconds(localDate.atStartOfDay(ZoneId.systemDefault()).toEpochSecond())
                .build();
    }

    // Simuler des données de clients et de chambres
    public ReservationServiceImpl() {
        // Ajouter quelques données de test pour les clients et chambres
        clientDB.put(1L, Client.newBuilder().setId(1).setNom("John").setPrenom("Doe").setEmail("john.doe@example.com").setTelephone("123456789").build());
        chambreDB.put(1L, Chambre.newBuilder().setId(1).setType("Deluxe").setPrix(150.0f).setDisponible(true).build());
        chambreDB.put(2L, Chambre.newBuilder().setId(2).setType("Standard").setPrix(100.0f).setDisponible(true).build());
    }
}
