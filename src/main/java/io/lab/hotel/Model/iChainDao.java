package io.lab.hotel.Model;

import java.util.ArrayList;

public interface iChainDao {

	boolean deleteHotel(int hotelID);

	ArrayList<Integer> getListOfHotels();

}