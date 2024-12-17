package io.lab.hotel;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.User;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.Hotel;
import java.util.ArrayList;

public interface iPresenter {

	boolean acceptHotel(int hotelID);

	boolean changeStatus(int reservationID);

	/**
	 * 
	 * @param clientPESEL
	 * @param basicCost
	 * @param bookingDetails
	 * @param startDate
	 * @param endDate
	 */
	boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate);

	/**
	 * 
	 * @param hotelID
	 */
	boolean deleteHotel(int hotelID);

	/**
	 * 
	 * @param hotelIDr
	 */
	boolean editHotel(int hotelIDr);

	/**
	 * 
	 * @param reservationID
	 */
	boolean generateBill(float reservationID);

	/**
	 * 
	 * @param hotelID
	 */
	ArrayList<Client> getClientList(int hotelID);

	/**
	 * 
	 * @param reservationID
	 */
	Reservation getReservationDetails(int reservationID);

	/**
	 * 
	 * @param email
	 * @param password
	 */
	User login(String email, String password);

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param PESEL
	 * @param email
	 * @param phoneNumber
	 */
	boolean register(String name, String surname, String PESEL, String email, String phoneNumber);

	/**
	 * 
	 * @param name
	 * @param directorPESEL
	 * @param hotelConfiguration
	 */
	boolean registerHotel(String name, String directorPESEL, String hotelConfiguration);

	/**
	 * 
	 * @param PESEL
	 */
	User getUser(String PESEL);

	/**
	 * 
	 * @param configuration
	 * @param hotel
	 */
	void setHotelConfigurationStrategy(String configuration, Hotel hotel);

}