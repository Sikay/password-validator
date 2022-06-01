import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsUnderscoreRuleShould {
    @Test
    public void given_underscore_validator_should_validate_a_text_with_underscore() {
        ContainsUnderscoreRule containsUnderscoreRule = new ContainsUnderscoreRule();
        assertTrue(containsUnderscoreRule.validate("textoCon_"));
    }
}
