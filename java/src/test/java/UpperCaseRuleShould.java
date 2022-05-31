import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UpperCaseRuleShould {
    @Test
    public void given_upper_case_validator_should_validate_upper_case_text() {
        UpperCaseRule upperCaseRule = new UpperCaseRule();
        assertTrue(upperCaseRule.validate("unaMayuscula"));
    }

    @Test
    public void given_upper_case_validator_should_not_validate_lower_case_text() {
        UpperCaseRule upperCaseRule = new UpperCaseRule();
        assertFalse(upperCaseRule.validate("todasminusculas"));
    }
}
