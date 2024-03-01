package com.syntexpro.customerapplication.customer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Customer Login Credentials JUnit Test")
class CustomerTest {

    private Customer customer;

    @BeforeEach
    void setUp() {
        customer = new Customer("John",
                "Doe",
                "JD_01",
                "john.doe@example.com",
                1980_01_01,
                123_456_7890L);
    }

    @DisplayName("Testing Login Credentials {John Doe}")
    @Test
    void customerTest1() {

        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals("JD_01", customer.getCustomerID());
        assertEquals("john.doe@example.com", customer.getEmail());
        assertEquals(1980_01_01, customer.getDateOfBirth());
        assertEquals(123_456_7890L, customer.getContactNumber());
    }


}
