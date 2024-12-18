package io.lab.hotel.View;

import io.lab.hotel.Presenter.Fasada;

import java.util.ArrayList;

public class App {
	public Fasada fasada;
	public App() {
		this.views = new  ArrayList<View>();
	}

	public ArrayList<View> views;

}