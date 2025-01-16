package io.lab.hotel;

import io.lab.hotel.Model.Employee;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.User;

import java.util.ArrayList;

public interface iFasada {

	/**
	 * 
	 * @param reservationID

	 */
	boolean changeStatus(int reservationID);

	boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate);


	boolean editHotel(int hotelID);

	boolean fireEmployee(String PESEL);

	float getBill(int reservationID) throws Exception;


	ArrayList<Employee> getEmployeesList(int hotelID);


	Reservation getReservationDetails(int reservationID);


	boolean hireEmployee(String name, String surname, String PESEL, String email);


	User login(String email, String password);


	boolean register(String name, String surname, String PESEL, String email, String phoneNumber);


	boolean registerHotel(String name, String directorPESEL, String hotelConfiguration);


	User getUser(String PESEL);


	String getStatus(int reservationID);

}