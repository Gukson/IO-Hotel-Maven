package io.lab.hotel;

import io.lab.hotel.View.CustomerService;
import io.lab.hotel.View.ViewOffer;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        System.out.println(customerService.getBill(2));

//        ViewOffer viewOffer = new ViewOffer();
//        System.out.println(viewOffer.createReservation());
    }
}
