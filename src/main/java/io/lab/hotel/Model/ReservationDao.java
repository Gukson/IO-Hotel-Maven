package io.lab.hotel.Model;

import java.util.Objects;
import io.lab.hotel.Data.Data;

public class ReservationDao implements iReservationDao {

	private ReservationService reservationService;

	public ReservationDao(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	public ReservationDao() {}

	public boolean changeStatus(int reservationID) {
		Reservation reservation = getReservationByID(reservationID);

		if (Objects.equals(reservation.getStatus(), "pending")) {
			reservation.setStatus("checked");
		} else if (Objects.equals(reservation.getStatus(), "checked")) {
			reservation.setStatus("paid");
		}
        return true;
	}

	public boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate) {
		Data reservationData = new Data();
		Integer l = reservationData.getListLenght();

		Reservation reservation = new Reservation();
		reservation.setReservationID(l);
		reservation.setClientPESEL(clientPESEL);
		reservation.setBasicCost(basicCost);
		reservation.setBookingDetails(bookingDetails);
		reservation.setStartDate(startDate);
		reservation.setEndDate(endDate);

		reservationData.createReservation(reservation);
		return true;
	}

	public boolean editReservation(int reservationID) {
		return true;
	}

	public float generateBill(int reservationID) throws Exception {
		Reservation reservation = getReservationByID(reservationID);
		if (reservation == null) {
			throw new IllegalArgumentException("Reservation not found");

		}
		return reservation.getBasicCost() + reservation.getAddedCost();
	}

	public Reservation getReservationByID(int reservationID) {
		Data data = new Data();
        return data.getReservationByID(reservationID);
	}

}