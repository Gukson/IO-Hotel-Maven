package io.lab.hotel.Model;

import io.lab.hotel.Presenter.iReservationDao;
public class ReservationDao implements iReservationDao {

	/**
	 * 
	 * @param reservationID
	 */
	public boolean changeStatus(int reservationID) {
		return true;
	}

	/**
	 * 
	 * @param clientPESEL
	 * @param basicCost
	 * @param bookingDetails
	 * @param startDate
	 * @param endDate
	 */
	public boolean createReservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate) {
		return true;
	}

	/**
	 * 
	 * @param reservationID
	 */
	public boolean editReservation(int reservationID) {
		return true;
	}

	/**
	 * 
	 * @param reservationID
	 */
	public float generateBill(int reservationID) {
		return 0;
	}

	/**
	 * 
	 * @param reservationID
	 */
	public Reservation getReservationByID(int reservationID) {
		return null;
	}

}