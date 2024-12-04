package io.lab.hotel.Model;

public class Employee extends User {

	private String name;
	private String surname;
	private String PESEL;
	private String role;
	private String email;

	public String getName() {
		return this.name;
	}

	public boolean setName(String Name) {
		return true;
	}

	public String getSurname() {
		return this.surname;
	}

	public boolean setSurname(String Surname) {
		return true;
	}

	public String getPESEL() {
		throw new UnsupportedOperationException();
	}

	public boolean setPESEL(String PESEL) {
		return true;
	}

	public String getRole() {
		return this.role;
	}

	public boolean setRole(String role) {
		return true;
	}

	public Employee(String name, String surname, String PESEL) {
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return this.email;
	}

	public boolean setEmail(String email) {
		return true;
	}

}