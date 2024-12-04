package io.lab.hotel.Presenter;
import io.lab.hotel.Model.Employee;
import io.lab.hotel.iFasada;

import java.util.ArrayList;

public class Fasada implements iFasada {

	/**
	 * 
	 * @param hotelID
	 */
	public boolean acceptHotel(int hotelID) {
		return true;
	}

	/**
	 * 
	 * @param reservationID
	 * @param status
	 */
	public boolean changeStatus(int reservationID, String status) {
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
	 * @param hotelID
	 */
	public boolean deleteHotel(int hotelID) {
		return true;
	}

	/**
	 * 
	 * @param hotelID
	 */
	public boolean editHotel(int hotelID) {
		return true;
	}

	/**
	 * 
	 * @param PESEL
	 */
	public boolean fireEmployee(String PESEL) {
		return true;
	}

	/**
	 * 
	 * @param reservationID
	 */
	public float getBill(float reservationID) {
		// TODO - implement Fasada.getBill
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param hotelID
	 */
	public ArrayList<Employee> getEmployeesList(int hotelID) {
		// TODO - implement Fasada.getEmployeesList
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationID
	 */
	public String getReservationDetails(int reservationID) {
		// TODO - implement Fasada.getReservationDetails
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param PESEL
	 * @param email
	 */
	public boolean hireEmployee(String name, String surname, String PESEL, String email) {
		return true;
	}

	/**
	 * 
	 * @param email
	 * @param password
	 */
	public boolean login(String email, String password) {
		return true;
	}

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param PESEL
	 * @param email
	 * @param phoneNumber
	 */
	public boolean register(String name, String surname, String PESEL, String email, String phoneNumber) {
		return true;
	}

	/**
	 * 
	 * @param name
	 * @param directorPESEL
	 * @param hotelConfiguration
	 */
	public boolean registerHotel(String name, String directorPESEL, String hotelConfiguration) {
		return true;
	}

	/**
	 * 
	 * @param PESEL
	 */
	public User getUser(String PESEL) {
		// TODO - implement Fasada.getUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationID
	 */
	public String getStatus(int reservationID) {
		// TODO - implement Fasada.getStatus
		throw new UnsupportedOperationException();
	}

}