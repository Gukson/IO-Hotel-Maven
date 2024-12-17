package io.lab.hotel.Model;

import java.util.ArrayList;

public class Client extends User {

	private String name;
	private String surname;
	private String PESEL;
	private ArrayList<Integer> reservationList;
	private String email;
	private String phoneNumber;
	private String role = "client";

	public ArrayList<Integer> getReservationList() {
		return reservationList;
	}

	public boolean addReservation(int reservationID) {
		reservationList.add(reservationID);
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
		return this.PESEL;
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
		this.name = name;
		this.surname = surname;
		this.PESEL = PESEL;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.reservationList = new ArrayList<Integer>();
	}

}