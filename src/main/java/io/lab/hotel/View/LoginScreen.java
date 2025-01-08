package io.lab.hotel.View;

import io.lab.hotel.Model.User;

import java.util.Scanner;

public class LoginScreen {
	public View view;

	public void register(String name, String surname, String PESEL, String email, String phoneNumber) {
		throw new UnsupportedOperationException();
	}

	public User login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj email: ");
		String email = scanner.nextLine();
		System.out.println("Podaj pw: ");
		String pw = scanner.nextLine();
		return view.login(email, pw);
	}

}