package io.lab.hotel.Model;

public class FactoryDao implements iFactoryDao {

	public iChainDao CreateChainDao() {
		throw new UnsupportedOperationException();
	}

	public iHotelDao CreateHotelDao() {
		throw new UnsupportedOperationException();
	}

	public iReservationDao CreateReservationDao() {
		iReservationDao iReservationDao = new ReservationDao();
		return iReservationDao;
	}

	public iUserDao CreateUserDao() {
		throw new UnsupportedOperationException();
	}

}