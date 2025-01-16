package io.lab.hotel.Model;

public class FactoryDao implements iFactoryDao {

	public iChainDao CreateChainDao() {
		throw new UnsupportedOperationException();
	}

	public iHotelDao CreateHotelDao() {
		throw new UnsupportedOperationException();
	}

	public iReservationDao CreateReservationDao() {
        return new ReservationDao();
	}

	public iUserDao CreateUserDao() {
        return new UserDao();
	}

}