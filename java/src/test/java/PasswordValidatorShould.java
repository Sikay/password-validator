import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorShould {
     private Password password;

    @BeforeEach
    public void create_a_password() {
        password = new Password();
    }

    @ParameterizedTest
    @CsvSource({
            "hola",
            "holacaracola",
            "HOLACARACOLA",
            "Holacaracola",
            "Holacaracola96"

    })
    public void not_validate_invalid_passwords(String passwordText) {
        assertFalse(password.validate(passwordText));
    }

    @Test
    public void validate_right_password() {
        assertTrue(password.validate("Hola_caracola96"));
    }

    @Test
    public void password_receive_a_collaborator_class() {
        Password password = new Password(new MinimumLengthRule(6), new LowerCaseRule(), new UpperCaseRule(), new ContainsNumberRule());
        assertTrue(password.validate("Hola_96"));
    }

    @Test
    public void password_receive_a_underscore_collaborator_class() {
        Password password = new Password(new ContainsUnderscoreRule());
        assertTrue(password.validate("Hola_96"));
    }
}

