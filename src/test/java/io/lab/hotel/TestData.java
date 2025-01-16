package io.lab.hotel;

import java.util.HashMap;
import java.util.Map;

public class TestData {
    public static Map<Integer, Double> getCustomerBills() {
        Map<Integer, Double> customerBills = new HashMap<>();
        customerBills.put(1, 600.0);
        customerBills.put(2, 950.0);
        return customerBills;
    }

    public static Map<String, String> getUserData() {
        Map<String, String> usersData = new HashMap<>();
        usersData.put("98765432109", "employee");
        usersData.put("22222222222", "client");
        return usersData;
    }

}