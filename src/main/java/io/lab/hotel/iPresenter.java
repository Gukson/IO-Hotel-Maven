package io.lab.hotel;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.User;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.Hotel;
import java.util.ArrayList;

public interface iPresenter  {

	boolean acceptHotel(int hotelID);

	boolean changeStatus(int reservationID);

	boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate);

	boolean deleteHotel(int hotelID);

	boolean editHotel(int hotelIDr);

	boolean generateBill(float reservationID);

	ArrayList<Client> getClientList(int hotelID);

	Reservation getReservationDetails(int reservationID);

	User login(String email, String password);

	boolean register(String name, String surname, String PESEL, String email, String phoneNumber);

	boolean registerHotel(String name, String directorPESEL, String hotelConfiguration);

	User getUser(String PESEL);


	void setHotelConfigurationStrategy(String configuration, Hotel hotel);

}