package io.lab.hotel.zad5;

import io.lab.hotel.Model.Fasada;
import io.lab.hotel.iFasada;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Tag("fasada")
public class FasadaTest {
    private iFasada fasada;

    @BeforeEach
    void setUp() {
        fasada = new Fasada(); // Inicjalizacja klasy przed każdym testem
    }

    @Test
    @Tag("valid")
    void testGetBillForValidReservation() throws Exception {
        float bill = fasada.getBill(1);
        assertEquals(600.00f, bill, "Bill should be 600.00 for reservation ID 1");
    }

    @Test
    @Tag("invalid")
    void testGetBillForInvalidReservation() {
        assertThrows(IllegalArgumentException.class, () -> fasada.getBill(999),
                "Should throw IllegalArgumentException for invalid reservation ID");
    }

    @ParameterizedTest
    @Tag("parameterized")
    @CsvSource({
            "1, 600.00",
            "2, 950.00"
    })
    void testGetBillWithMultipleValidReservations(int reservationID, float expectedBill) throws Exception {
        float bill = fasada.getBill(reservationID);
        assertEquals(expectedBill, bill, "Bill for reservation ID " + reservationID + " should be " + expectedBill);
    }

    @ParameterizedTest
    @Tag("valid")
    @MethodSource("provideTestData")
    void testGetBillWithMethodSource(int reservationID, float expectedBill) throws Exception {
        float bill = fasada.getBill(reservationID);
        assertEquals(expectedBill, bill, "Bill for reservation ID " + reservationID + " should be " + expectedBill);
    }

    static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(1, 600.00f),
                Arguments.of(2, 950.00f)
        );
    }
}
