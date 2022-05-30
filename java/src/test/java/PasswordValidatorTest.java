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
}

