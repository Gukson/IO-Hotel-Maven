package io.lab.hotel.Presenter;
import io.lab.hotel.Model.Employee;
import io.lab.hotel.Model.User;
import io.lab.hotel.iFasada;

import java.util.ArrayList;

public class Fasada implements iFasada {

	public boolean acceptHotel(int hotelID) {
		return true;
	}

	public boolean changeStatus(int reservationID, String status) {
		return true;
	}


	public boolean createReservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate) {
		return true;
	}

	public boolean deleteHotel(int hotelID) {
		return true;
	}

	public boolean editHotel(int hotelID) {
		return true;
	}

	public boolean fireEmployee(String PESEL) {
		return true;
	}


	public float getBill(float reservationID) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Employee> getEmployeesList(int hotelID) {
		throw new UnsupportedOperationException();
	}

	public String getReservationDetails(int reservationID) {
		throw new UnsupportedOperationException();
	}

	public boolean hireEmployee(String name, String surname, String PESEL, String email) {
		return true;
	}

	public boolean login(String email, String password) {
		return true;
	}

	public boolean register(String name, String surname, String PESEL, String email, String phoneNumber) {
		return true;
	}

	public boolean registerHotel(String name, String directorPESEL, String hotelConfiguration) {
		return true;
	}

	public User getUser(String PESEL) {
		throw new UnsupportedOperationException();
	}

	public String getStatus(int reservationID) {
		throw new UnsupportedOperationException();
	}

}