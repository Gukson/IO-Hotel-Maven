package io.lab.hotel.Model;

public abstract class User {

	/**
	 * 
	 * @param PESEL
	 */
	public boolean editUser(String PESEL) {
		return true;
	}

	/**
	 * 
	 * @param PESEL
	 */
	public User getUser(String PESEL) {
		// TODO - implement User.getUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param role
	 * @param name
	 * @param surname
	 * @param PESEL
	 */
	public boolean createUser(String role, String name, String surname, String PESEL) {
		return true;
	}

}