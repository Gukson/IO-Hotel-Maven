package io.lab.hotel.View;

import io.lab.hotel.Model.Fasada;
import io.lab.hotel.Presenter.Presenter;

import java.util.ArrayList;

public class App {
	public Fasada fasada;
	public App() {
		this.presenters = new  ArrayList<Presenter>();
	}

	public ArrayList<Presenter> presenters;

}