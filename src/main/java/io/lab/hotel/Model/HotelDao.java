package io.lab.hotel.Model;

import io.lab.hotel.Presenter.iHotelDao;

import java.util.ArrayList;

public class HotelDao implements iHotelDao {

	public boolean editHotel(int hotelID) {
		return true;
	}

	public boolean fireWorker(String PESEL) {
		return true;
	}

	public ArrayList<Employee> getWorkersList(int hotelID) {
		return null;
	}

	public boolean hireWorker(String PESEL) {
		return true;
	}

	public boolean acceptHotel(int hotelID) {
		return true;
	}

	public boolean registerHotel(String name, String directorPESEL, String hotelConfiguration) {
		return true;
	}

}