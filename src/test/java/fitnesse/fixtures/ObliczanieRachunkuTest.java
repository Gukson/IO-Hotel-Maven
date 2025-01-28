package fitnesse.fixtures;

import fit.ColumnFixture;

public class ObliczanieRachunkuTest extends ColumnFixture {
    public int reservationID; // ID rezerwacji
    public float expectedBill; // Oczekiwana wartość rachunku

    public boolean verifyBill() {
        try {
            float actualBill = SetUp.fasada.getBill(reservationID);
            return Float.compare(actualBill, expectedBill) == 0;
        } catch (Exception e) {
            return false;
        }
    }
}

