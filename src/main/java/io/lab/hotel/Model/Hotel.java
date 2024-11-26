package io.lab.hotel.Model;

import java.util.ArrayList;

public class Hotel {

	private String name;
	private String directorPESEL;
	private ArrayList<Employee> employeesList;
	private String status = "pending";
	private String hotelConfiguration;

	public String getName() {
		return this.name;
	}

	public Hotel() {
		this.employeesList = new ArrayList<Employee>();
	}

	/**
	 * 
	 * @param name
	 */
	public boolean setName(String name) {
		return true;
	}

	public int getDirectorID() {
		// TODO - implement Hotel.getDirectorID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param directorID
	 */
	public boolean setDirectorID(int directorID) {
		return true;
	}

	public ArrayList<Employee> getEmployeesList() {
		return this.employeesList;
	}


	public String getStatus() {
		return this.status;
	}

	/**
	 * 
	 * @param status
	 */
	public boolean setStatus(String status) {
		return true;
	}

	public String getHotelConfiguration() {
		return this.hotelConfiguration;
	}

	/**
	 * 
	 * @param hotelConfiguration
	 */
	public boolean setHotelConfiguration(String hotelConfiguration) {
		return true;
	}

}