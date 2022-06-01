import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsUnderscoreRuleShould {
    @Test
    public void given_underscore_validator_should_validate_a_text_with_underscore() {
        ContainsUnderscoreRule containsUnderscoreRule = new ContainsUnderscoreRule();
        assertTrue(containsUnderscoreRule.validate("textoCon_"));
    }

    @Test
    public void given_a_password_without_underscore_should_not_validate_the_password() {
        ContainsUnderscoreRule containsUnderscoreRule = new ContainsUnderscoreRule();
        assertFalse(containsUnderscoreRule.validate("textoCon"));
    }
}
