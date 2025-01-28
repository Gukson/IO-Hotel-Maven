package fitnesse.fixtures;

import fit.ColumnFixture;

public class ObliczanieRachunkuTest extends ColumnFixture {
    public int reservationID;       // Odpowiada kolumnie "reservationID"
    public float expectedBill;      // Odpowiada kolumnie "expectedBill"

    public boolean verifyBill() {
        try {
            System.out.println("reservationID: " + reservationID);
            System.out.println("expectedBill: " + expectedBill);
            System.out.println("SetUp.fasada: " + (SetUp.fasada != null));

            float actualBill = SetUp.fasada.getBill(reservationID);
            System.out.println("actualBill: " + actualBill);
            return Float.compare(actualBill, expectedBill) == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}