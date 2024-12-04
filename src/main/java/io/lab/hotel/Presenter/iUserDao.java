package io.lab.hotel.Presenter;

import io.lab.hotel.Model.User;

public interface iUserDao {

	void createUser(String role, String name, String surname, String PESEL);

	boolean editUser(String PESEL);

	User getUser(String PESEL);

}