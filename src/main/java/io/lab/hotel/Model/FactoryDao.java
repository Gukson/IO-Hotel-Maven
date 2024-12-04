package io.lab.hotel.Model;

import io.lab.hotel.Presenter.iFactoryDao;

public class FactoryDao implements iFactoryDao {

	public ChainDao CreateChainDao() {
		throw new UnsupportedOperationException();
	}

	public HotelDao CreateHotelDao() {
		throw new UnsupportedOperationException();
	}

	public ReservationDao CreateReservationDao() {
		throw new UnsupportedOperationException();
	}

	public UserDao CreateUserDao() {
		throw new UnsupportedOperationException();
	}

}