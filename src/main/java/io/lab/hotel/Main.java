package io.lab.hotel;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Presenter.Fasada;
import io.lab.hotel.View.App;
import io.lab.hotel.View.CustomerService;
import io.lab.hotel.View.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //change status of reservation
        Fasada fasada = new Fasada();
        View view = new View();

        CustomerService customerService = new CustomerService();
        customerService.view = view;
        customerService.view.fasada = fasada;
        customerService.changeStatus();
        //add reservation



    }
}
