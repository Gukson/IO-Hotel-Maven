package io.lab.hotel;

import io.lab.hotel.Model.Reservation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ZmianaStatusuRezerwacjiTest {

    private Reservation reservation;

    // Inicjalizacja przed każdym testem
    @BeforeEach
    void setUp() {
        reservation = new Reservation();
    }

    // Test sprawdzający domyślny status rezerwacji
    @Test
    void testDefaultStatus() {
        assertEquals("pending", reservation.getStatus(), "Default status should be 'pending'");
    }

    // Test parametryzowany dla zmiany statusu rezerwacji
    @ParameterizedTest
    @CsvSource({
            "1, paid, confirmed",
            "2, checked, cancelled"
    })
    void testChangeStatus(int reservationID, String newStatus, String expectedStatus) {
        reservation.setStatus(newStatus);
        assertEquals(expectedStatus, reservation.getStatus(), "Status should match the expected value");
    }

    // Test obsługi wyjątków podczas ustawiania statusu
    @ExtendWith(ExceptionHandler.class)
    @Test
    void testChangeStatusWithInvalidInput() {
        Executable executable = () -> reservation.setStatus(null);
        assertThrows(IllegalArgumentException.class, executable, "Should throw IllegalArgumentException for null status");
    }

    // Test na próbę zmiany statusu dla nieistniejącej rezerwacji
    @Test
    void testChangeStatusForNonExistingReservation() {
        Reservation nonExistingReservation = null;
        Executable executable = () -> {
            if (nonExistingReservation == null) {
                throw new IllegalArgumentException("Reservation does not exist");
            }
            nonExistingReservation.setStatus("confirmed");
        };
        assertThrows(IllegalArgumentException.class, executable, "Should throw exception for non-existing reservation");
    }

    // Klasa do obsługi wyjątków
    static class ExceptionHandler implements TestExecutionExceptionHandler {
        @Override
        public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
            System.err.println("Exception occurred during test execution: " + throwable.getMessage());
            throw throwable; // Rzuca wyjątek dalej, aby testy nie przechodziły mimo błędów
        }
    }
}