package io.lab.hotel.View;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.User;
import io.lab.hotel.Presenter.Fasada;
import io.lab.hotel.iPresenter;
import io.lab.hotel.Model.Hotel;

import java.util.ArrayList;
import java.util.Objects;

public class View implements iPresenter {

	public Fasada fasada;

	public void Show() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean acceptHotel(int hotelID) {
		return false;
	}

	@Override
	public boolean changeStatus(int reservationID) {
		String status = fasada.getStatus(reservationID);
		if (Objects.equals(status, "pending")) {
			fasada.changeStatus(reservationID, "checked");
			return true;
		} else if (Objects.equals(status, "checked")) {
			fasada.changeStatus(reservationID, "paid");
			return true;
		}
		return false;
	}

	@Override
	public boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate) {
		return false;
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
	public boolean generateBill(float reservationID) {
		return false;
	}

	@Override
	public ArrayList<Client> getClientList(int hotelID) {
		return null;
	}

	@Override
	public Reservation getReservationDetails(int reservationID) {
		return fasada.getReservationDetails(reservationID);
	}

	@Override
	public User login(String email, String password) {
//		User u = fasada.login(email, password);
//		if (u == null) {
//
//		}
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
	public Client getUser(String PESEL) {
		return fasada.getUser(PESEL);
	}

	@Override
	public void setHotelConfigurationStrategy(String configuration, Hotel hotel) {

	}
}