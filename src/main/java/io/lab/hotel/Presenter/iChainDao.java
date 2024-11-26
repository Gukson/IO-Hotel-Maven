package io.lab.hotel.Presenter;

import java.util.ArrayList;

public interface iChainDao {

	/**
	 * 
	 * @param hotelID
	 */
	boolean deleteHotel(int hotelID);

	ArrayList<Integer> getListOfHotels();

}