package io.lab.hotel.Presenter;
import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Employee;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.iFasada;

import java.util.ArrayList;

public class Fasada implements iFasada {

	ArrayList<Client> clients;
	ArrayList<Reservation> reservations;
	public Fasada() {
		clients = new ArrayList<Client>();
		reservations = new ArrayList<Reservation>();
		clients.add(new Client("Jakub","Gurgul","03301501234","kuba@gurgul.com.pl", "693611771"));
		reservations.add(new Reservation("03301501234",0,"","17.12.2024", "20.12.2024",100));
		clients.get(0).addReservation(100);
	}

	public boolean acceptHotel(int hotelID) {
		return true;
	}

	public boolean changeStatus(int reservationID, String status) {
		int temp = -1;
		for (int x = 0; x < reservations.size(); x++) {
			if (reservations.get(x).getReservationID() == reservationID) {
				temp = x;
				break;
			}
		}
		if(temp == -1) return false;
		else {
			reservations.get(temp).setStatus(status);
		}
		return true;
	}


	public boolean createReservation(String clientPESEL, int basicCost, String bookingDetails, String startDate, String endDate) {
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


	public float getBill(float reservationID) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Employee> getEmployeesList(int hotelID) {
		throw new UnsupportedOperationException();
	}

	public Reservation getReservationDetails(int reservationID) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationID() == reservationID) {
                return reservation;
            }
        }
		return null;
	}

	public boolean hireEmployee(String name, String surname, String PESEL, String email) {
		return true;
	}

	public boolean login(String email, String password) {
		return true;
	}

	public boolean register(String name, String surname, String PESEL, String email, String phoneNumber) {
		return true;
	}

	public boolean registerHotel(String name, String directorPESEL, String hotelConfiguration) {
		return true;
	}

	public Client getUser(String PESEL) {
		for(Client client : clients) {
			if(client.getPESEL().equals(PESEL)) {
				return client;
			}
		}
		return null;
	}

	public String getStatus(int reservationID) {
		for (Reservation reservation : reservations) {
			if (reservation.getReservationID() == reservationID) {
				return reservation.getStatus();
			}
		}
		return null;
	}

}