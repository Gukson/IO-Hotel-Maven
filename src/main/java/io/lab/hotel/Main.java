package io.lab.hotel;

import io.lab.hotel.Model.Fasada;
import io.lab.hotel.View.CustomerService;
import io.lab.hotel.View.View;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        System.out.println(customerService.changeStatus());
    }
}
