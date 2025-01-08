package io.lab.hotel.Model;

public interface iFactoryDao {

	iUserDao CreateUserDao();

	iReservationDao CreateReservationDao();

	iHotelDao CreateHotelDao();

	iChainDao CreateChainDao();

}