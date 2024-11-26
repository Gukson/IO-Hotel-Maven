package io.lab.hotel;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.User;
import io.lab.hotel.Model.Reservation;

import java.util.ArrayList;

public interface iPresenter {

	boolean acceptHotel();

	boolean changeStatus();

	boolean createReservation();

	boolean deleteHotel();

	boolean editHotel();

	boolean generateBill();

	ArrayList<Client> getClientList();

	Reservation getReservationDetails();

	User login();

	boolean register();

	boolean registerHotel();

}