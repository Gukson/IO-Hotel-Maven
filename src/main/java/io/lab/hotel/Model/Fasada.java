package io.lab.hotel.Model;
import io.lab.hotel.iFasada;

import java.util.ArrayList;

public class Fasada implements iFasada {


	public boolean acceptHotel(int hotelID) {
		return true;
	}

	public boolean changeStatus(int reservationID) {
		iFactoryDao factoryDao = new FactoryDao();
		iReservationDao reservationDao = factoryDao.CreateReservationDao();

		boolean response = reservationDao.changeStatus(reservationID);
		return response;
	}


	public boolean createReservation(String clientPESEL, float basicCost, String bookingDetails, String startDate, String endDate) {
		iFactoryDao factoryDao = new FactoryDao();
		iReservationDao reservationDao = factoryDao.CreateReservationDao();

		boolean response = reservationDao.createReservation(clientPESEL,basicCost,bookingDetails,startDate,endDate);
		return true;
	}

	public boolean deleteHotel(int hotelID) {
		return true;
	}

	public boolean editHotel(int hotelID) {
		return true;
	}

	public boolean fireEmployee(String PESEL) {
		return true;
	}


	public float getBill(int reservationID) throws Exception {
		iFactoryDao factoryDao = new FactoryDao();
		iReservationDao reservationDao = factoryDao.CreateReservationDao();
        return reservationDao.generateBill(reservationID);
	}

	public ArrayList<Employee> getEmployeesList(int hotelID) {
		throw new UnsupportedOperationException();
	}

	public Reservation getReservationDetails(int reservationID) {
//        for (Reservation reservation : reservations) {
//            if (reservation.getReservationID() == reservationID) {
//                return reservation;
//            }
//        }
		return null;
	}

	public boolean hireEmployee(String name, String surname, String PESEL, String email) {
		return true;
	}

	public User login(String email, String password) {
//		for(Client client : clients) {
//			if (Objects.equals(client.getEmail(), email)){
//				return client;
//			}
//		}
		return null;
	}

	public boolean register(String name, String surname, String PESEL, String email, String phoneNumber) {
		return true;
	}

	public boolean registerHotel(String name, String directorPESEL, String hotelConfiguration) {
		return true;
	}

	public User getUser(String PESEL) {
		iFactoryDao factoryDao = new FactoryDao();
		iUserDao userDao = factoryDao.CreateUserDao();
		return userDao.getUser(PESEL);
	}

	public String getStatus(int reservationID) {
		iFactoryDao factoryDao = new FactoryDao();
		iReservationDao reservationDao = factoryDao.CreateReservationDao();

		Reservation r = reservationDao.getReservationByID(reservationID);
		return r.getStatus();
	}

}