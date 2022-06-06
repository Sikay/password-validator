import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordFactoryShould {

    @Test
    public void throw_exception_if_call_with_null(){
        assertThrows(IllegalArgumentException.class, () -> PasswordFactory.create(null));
    }

    @Test
    public void throw_exception_if_call_with_a_wrong_password_type() {
        assertThrows(IllegalArgumentException.class, () -> PasswordFactory.create(PasswordType.valueOf("a_total_random_password_validator")));
    }

    @Test
    public void create_a_simple_password_validator() {
        assertInstanceOf(Password.class, PasswordFactory.create(PasswordType.SIMPLE_PASSWORD));
        assertInstanceOf(SimplePasswordValidator.class, PasswordFactory.create(PasswordType.SIMPLE_PASSWORD));
    }

    @Test
    public void create_a_default_password_validator() {
        assertInstanceOf(Password.class, PasswordFactory.create(PasswordType.STANDARD_PASSWORD));
        assertInstanceOf(StandardPassword.class, PasswordFactory.create(PasswordType.STANDARD_PASSWORD));
    }

    @Test
    public void create_a_medium_password_validator() {
        assertInstanceOf(Password.class, PasswordFactory.create(PasswordType.MEDIUM_PASSWORD));
        assertInstanceOf(MediumPasswordValidator.class, PasswordFactory.create(PasswordType.MEDIUM_PASSWORD));
    }
}
