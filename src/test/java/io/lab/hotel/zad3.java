package io.lab.hotel;

import io.lab.hotel.Model.*;
import io.lab.hotel.View.CustomerService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Ustawienie kolejności testów
@ExtendWith(CustomTestExecutionExceptionHandler.class) //
public class zad3 {
    private iReservationDao reservationDao;

    @BeforeEach
    void setUp() {
        reservationDao = new ReservationDao(); // Inicjalizacja klasy przed każdym testem
    }

    @Test
    @Order(1)
    void testRoleForValidUser() throws Exception {
        float bill = reservationDao.generateBill(1);
        assertEquals(600.00, bill, "bill should be 600.00");
    }

    @Test
    @Order(3)
    void testRoleForInvalidUser() {
        assertThrows(IllegalArgumentException.class, () -> reservationDao.generateBill(999),
                "Should throw IllegalArgumentException for non-existing Reservation");
    }

    @ParameterizedTest
    @Order(2) // Test parametryzowany z CsvSource
    @CsvSource({
            "1, 600.00",
            "2, 950.00"
    })
    void testRoleParameterized(int reservationID, float expectedBill) throws Exception {
        float bill = reservationDao.generateBill(reservationID);
        assertEquals(expectedBill, bill, "wrong bill");
    }

    @ParameterizedTest
    @Order(4) // Test parametryzowany z MethodSource
    @MethodSource("provideTestData")
    void testRolesWithMethodSource(int reservationID, float expectedBill) throws Exception {
        float bill = reservationDao.generateBill(reservationID);
        assertEquals(expectedBill, bill, "wrong role");
    }

    static Stream<Arguments> provideTestData() {
        return TestData.getCustomerBills()
                .entrySet()
                .stream()
                .map(entry -> Arguments.of(entry.getKey(), entry.getValue()));
    }
}
