package io.lab.hotel.Presenter;

import io.lab.hotel.Model.Employee;

import java.util.ArrayList;

public interface iHotelDao {

	/**
	 * 
	 * @param hotelID
	 */
	boolean acceptHotel(int hotelID);

	/**
	 * 
	 * @param hotelID
	 */
	boolean editHotel(int hotelID);

	/**
	 * 
	 * @param PESEL
	 */
	boolean fireWorker(String PESEL);

	/**
	 * @param hotelID
	 */
	ArrayList<Employee> getWorkersList(int hotelID);

	/**
	 * 
	 * @param PESEL
	 */
	boolean hireWorker(String PESEL);

	/**
	 * 
	 * @param name
	 * @param directorPESEL
	 * @param hotelConfiguration
	 */
	boolean registerHotel(String name, String directorPESEL, String hotelConfiguration);

}