package io.lab.hotel.Presenter;

import io.lab.hotel.Model.Reservation;
public interface iReservationDao {

	/**
	 * 
	 * @param reservationID
	 */
	boolean changeStatus(int reservationID);

	/**
	 * 
	 * @param clientPESEL
	 * @param basicCost
	 * @param bookingDetails
	 * @param startDate
	 * @param endDate
	 */
	boolean createReservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate);

	/**
	 * 
	 * @param reservationID
	 */
	boolean editReservation(int reservationID);

	/**
	 * 
	 * @param reservationID
	 */
	float generateBill(int reservationID);

	/**
	 * 
	 * @param reservationID
	 */
	Reservation getReservationByID(int reservationID);

}