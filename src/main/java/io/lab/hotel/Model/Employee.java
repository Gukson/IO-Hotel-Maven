package io.lab.hotel.Model;

public class Employee extends User {
	private String name;
	private String surname;
	private String PESEL;
	private String role = "employee";
	private String email;

	public Employee(String name, String surname, String PESEL, String email) {
		this.name = name;
		this.surname = surname;
		this.PESEL = PESEL;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	public String getSurname() {
		return this.surname;
	}

	public boolean setSurname(String surname) {
		this.surname = surname;
		return true;
	}

	public String getPESEL() {
		return this.PESEL;
	}

	public boolean setPESEL(String PESEL) {
		this.PESEL = PESEL;
		return true;
	}

	public String getRole() {
		return this.role;
	}

	public boolean setRole(String role) {
		this.role = role;
		return true;
	}

	public String getEmail() {
		return this.email;
	}

	public boolean setEmail(String email) {
		this.email = email;
		return true;
	}
}