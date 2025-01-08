package io.lab.hotel.Model;

public interface iUserDao {

	void createUser(String role, String name, String surname, String PESEL);

	boolean editUser(String PESEL);

	User getUser(String PESEL);

}