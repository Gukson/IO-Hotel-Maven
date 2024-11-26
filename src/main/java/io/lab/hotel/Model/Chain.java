package io.lab.hotel.Model;

import java.util.ArrayList;

public class Chain {
	public Chain() {
		this.listOfHotels = new ArrayList<Hotel>();
	}

	private ArrayList<Hotel> listOfHotels;

	public ArrayList<Hotel> getListOfHotels() {
		return this.listOfHotels;
	}


	public void deleteHotel() {
		// TODO - implement Chain.deleteHotel
		throw new UnsupportedOperationException();
	}

}