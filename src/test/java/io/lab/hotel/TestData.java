package io.lab.hotel;

import java.util.HashMap;
import java.util.Map;

public class TestData {
    public static Map<Integer, Float> getCustomerBills() {
        Map<Integer, Float> customerBills = new HashMap<>();
        customerBills.put(1, 600.00F);
        customerBills.put(2, 950.0F);
        return customerBills;
    }

    public static Map<String, String> getUserData() {
        Map<String, String> usersData = new HashMap<>();
        usersData.put("98765432109", "employee");
        usersData.put("22222222222", "client");
        return usersData;
    }

}