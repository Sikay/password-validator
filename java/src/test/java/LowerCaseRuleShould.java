import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LowerCaseRuleShould {
    @Test
    public void given_a_lower_case_validator_should_validate_a_lower_case_text() {
        LowerCaseRule lowerCaseRule = new LowerCaseRule();
        assertTrue(lowerCaseRule.validate("minusculas"));
    }
}
