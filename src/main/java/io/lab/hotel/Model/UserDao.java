package io.lab.hotel.Model;

import io.lab.hotel.Data.Data;

public class UserDao implements iUserDao {

	public void createUser(String role, String name, String surname, String PESEL) {
		throw new UnsupportedOperationException();
	}

	public boolean editUser(String PESEL) {
		return true;
	}

	public User getUser(String PESEL) {
		Data data = new Data();
		User u = data.getUserByPESEL(PESEL);
		if (u == null) {
			throw new IllegalArgumentException("User not found");
		}
		return u;
	}

}