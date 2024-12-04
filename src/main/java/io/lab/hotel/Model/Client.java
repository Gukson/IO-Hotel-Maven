package io.lab.hotel.Model;

import java.util.ArrayList;

public class Client extends User {

	private String name;
	private String surname;
	private String PESEL;
	private ArrayList<Reservation> reservationList;
	private String email;
	private String phoneNumber;
	private String role = "client";

	public ArrayList<Reservation> getReservationList() {
		throw new UnsupportedOperationException();
	}

	public boolean setReservationList(int reservationList) {
		return true;
	}

	public String getName() {
		return this.name;
	}

	public boolean setName(String Name) {
		return true;
	}

	public String getSurname() {
		return this.surname;
	}

	public boolean setSurname(String Surname) {
		return true;
	}

	public String getEmail() {
		return this.email;
	}

	public boolean setEmail(String email) {
		return true;
	}

	public String getPESEL() {
		throw new UnsupportedOperationException();
	}

	public boolean setPESEL(String PESEL) {
		return true;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public boolean setPhoneNumber(String phoneNumber) {
		return true;
	}

	public String getRole() {
		return this.role;
	}

	public Client(String name, String surname, String PESEL, String email, String phoneNumber) {
		throw new UnsupportedOperationException();
	}

}