package io.lab.hotel;

import io.lab.hotel.Model.Reservation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class zad2 {

    private Reservation reservation;

    // Inicjalizacja przed każdym testem
    @BeforeEach
    void setUp() {
        reservation = new Reservation();
    }

    // Test jednostkowy dla metody getBill z przykładowym wejściem
    @Test
    void testDefaultStatus() throws Exception {
        assertEquals("pending", reservation.getStatus());
    }

    // Test parametryzowany z wykorzystaniem CsvSource
    @ParameterizedTest
    @CsvSource({
            "100.0, 50.0, 150.0",
            "200.0, 0.0, 200.0"
    })
    void testCostCalculation(float basicCost, float addedCost, float expectedTotal) throws Exception{
        reservation.setBasicCost(basicCost);
        reservation.setAddedCost(addedCost);
        assertEquals(expectedTotal, reservation.getBasicCost() + reservation.getAddedCost());
    }

    @ExtendWith(ExceptionHandler.class)
    @Test
    void testGetBillWithException() {
        Executable executable = () -> reservation.setClientPESEL("12345678910");
        assertDoesNotThrow(executable, "Method should not throw an exception for valid input");
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
