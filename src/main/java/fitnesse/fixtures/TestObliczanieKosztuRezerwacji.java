
package fitnesse.fixtures;

import fit.ColumnFixture;

public class TestObliczanieKosztuRezerwacji extends ColumnFixture {

    int IdRezerwacji;
    float kosztOczekiwany;

    public boolean kosztRezerwacji() throws Exception {
        return SetUp.fasada.getBill(IdRezerwacji) == kosztOczekiwany;
    }
}