import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class SimplePasswordValidatorShould {
    @Test
    public void validate_a_password_with_short_length() {
        SimplePasswordValidator simplePasswordValidator = new SimplePasswordValidator();
        assertTrue(simplePasswordValidator.validate("hol"));
    }

}
