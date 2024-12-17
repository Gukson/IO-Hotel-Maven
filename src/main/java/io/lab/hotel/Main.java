package io.lab.hotel;

import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Presenter.Fasada;
import io.lab.hotel.View.App;
import io.lab.hotel.View.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {






        //change status of reservation
        Fasada fasada = new Fasada();

        View view = new View();
        view.fasada = fasada;
        Client c = view.getUser("03301501234");
        ArrayList<Integer> r = c.getReservationList();
        Integer reservationID = r.get(0);
        System.out.println(view.getReservationDetails(reservationID).getStatus());
        view.changeStatus(reservationID);
        System.out.println(view.getReservationDetails(reservationID).getStatus());

        //Obsluga statusu meldunku



    }
}
