package io.lab.hotel;

import io.lab.hotel.View.CustomerService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.function.Executable; // Właściwy interfejs JUnit 5
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class zad2 {

    private CustomerService customerService;

    // Inicjalizacja przed każdym testem
    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
    }

    // Test jednostkowy dla metody getBill z przykładowym wejściem
    @Test
    void testGetBillForKnownCustomer() throws Exception {
        double bill = customerService.getBill(1);
        assertEquals(600.0, bill, "Bill should match expected value for customer ID 1");
    }

    // Test parametryzowany z wykorzystaniem CsvSource
    @ParameterizedTest
    @CsvSource({
            "1, 600.0",
            "2, 950.0"
    })
    void testGetBillParameterized(int customerId, double expectedBill) throws Exception {
        double bill = customerService.getBill(customerId);
        assertEquals(expectedBill, bill, "Bill should match expected value");
    }

    // Obsługa wyjątków z adnotacją ExtendWith
    @ExtendWith(ExceptionHandler.class)
    @Test
    void testGetBillWithException() {
        Executable executable = () -> customerService.getBill(1); // Poprawny Executable
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
