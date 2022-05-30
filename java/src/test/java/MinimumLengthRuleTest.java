import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MinimumLengthRuleTest {
    @Test
    public void should_have_minimum_length() {
        MinimumLengthRule minimumLength = new MinimumLengthRule(6);
        assertTrue(minimumLength.validate("holatu"));
    }
}
