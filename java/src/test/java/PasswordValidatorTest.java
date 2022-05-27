import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {

    @Test
    public void should_have_8_characters() {
        Password password = new Password();
        assertFalse(password.validate("hola"));
    }

    @Test
    public void should_have_a_capital_letter() {
        Password password = new Password();
        assertFalse(password.validate("Holacaracola"));
    }

}

