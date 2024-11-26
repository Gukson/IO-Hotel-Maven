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
		// TODO - implement Client.getReservationList
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationList
	 */
	public boolean setReservationList(int reservationList) {
		return true;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param Name
	 */
	public boolean setName(String Name) {
		return true;
	}

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param Surname
	 */
	public boolean setSurname(String Surname) {
		return true;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public boolean setEmail(String email) {
		return true;
	}

	public String getPESEL() {
		// TODO - implement Client.getPESEL
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PESEL
	 */
	public boolean setPESEL(String PESEL) {
		return true;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	/**
	 * 
	 * @param phoneNumber
	 */
	public boolean setPhoneNumber(String phoneNumber) {
		return true;
	}

	public String getRole() {
		return this.role;
	}

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param PESEL
	 * @param email
	 * @param phoneNumber
	 */
	public Client(String name, String surname, String PESEL, String email, String phoneNumber) {
		// TODO - implement Client.Client
		throw new UnsupportedOperationException();
	}

}