package io.lab.hotel.Model;

import io.lab.hotel.Presenter.iUserDao;
/**
 * Implements: IUserDAO
 */
public class UserDao implements iUserDao  {

	/**
	 * 
	 * @param role
	 * @param name
	 * @param surname
	 * @param PESEL
	 */
	public void createUser(String role, String name, String surname, String PESEL) {
		// TODO - implement UserDao.createUser
		throw new UnsupportedOperationException();
	}

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
		// TODO - implement UserDao.getUser
		throw new UnsupportedOperationException();
	}

}