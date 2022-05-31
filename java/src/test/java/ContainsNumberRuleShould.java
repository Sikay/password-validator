import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsNumberRuleShould {
    @Test
    public void given_number_validator_should_validate_a_text_with_number() {
        ContainsNumberRule containsNumberRule = new ContainsNumberRule();
        assertTrue(containsNumberRule.validate("texto88"));
    }

    @Test
    public void given_a_password_without_number_should_not_validate_it() {
        ContainsNumberRule containsNumberRule = new ContainsNumberRule();
        assertFalse(containsNumberRule.validate("texto"));
    }
}
