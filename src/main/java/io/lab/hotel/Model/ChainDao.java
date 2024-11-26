package io.lab.hotel.Model;


import io.lab.hotel.Presenter.iChainDao;

import java.util.ArrayList;

public class ChainDao implements iChainDao {

	/**
	 * 
	 * @param hotelID
	 */
	public boolean deleteHotel(int hotelID) {
		return true;
	}

	public ArrayList<Integer> getListOfHotels() {
		// TODO - implement ChainDao.getListOfHotels
		throw new UnsupportedOperationException();
	}

}