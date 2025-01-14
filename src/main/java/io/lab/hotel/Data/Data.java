package io.lab.hotel.Data;
import io.lab.hotel.Model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<Reservation> reservations;

    public Data() {
        this.reservations = new ArrayList<>();

        // Przykładowe dane rezerwacji
        Reservation res1 = new Reservation();
        res1.setReservationID(1);
        res1.setClientPESEL("12345678901");
        res1.setStartDate("2025-01-14");
        res1.setEndDate("2025-01-18");
        res1.setBasicCost(500);
        res1.setAddedCost(100);
        res1.setStatus("confirmed");
        res1.setBookingDetails("Room 101, 2 Guests");

        Reservation res2 = new Reservation();
        res2.setReservationID(2);
        res2.setClientPESEL("98765432109");
        res2.setStartDate("2025-02-01");
        res2.setEndDate("2025-02-05");
        res2.setBasicCost(800);
        res2.setAddedCost(150);
        res2.setStatus("pending");
        res2.setBookingDetails("Room 202, 1 Guest");

        Reservation res3 = new Reservation();
        res3.setReservationID(3);
        res3.setClientPESEL("11223344556");
        res3.setStartDate("2025-03-10");
        res3.setEndDate("2025-03-15");
        res3.setBasicCost(1200);
        res3.setAddedCost(200);
        res3.setStatus("cancelled");
        res3.setBookingDetails("Room 303, 3 Guests");

        // Dodanie rezerwacji do listy
        this.reservations.add(res1);
        this.reservations.add(res2);
        this.reservations.add(res3);
    }

    // Metoda do pobierania rezerwacji na podstawie ID
    public Reservation getReservationByID(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationID() == id) {
                return reservation;
            }
        }
        return null; // Zwraca null, jeśli nie znaleziono rezerwacji o podanym ID
    }

    // Metoda pomocnicza do wyświetlania wszystkich rezerwacji (opcjonalna)
    public List<Reservation> getAllReservations() {
        return this.reservations;
    }
}