package io.lab.hotel.View;

import io.lab.hotel.Presenter.Presenter;
import io.lab.hotel.iPresenter;

import java.util.Scanner;

public class ViewOffer {

	public boolean createReservation() {

		iPresenter presenter = new Presenter();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter PESEL: ");
		String pesel = scanner.nextLine();

		System.out.print("Enter start_date: ");
		String start_date = scanner.nextLine();

		System.out.print("Enter end_date: ");
		String end_date = scanner.nextLine();
		boolean result = presenter.createReservation(pesel,1000,"very soft bed please",start_date,end_date);

		return result;
	}

}