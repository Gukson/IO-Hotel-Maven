package io.lab.hotel.View;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.iPresenter;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerService {

	public float getBill(float reservationID) {
		throw new UnsupportedOperationException();
	}

	public boolean changeStatus() {

		iPresenter presenter = new View();
		boolean results = presenter.changeStatus(1);
		return results;
	}

}