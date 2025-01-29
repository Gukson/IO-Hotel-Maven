package io.lab.hotel.Data;

import io.lab.hotel.Model.Reservation;
import io.lab.hotel.Model.Employee;
import io.lab.hotel.Model.Client;
import io.lab.hotel.Model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private static final String FILE_NAME = "data.txt";
    private List<Reservation> reservations;
    private List<User> users;

    public Data() {
        this.reservations = new ArrayList<>();
        this.users = new ArrayList<>();
        loadDataFromFile();
    }

    private void loadDataFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts[0].equals("RESERVATION")) {
                    Reservation res = new Reservation();
                    res.setReservationID(Integer.parseInt(parts[1]));
                    res.setClientPESEL(parts[2]);
                    res.setStartDate(parts[3]);
                    res.setEndDate(parts[4]);
                    res.setBasicCost(Float.parseFloat(parts[5].replace(",", ".")));
                    res.setAddedCost(Float.parseFloat(parts[6].replace(",", ".")));
                    System.out.println(res.getBasicCost());
                    res.setStatus(parts[7]);
                    res.setBookingDetails(parts[8]);
                    reservations.add(res);
                } else if (parts[0].equals("EMPLOYEE")) {
                    users.add(new Employee(parts[1], parts[2], parts[3], parts[4]));
                } else if (parts[0].equals("CLIENT")) {
                    users.add(new Client(parts[1], parts[2], parts[3], parts[4], parts[5]));
                }
            }
        } catch (IOException e) {
            System.out.println("Brak pliku lub błąd odczytu, tworzenie nowego pliku...");
            saveDataToFile();
        }
    }

    private void saveDataToFile() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Reservation res : reservations) {
                bw.write(String.format("RESERVATION;%d;%s;%s;%s;%.2f;%.2f;%s;%s\n",
                        res.getReservationID(), res.getClientPESEL(), res.getStartDate(),
                        res.getEndDate(), res.getBasicCost(), res.getAddedCost(),
                        res.getStatus(), res.getBookingDetails()));
            }
            for (User user : users) {
                if (user instanceof Employee) {
                    Employee emp = (Employee) user;
                    bw.write(String.format("EMPLOYEE;%s;%s;%s;%s\n",
                            emp.getName(), emp.getSurname(), emp.getPESEL(), emp.getEmail()));
                } else if (user instanceof Client) {
                    Client client = (Client) user;
                    bw.write(String.format("CLIENT;%s;%s;%s;%s;%s\n",
                            client.getName(), client.getSurname(), client.getPESEL(),
                            client.getEmail(), client.getPhoneNumber()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Reservation getReservationByID(int id) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationID() == id) {
                saveDataToFile();
                return reservation;
            }
        }
        return null;
    }

    public User getUserByPESEL(String PESEL) {
        for (User user : users) {
            if (user.getPESEL().equals(PESEL)) {
                saveDataToFile();
                return user;
            }
        }
        return null;
    }

    public List<Reservation> getAllReservations() {
        saveDataToFile();
        return this.reservations;
    }

    public List<User> getAllUsers() {
        saveDataToFile();
        return this.users;
    }

    public Integer getListLenght(){
        return this.reservations.size();
    }

    public void createReservation(Reservation reservation) {
        reservations.add(reservation);
        saveDataToFile();
    }
}
