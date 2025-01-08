package io.lab.hotel.View;

import io.lab.hotel.Presenter.Presenter;
import io.lab.hotel.iPresenter;

public class CustomerService {

	public float getBill(float reservationID) {
		throw new UnsupportedOperationException();
	}

	public boolean changeStatus() {

		iPresenter presenter = new Presenter();
		boolean results = presenter.changeStatus(1);
		return results;
	}

}