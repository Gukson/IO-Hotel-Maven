package io.lab.hotel.Presenter;

import io.lab.hotel.Model.Reservation;
public interface iReservationDao {

	boolean changeStatus(int reservationID);

	boolean createReservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate);

	boolean editReservation(int reservationID);

	float generateBill(int reservationID);

	Reservation getReservationByID(int reservationID);

}