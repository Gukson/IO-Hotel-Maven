package fitnesse.fixtures;

import fit.ColumnFixture;

public class TestTworzenieRezerwacji extends ColumnFixture {

    String clientPESEL;
    float basicCost;
    String bookingDetails;
    String startDate;
    String endDate;

    public boolean dodajRezerwacje() {
        return SetUp.fasada.createReservation(clientPESEL, basicCost, bookingDetails, startDate, endDate);
    }
}