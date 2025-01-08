package io.lab.hotel.Model;

public class UserDao implements iUserDao {

	public void createUser(String role, String name, String surname, String PESEL) {
		throw new UnsupportedOperationException();
	}

	public boolean editUser(String PESEL) {
		return true;
	}

	public User getUser(String PESEL) {
		throw new UnsupportedOperationException();
	}

}