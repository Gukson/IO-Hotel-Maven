package io.lab.hotel.View;

import io.lab.hotel.Model.User;
import io.lab.hotel.Presenter.Presenter;

import java.util.Scanner;

public class LoginScreen {
	public Presenter presenter;

	public void register(String name, String surname, String PESEL, String email, String phoneNumber) {
		throw new UnsupportedOperationException();
	}

	public User login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj email: ");
		String email = scanner.nextLine();
		System.out.println("Podaj pw: ");
		String pw = scanner.nextLine();
		return presenter.login(email, pw);
	}

}