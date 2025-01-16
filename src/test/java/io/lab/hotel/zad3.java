package io.lab.hotel;

import io.lab.hotel.Model.User;
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
    private CustomerService customerService;

    @BeforeEach
    void setUp() {
        customerService = new CustomerService(); // Inicjalizacja klasy przed każdym testem
    }

    @Test
    @Order(1)
    void testRoleForValidUser() throws Exception {
        String role = customerService.getUser("12345678901").getRole();
        assertEquals("employee", role, "role should be employee");
    }

    @Test
    @Order(3)
    void testRoleForInvalidUser() {
        assertThrows(IllegalArgumentException.class, () -> customerService.getUser("7895456123").getRole(),
                "Should throw IllegalArgumentException for non-existing User");
    }

    @ParameterizedTest
    @Order(2) // Test parametryzowany z CsvSource
    @CsvSource({
            "98765432109, employee",
            "22222222222, client"
    })
    void testRoleParameterized(String pesel, String expectedRole) throws Exception {
        String role = customerService.getUser(pesel).getRole();
        assertEquals(expectedRole, role, "wrong role");
    }

    @ParameterizedTest
    @Order(4) // Test parametryzowany z MethodSource
    @MethodSource("provideTestData")
    void testRolesWithMethodSource(String pesel, String expectedRole) throws Exception {
        String role = customerService.getUser(pesel).getRole();
        assertEquals(expectedRole, role, "wrong role");
    }

    static Stream<Arguments> provideTestData() {
        return TestData.getUserData()
                .entrySet()
                .stream()
                .map(entry -> Arguments.of(entry.getKey(), entry.getValue()));
    }
}
