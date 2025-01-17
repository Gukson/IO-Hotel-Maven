package io.lab.hotel;

import io.lab.hotel.Model.Fasada;
import io.lab.hotel.iFasada;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(CustomTestExecutionExceptionHandler.class)
public class zad4 {
    private iFasada fasada;

    @BeforeEach
    void setUp() {
        fasada = new Fasada(); // Inicjalizacja klasy przed każdym testem
    }

    @Test
    @Order(1)
    void testRoleForValidUser() throws Exception {
        float bill = fasada.getBill(1);
        assertEquals(600.00, bill, "Bill should be 600.00");
    }

    @Test
    @Order(3)
    void testRoleForInvalidUser() {
        assertThrows(IllegalArgumentException.class, () -> fasada.getBill(999),
                "Should throw IllegalArgumentException for non-existing Reservation");
    }

    @ParameterizedTest
    @Order(2)
    @CsvSource({
            "1, 600.00",
            "2, 950.00"
    })
    void testRoleParameterized(int reservationID, float expectedBill) throws Exception {
        float bill = fasada.getBill(reservationID);
        assertEquals(expectedBill, bill, "Wrong bill");
    }

    @ParameterizedTest
    @Order(4)
    @MethodSource("provideTestData")
    void testRolesWithMethodSource(int reservationID, float expectedBill) throws Exception {
        float bill = fasada.getBill(reservationID);
        assertEquals(expectedBill, bill, "Wrong role");
    }

    static Stream<Arguments> provideTestData() {
        return TestData.getCustomerBills()
                .entrySet()
                .stream()
                .map(entry -> Arguments.of(entry.getKey(), entry.getValue()));
    }

    @Test
    @Order(5)
    void testWithException() throws Exception {
        float bill = fasada.getBill(99);
        assertEquals(600.00, bill, "Bill should be 600.00");
    }
}