package io.lab.hotel.Model;

public class Reservation {

	private String bookingDetails;
	private String status = "pending";
	private float basicCost;
	private float addedCost = 0;
	private int reservationID;
	private String clientPESEL = "";
	private String startDate;
	private String endDate;

	public String getBookingDetails() {
		return this.bookingDetails;
	}

	public boolean setBookingDetails(String bookingDetails) {
		this.bookingDetails = bookingDetails;
		return true;
	}

	public String getStatus() {
		return this.status;
	}


	public boolean setStatus(String status) {
		this.status = status;
		return true;
	}

	public float getBasicCost() {
		return this.basicCost;
	}


	public boolean setBasicCost(float basicCost) {
		this.basicCost = basicCost;
		return true;
	}

	public float getAddedCost() {
		return this.addedCost;
	}


	public boolean setAddedCost(float addedCost) {
		this.addedCost = addedCost;
		return true;
	}

	public int getReservationID() {
		return this.reservationID;
	}


	public boolean setReservationID(int reservationID) {
		this.reservationID = reservationID;
		return true;
	}

	public String getClientPESEL() {
		return this.clientPESEL;
	}


	public boolean setClientPESEL(String pesel) {
		if (pesel.length() != 11) {
			throw new IllegalArgumentException("Client PESEL length must be 11");
		}
		this.clientPESEL = pesel;
		return true;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public boolean setStartDate(String startDate) {
		this.startDate = startDate;
		return true;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public boolean setEndDate(String endDate) {
		this.endDate = endDate;
		return true;
	}


}