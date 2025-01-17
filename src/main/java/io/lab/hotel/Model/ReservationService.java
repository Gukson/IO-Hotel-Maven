package io.lab.hotel.Model;

public class ReservationService {

    // Pobiera podstawowy koszt rezerwacji na podstawie jej ID
    public float generateBill(int reservationID) {
        // W przykładowej implementacji zwracamy stałe wartości dla uproszczenia
        if (reservationID == 1) {
            return 600.0f;
        } else if (reservationID == 2) {
            return 900.0f;
        } else {
            throw new IllegalArgumentException("Invalid reservation ID: " + reservationID);
        }
    }

}