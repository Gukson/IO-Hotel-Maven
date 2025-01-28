package fitnesse.fixtures;

import fit.Fixture;
import io.lab.hotel.Model.Fasada;
import io.lab.hotel.iFasada;

public class SetUp extends Fixture {
    public static iFasada fasada;

    public SetUp() {
        // Inicjalizacja fasady
        fasada = new Fasada();
    }
}