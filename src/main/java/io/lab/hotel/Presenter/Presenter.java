package io.lab.hotel.Presenter;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.User;
import io.lab.hotel.Model.Fasada;
import io.lab.hotel.iPresenter;
import io.lab.hotel.iFasada;
import io.lab.hotel.Model.Hotel;

import java.util.ArrayList;

public class Presenter implements iPresenter {

	public void Show() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean acceptHotel(int hotelID) {
		return false;
	}

	@Override
	public boolean changeStatus(int reservationID) {
		iFasada fasada = new Fasada();
        return fasada.changeStatus(reservationID);
	}

	@Override
	public boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate) {
		iFasada fasada = new Fasada();
        return fasada.createReservation(clientPESEL,basicCost,bookingDetails,startDate,endDate);
	}

	@Override
	public boolean deleteHotel(int hotelID) {
		return false;
	}

	@Override
	public boolean editHotel(int hotelIDr) {
		return false;
	}

	@Override
	public float generateBill(int reservationID) throws Exception {
		iFasada fasada = new Fasada();
        return fasada.getBill(reservationID);
	}

	@Override
	public ArrayList<Client> getClientList(int hotelID) {
		return null;
	}

	@Override
	public Reservation getReservationDetails(int reservationID) {
		return null;
	}

	@Override
	public User login(String email, String password) {
		return null;
	}

	@Override
	public boolean register(String name, String surname, String PESEL, String email, String phoneNumber) {
		return false;
	}

	@Override
	public boolean registerHotel(String name, String directorPESEL, String hotelConfiguration) {
		return false;
	}

	@Override
	public User getUser(String PESEL) {
		iFasada fasada = new Fasada();
        return fasada.getUser(PESEL);
	}

	@Override
	public void setHotelConfigurationStrategy(String configuration, Hotel hotel) {

	}
}