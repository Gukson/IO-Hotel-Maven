package io.lab.hotel;


import mockit.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import io.lab.hotel.Model.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class zad6 {
    @Mocked
    private iReservationDao reservationDao;

    @Test
    @Order(1)
    void testGenerateBillWithMockedDao() throws Exception {
        // Przygotowanie danych
        new Expectations() {{
            reservationDao.generateBill(1); result = 600.00f;
        }};

        // Test
        float bill = reservationDao.generateBill(1);
        assertEquals(600.00f, bill, "Bill should be 600.00");

        // Weryfikacja
        new Verifications() {{
            reservationDao.generateBill(1); times = 1;
        }};
    }

    @Test
    void testGenerateBillThrowsExceptionForInvalidReservation() throws Exception {
        // Przygotowanie danych
        new Expectations() {{
            reservationDao.generateBill(999); result = new IllegalArgumentException("Invalid Reservation ID");
        }};

        // Test
        assertThrows(IllegalArgumentException.class, () -> reservationDao.generateBill(999),
                "Should throw IllegalArgumentException for invalid reservation ID");

        // Weryfikacja
        new Verifications() {{
            reservationDao.generateBill(999); times = 1;
        }};
    }

    @ParameterizedTest
    @CsvSource({
            "1, 600.00",
            "2, 950.00"
    })
    void testGenerateBillParameterizedWithMockedDao(int reservationID, float expectedBill) throws Exception {
        new Expectations() {{
            reservationDao.generateBill(reservationID); result = expectedBill;
        }};

        // Test
        float bill = reservationDao.generateBill(reservationID);
        assertEquals(expectedBill, bill, "Incorrect bill calculation");

        // Weryfikacja
        new Verifications() {{
            reservationDao.generateBill(reservationID); times = 1;
        }};
    }

    @Test
    void testGenerateBillWithMultipleReservations() throws Exception {
        new Expectations() {{
            reservationDao.generateBill(1); result = 600.00f;
            reservationDao.generateBill(2); result = 950.00f;
        }};

        // Test
        float bill1 = reservationDao.generateBill(1);
        float bill2 = reservationDao.generateBill(2);
        assertEquals(600.00f, bill1, "Bill for reservation 1 should be 600.00");
        assertEquals(950.00f, bill2, "Bill for reservation 2 should be 950.00");

        new VerificationsInOrder() {{
            reservationDao.generateBill(1); times = 1;
            reservationDao.generateBill(2); times = 1;
        }};
    }
}
