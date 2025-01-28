package fitnesse.fixtures;

import fit.ColumnFixture;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ZmianaStatusuRezerwacjiTest extends ColumnFixture {
    private static final Logger logger = Logger.getLogger(ZmianaStatusuRezerwacjiTest.class.getName());

    static {
        try {
            // Konfiguracja FileHandler dla zapisu logów do pliku
            FileHandler fileHandler = new FileHandler("application.log", true); // Plik logów (tryb dopisywania)
            fileHandler.setFormatter(new SimpleFormatter()); // Formatowanie logów jako tekst
            logger.addHandler(fileHandler); // Dodanie handlera do loggera
            logger.setUseParentHandlers(false); // Wyłączenie wyjścia na konsolę (opcjonalne)
        } catch (IOException e) {
            System.err.println("Błąd konfiguracji loggera: " + e.getMessage());
        }
    }

    public int reservationID;

    public boolean changeStatus() {
        try {
            String oldStatus = SetUp.fasada.getStatus(reservationID);
            logger.info("Stary status: " + oldStatus);

            boolean status = SetUp.fasada.changeStatus(reservationID);

            logger.info("Nowy status: " + status);

            return status;
        } catch (Exception e) {
            logger.severe("Błąd: " + e.getMessage());
            return false;
        }
    }
}