import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MediumPasswordValidatorShould {
    @Test
    public void validate_a_length_Uppercase_and_underscore_password() {
        MediumPasswordValidator mediumPasswordValidator = new MediumPasswordValidator();
        assertTrue(mediumPasswordValidator.validate("Hola_caracola"));
    }
}
