package io.lab.hotel.Model;

public class Reservation {

	private String bookingDetails;
	private String status = "pending";
	private float basicCost;
	private float addedCost = 0;
	private int reservationID;
	private String clientPESEL;
	private String startDate;
	private String endDate;

	public String getBookingDetails() {
		return this.bookingDetails;
	}

	public boolean setBookingDetails(String bookingDetails) {
		return true;
	}

	public String getStatus() {
		return this.status;
	}


	public boolean setStatus(String status) {
		return true;
	}

	public float getBasicCost() {
		return this.basicCost;
	}


	public boolean setBasicCost(float basicCost) {
		return true;
	}

	public float getAddedCost() {
		return this.addedCost;
	}


	public boolean setAddedCost(float addedCost) {
		return true;
	}

	public int getReservationID() {
		return this.reservationID;
	}


	public boolean setReservationID(int reservationID) {
		return true;
	}

	public String getClientPESEL() {
		return this.clientPESEL;
	}


	public boolean setClientPESEL(int clientID) {
		return true;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public boolean setStartDate(String startDate) {
		return true;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public boolean setEndDate(String endDate) {
		return true;
	}

	public Reservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate) {
		throw new UnsupportedOperationException();
	}

}