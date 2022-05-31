import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsNumberRuleShould {
    @Test
    public void given_number_validator_should_validate_a_text_with_number() {
        ContainsNumberRule containsNumberRule = new ContainsNumberRule();
        assertTrue(containsNumberRule.validate("texto88"));
    }
}
