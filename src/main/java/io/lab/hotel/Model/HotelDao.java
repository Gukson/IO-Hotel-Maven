package io.lab.hotel.Model;

import io.lab.hotel.Presenter.iHotelDao;

import java.util.ArrayList;

public class HotelDao implements iHotelDao {

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
	public boolean fireWorker(String PESEL) {
		return true;
	}

	/**
	 * @param hotelID
	 */
	public ArrayList<Employee> getWorkersList(int hotelID) {
		// TODO - implement HotelDao.getWorkersList
		return null;
	}

	/**
	 * 
	 * @param PESEL
	 */
	public boolean hireWorker(String PESEL) {
		return true;
	}

	/**
	 * 
	 * @param hotelID
	 */
	public boolean acceptHotel(int hotelID) {
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

}