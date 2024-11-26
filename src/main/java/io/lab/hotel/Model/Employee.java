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

	/**
	 * 
	 * @param Name
	 */
	public boolean setName(String Name) {
		return true;
	}

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param Surname
	 */
	public boolean setSurname(String Surname) {
		return true;
	}

	public String getPESEL() {
		// TODO - implement Employee.getPESEL
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param PESEL
	 */
	public boolean setPESEL(String PESEL) {
		return true;
	}

	public String getRole() {
		return this.role;
	}

	/**
	 * 
	 * @param role
	 */
	public boolean setRole(String role) {
		return true;
	}

	/**
	 * 
	 * @param name
	 * @param surname
	 * @param PESEL
	 */
	public Employee(String name, String surname, String PESEL) {
		// TODO - implement Employee.Employee
		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public boolean setEmail(String email) {
		return true;
	}

}