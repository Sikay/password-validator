import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class PasswordFactoryShould {
    @Test
    public void create_a_simple_password_validator() {
        assertInstanceOf(Password.class, PasswordFactory.createPassword("simplePassword"));
    }

    @Test
    public void create_a_default_password_validator() {
        assertInstanceOf(Password.class, PasswordFactory.createPassword(""));
        assertInstanceOf(BasicPassword.class, PasswordFactory.createPassword(""));
    }
}
