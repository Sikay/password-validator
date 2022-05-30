import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MinimumLengthRuleTest {
    @Test
    public void should_have_minimum_length() {
        MinimumLengthRule minimumLength = new MinimumLengthRule(6);
        assertTrue(minimumLength.validate("holatu"));
    }

    @Test
    public void should_not_validate_a_too_short_password() {
        MinimumLengthRule minimumLength = new MinimumLengthRule(6);
        assertFalse(minimumLength.validate("holat"));
    }

    @Test
    public void should_not_validate_a_negative_length() {
        MinimumLengthRule minimumLength = new MinimumLengthRule(-1);
        assertFalse(minimumLength.validate("holat"));
    }
}
