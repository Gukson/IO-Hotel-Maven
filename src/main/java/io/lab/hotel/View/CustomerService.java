package io.lab.hotel.View;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {
	public View view;

	public float getBill(float reservationID) {
		throw new UnsupportedOperationException();
	}

	public void changeStatus() {
		Scanner scanner = new Scanner(System.in);

		// Wczytaj ciąg znaków
		System.out.print("Podaj pesel clienta: ");
		String PESEL = scanner.nextLine();
		Client c = view.getUser(PESEL);
		ArrayList<Integer> r = c.getReservationList();
		for(int i = 0; i < r.size(); i++){
			Reservation rez = view.getReservationDetails(r.get(i));
			System.out.println("ID: " + rez.getReservationID());
			System.out.println("PESEL: " + rez.getClientPESEL());
			System.out.println("Data startu: " + rez.getStartDate());
			System.out.println("Data końca: " + rez.getEndDate() + "\n");
		}

		System.out.print("Podaj id rezerwacji: ");
		int id = Integer.parseInt(scanner.nextLine());
		view.changeStatus(id);
		System.out.println("nowy status: "+view.getReservationDetails(id).getStatus());

	}

}