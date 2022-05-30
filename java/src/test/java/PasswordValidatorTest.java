import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
     private Password password;

    @BeforeEach
    public void create_a_password() {
        password = new Password();
    }


    @Test
    public void should_have_8_characters() {
        assertFalse(password.validate("hola"));
    }

    @Test
    public void should_have_a_capital_letter() {
        assertFalse(password.validate("holacaracola"));
    }

    @Test
    public void should_have_a_lowers_letter() {
        assertFalse(password.validate("HOLACARACOLA"));
    }

    @Test
    public void should_have_a_number() {
        assertFalse(password.validate("Holacaracola"));
    }

    @Test
    public void should_have_an_underscore() {
        assertFalse(password.validate("Holacaracola96"));
    }

    @Test
    public void should_validate_right_password() {
        assertTrue(password.validate("Hola_caracola96"));
    }

    @Test
    public void should_password_receive_a_minimum_length_collaborator_class() {
        Password password = new Password(new MinimumLengthRule(6));
        assertTrue(password.validate("Hola_96"));
    }
}

