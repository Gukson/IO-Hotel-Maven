package io.lab.hotel;

import io.lab.hotel.View.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelTesty {

    private CustomerService customerService;

    // Inicjalizacja przed każdym testem
    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
    }

    // Test jednostkowy dla metody getBill z przykładowym wejściem
    @Test
    void testGetBillForKnownCustomer() {
        double bill = customerService.getBill(1);
        assertEquals(600.0, bill, "Bill should match expected value for customer ID 1");
    }

    // Test jednostkowy dla metody getBill dla nieznanego klienta
    @Test
    void testGetBillForUnknownCustomer() {
        double bill = customerService.getBill(999);
        assertEquals(0.0, bill, "Bill should be 0 for unknown customer ID");
    }

    // Test parametryzowany z wykorzystaniem CsvSource
    @ParameterizedTest
    @CsvSource({
            "1, 600.0",
            "2, 950.0",
            "999, 0.0"
    })
    void testGetBillParameterized(int customerId, double expectedBill) {
        double bill = customerService.getBill(customerId);
        assertEquals(expectedBill, bill, "Bill should match expected value");
    }

    // Obsługa wyjątków z adnotacją ExtendWith
//    @ExtendWith(ExceptionHandler.class)
//    @Test
//    void testGetBillWithException() {
//        Executable executable = () -> customerService.getBill(-1);
//        assertDoesNotThrow(executable, "Method should not throw an exception for invalid input");
//    }
//
//    // Klasa do obsługi wyjątków
//    static class ExceptionHandler implements TestExecutionExceptionHandler {
//        @Override
//        public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
//            System.err.println("Exception occurred during test execution: " + throwable.getMessage());
//            throw throwable; // Rzuca wyjątek dalej, aby testy nie przechodziły mimo błędów
//        }
//    }

}
