package io.lab.hotel.Model;

public interface iReservationDao {

	boolean changeStatus(int reservationID);

	boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate);

	boolean editReservation(int reservationID);

	float generateBill(int reservationID) throws Exception;

	Reservation getReservationByID(int reservationID);

}