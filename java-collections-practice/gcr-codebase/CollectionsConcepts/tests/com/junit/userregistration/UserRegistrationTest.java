package com.junit.userregistration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
    private final UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> registration.registerUser("prashant", "pras@example.com", "pass123"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("", "pras@example.com", "pass123"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("Prashant", "invalid-email", "password123"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> registration.registerUser("prashant", "pras@example.com", ""));
    }
}