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

	public boolean createReservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate) {
		return true;
	}

	public boolean editReservation(int reservationID) {
		return true;
	}

	public float generateBill(int reservationID) {
		return 0;
	}

	public Reservation getReservationByID(int reservationID) {
		return null;
	}

}