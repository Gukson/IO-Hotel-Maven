package io.lab.hotel.Model;


import java.util.ArrayList;

public class ChainDao implements iChainDao {

	public boolean deleteHotel(int hotelID) {
		return true;
	}

	public ArrayList<Integer> getListOfHotels() {
		throw new UnsupportedOperationException();
	}

}