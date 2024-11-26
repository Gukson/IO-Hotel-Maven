package io.lab.hotel.Presenter;

import io.lab.hotel.Model.ChainDao;
import io.lab.hotel.Model.HotelDao;
import io.lab.hotel.Model.ReservationDao;
import io.lab.hotel.Model.UserDao;

public interface iFactoryDao {

	UserDao CreateUserDao();

	ReservationDao CreateReservationDao();

	HotelDao CreateHotelDao();

	ChainDao CreateChainDao();

}