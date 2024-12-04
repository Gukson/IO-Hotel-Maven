package io.lab.hotel.Model;

public abstract class User {

	public boolean editUser(String PESEL) {
		return true;
	}

	public User getUser(String PESEL) {
		throw new UnsupportedOperationException();
	}

	public boolean createUser(String role, String name, String surname, String PESEL) {
		return true;
	}

}