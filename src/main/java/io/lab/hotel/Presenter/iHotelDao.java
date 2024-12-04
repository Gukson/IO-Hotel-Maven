package io.lab.hotel.Presenter;

import io.lab.hotel.Model.Employee;

import java.util.ArrayList;

public interface iHotelDao {

	boolean acceptHotel(int hotelID);

	boolean editHotel(int hotelID);

	boolean fireWorker(String PESEL);

	ArrayList<Employee> getWorkersList(int hotelID);

	boolean hireWorker(String PESEL);

	boolean registerHotel(String name, String directorPESEL, String hotelConfiguration);

}