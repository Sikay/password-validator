import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MinimumLengthRuleTest {
    private final static int PASSWORD_LENGTH = 6;

    @Test
    public void should_have_minimum_length() {
        MinimumLengthRule minimumLength = new MinimumLengthRule(PASSWORD_LENGTH);
        assertTrue(minimumLength.validate("holatu"));
    }

    @Test
    public void should_not_validate_a_too_short_password() {
        MinimumLengthRule minimumLength = new MinimumLengthRule(PASSWORD_LENGTH);
        assertFalse(minimumLength.validate("holat"));
    }

    @Test
    public void should_not_validate_an_empty_password() {
        assertThrows(IllegalArgumentException.class, () -> new MinimumLengthRule(0));
    }

    @Test
    public void should_not_validate_a_negative_length() {
        assertThrows(IllegalArgumentException.class, () -> new MinimumLengthRule(-1));
    }
}
