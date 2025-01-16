package io.lab.hotel.Data;

import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.Employee;
import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.User;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<Reservation> reservations;
    private List<User> users;

    public Data() {
        this.reservations = new ArrayList<>();
        this.users = new ArrayList<>();

        // Przykładowe dane rezerwacji
        Reservation res1 = new Reservation();
        res1.setReservationID(1);
        res1.setClientPESEL("12345678901");
        res1.setStartDate("2025-01-14");
        res1.setEndDate("2025-01-18");
        res1.setBasicCost(500);
        res1.setAddedCost(100);
        res1.setStatus("confirmed");
        res1.setBookingDetails("Room 101, 2 Guests");

        Reservation res2 = new Reservation();
        res2.setReservationID(2);
        res2.setClientPESEL("98765432109");
        res2.setStartDate("2025-02-01");
        res2.setEndDate("2025-02-05");
        res2.setBasicCost(800);
        res2.setAddedCost(150);
        res2.setStatus("pending");
        res2.setBookingDetails("Room 202, 1 Guest");

        Reservation res3 = new Reservation();
        res3.setReservationID(3);
        res3.setClientPESEL("11223344556");
        res3.setStartDate("2025-03-10");
        res3.setEndDate("2025-03-15");
        res3.setBasicCost(1200);
        res3.setAddedCost(200);
        res3.setStatus("cancelled");
        res3.setBookingDetails("Room 303, 3 Guests");

        // Dodanie rezerwacji do listy
        this.reservations.add(res1);
        this.reservations.add(res2);
        this.reservations.add(res3);

        // Przykładowi pracownicy
        Employee emp1 = new Employee("Anna", "Kowalska", "12345678901", "anna.kowalska@hotel.com");
        Employee emp2 = new Employee("Jan", "Nowak", "98765432109", "jan.nowak@hotel.com");
        Employee emp3 = new Employee("Maria", "Wiśniewska", "11223344556", "maria.wisniewska@hotel.com");

        // Przykładowi klienci
        Client client1 = new Client("Piotr", "Zieliński", "11111111111", "piotr.zielinski@gmail.com", "123456789");
        Client client2 = new Client("Katarzyna", "Wójcik", "22222222222", "katarzyna.wojcik@gmail.com", "987654321");
        Client client3 = new Client("Tomasz", "Lewandowski", "33333333333", "tomasz.lewandowski@gmail.com", "555666777");

        // Dodanie pracowników i klientów do jednej listy użytkowników
        this.users.add(emp1);
        this.users.add(emp2);
        this.users.add(emp3);
        this.users.add(client1);
        this.users.add(client2);
        this.users.add(client3);
    }

    // Metoda do pobierania rezerwacji na podstawie ID
    public Reservation getReservationByID(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationID() == id) {
                return reservation;
            }
        }
        return null; // Zwraca null, jeśli nie znaleziono rezerwacji o podanym ID
    }

    // Metoda do pobierania użytkownika na podstawie PESEL
    public User getUserByPESEL(String PESEL) {
        for (User user : users) {
            if (user.getPESEL().equals(PESEL)) {
                return user;
            }
        }
        return null; // Zwraca null, jeśli nie znaleziono użytkownika o podanym PESEL
    }

    // Metoda pomocnicza do wyświetlania wszystkich rezerwacji
    public List<Reservation> getAllReservations() {
        return this.reservations;
    }

    // Metoda pomocnicza do wyświetlania wszystkich użytkowników
    public List<User> getAllUsers() {
        return this.users;
    }
}