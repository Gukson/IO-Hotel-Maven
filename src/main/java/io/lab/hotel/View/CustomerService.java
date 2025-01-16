package io.lab.hotel.View;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.User;
import io.lab.hotel.Presenter.Presenter;
import io.lab.hotel.iPresenter;

public class CustomerService {

	public float getBill(int reservationID) throws Exception {
		iPresenter presenter = new Presenter();
		float bill = presenter.generateBill(reservationID);
		return bill;
	}

	public boolean changeStatus() {

		iPresenter presenter = new Presenter();
		boolean results = presenter.changeStatus(1);
		return results;
	}

	public User getUser(String pesel) throws Exception {
		iPresenter presenter = new Presenter();
        return presenter.getUser(pesel);
	}
}