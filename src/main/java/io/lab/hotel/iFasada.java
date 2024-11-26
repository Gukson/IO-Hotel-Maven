package io.lab.hotel;

import io.lab.hotel.Model.Employee;

import java.util.ArrayList;

public interface iFasada {

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
	 * @param hotelID
	 */
	boolean editHotel(int hotelID);

	/**
	 * 
	 * @param PESEL
	 */
	boolean fireEmployee(String PESEL);

	/**
	 * 
	 * @param reservationID
	 */
	float getBill(float reservationID);

	/**
	 * @param hotelID
	 */
	ArrayList<Employee> getEmployeesList(int hotelID);

	/**
	 * 
	 * @param reservationID
	 */
	String getReservationDetails(int reservationID);

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param PESEL
	 * @param email
	 */
	boolean hireEmployee(String name, String surname, String PESEL, String email);

	/**
	 * 
	 * @param email
	 * @param password
	 */
	boolean login(String email, String password);

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param PESEL
	 * @param email
	 * @param phoneNumber
	 */
	boolean register(String name, String surname, String PESEL, String email, String phoneNumber);

	/**
	 * 
	 * @param name
	 * @param directorPESEL
	 * @param hotelConfiguration
	 */
	boolean registerHotel(String name, String directorPESEL, String hotelConfiguration);

}