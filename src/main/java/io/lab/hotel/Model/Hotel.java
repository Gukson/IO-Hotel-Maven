package io.lab.hotel.Model;

import io.lab.hotel.Model.Employee;
import io.lab.hotel.Model.HotelConfigurationStrategy;

import java.util.ArrayList;

public class Hotel {

	private String name;
	private String directorPESEL;
	private ArrayList<Employee> employeesList;
	private String status = "pending";
	private String hotelConfiguration;
	private HotelConfigurationStrategy configurationStrategy;

	public String getName() {
		return this.name;
	}

	public Hotel() {
		this.employeesList = new ArrayList<Employee>();
	}

	public boolean setName(String name) {
		return true;
	}

	public int getDirectorID() {
		throw new UnsupportedOperationException();
	}

	public boolean setDirectorID(int directorID) {
		return true;
	}

	public ArrayList<Employee> getEmployeesList() {
		return this.employeesList;
	}

	public String getStatus() {
		return this.status;
	}

	public boolean setStatus(String status) {
		return true;
	}

	public String getHotelConfiguration() {
		return this.hotelConfiguration;
	}

	public boolean setHotelConfiguration(String hotelConfiguration) {
		return true;
	}

	public void setConfigurationStrategy(HotelConfigurationStrategy configurationStrategy) {
		this.configurationStrategy = configurationStrategy;
	}

}