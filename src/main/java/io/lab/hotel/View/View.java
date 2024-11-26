package io.lab.hotel.View;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.User;
import io.lab.hotel.iPresenter;

import java.util.ArrayList;

public class View implements iPresenter {

	public void Show() {
		// TODO - implement View.Show
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean acceptHotel() {
		return false;
	}

	@Override
	public boolean changeStatus() {
		return false;
	}

	@Override
	public boolean createReservation() {
		return false;
	}

	@Override
	public boolean deleteHotel() {
		return false;
	}

	@Override
	public boolean editHotel() {
		return false;
	}

	@Override
	public boolean generateBill() {
		return false;
	}

	@Override
	public ArrayList<Client> getClientList() {
		return null;
	}

	@Override
	public Reservation getReservationDetails() {
		return null;
	}

	@Override
	public User login() {
		return null;
	}

	@Override
	public boolean register() {
		return false;
	}

	@Override
	public boolean registerHotel() {
		return false;
	}
}