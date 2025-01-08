package io.lab.hotel.Model;

import java.util.Objects;

public class ReservationDao implements iReservationDao {

	public boolean changeStatus(int reservationID) {
		Reservation reservation = getReservationByID(reservationID);

		if (Objects.equals(reservation.getStatus(), "pending")) {
			reservation.setStatus("checked");
		} else if (Objects.equals(reservation.getStatus(), "checked")) {
			reservation.setStatus("paid");
		}
		boolean statusChanged = true;
		return statusChanged;
	}

	public boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate) {
		Reservation reservation = new Reservation();
		reservation.setClientPESEL(clientPESEL);
		reservation.setBasicCost(basicCost);
		reservation.setBookingDetails(bookingDetails);
		reservation.setStartDate(startDate);
		reservation.setEndDate(endDate);
		return true;
	}

	public boolean editReservation(int reservationID) {
		return true;
	}

	public float generateBill(int reservationID) {
		return 0;
	}

	public Reservation getReservationByID(int reservationID) {
		Reservation res = new Reservation();
		res.setReservationID(reservationID);
		return res;
	}

}