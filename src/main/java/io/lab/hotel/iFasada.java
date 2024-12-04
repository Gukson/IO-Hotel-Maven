package io.lab.hotel;

import io.lab.hotel.Model.Employee;
import io.lab.hotel.Model.User;

import java.util.ArrayList;

public interface iFasada {

	/**
	 * 
	 * @param reservationID
	 * @param status
	 */
	boolean changeStatus(int reservationID, String status);

	boolean createReservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate);


	boolean editHotel(int hotelID);

	boolean fireEmployee(String PESEL);

	float getBill(float reservationID);


	ArrayList<Employee> getEmployeesList(int hotelID);


	String getReservationDetails(int reservationID);


	boolean hireEmployee(String name, String surname, String PESEL, String email);


	boolean login(String email, String password);


	boolean register(String name, String surname, String PESEL, String email, String phoneNumber);


	boolean registerHotel(String name, String directorPESEL, String hotelConfiguration);


	User getUser(String PESEL);


	String getStatus(int reservationID);

}