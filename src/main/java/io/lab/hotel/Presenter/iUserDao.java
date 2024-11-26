package io.lab.hotel.Presenter;

import io.lab.hotel.Model.User;

public interface iUserDao {

	/**
	 * 
	 * @param role
	 * @param name
	 * @param surname
	 * @param PESEL
	 */
	void createUser(String role, String name, String surname, String PESEL);

	/**
	 * 
	 * @param PESEL
	 */
	boolean editUser(String PESEL);

	/**
	 * 
	 * @param PESEL
	 */
	User getUser(String PESEL);

}