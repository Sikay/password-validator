import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StandardPassword implements Password {
    public static final int MINIMUN_LENGTH = 8;
    private List<Rule> rule = new ArrayList<>();

    public StandardPassword() {
       this(
               new MinimumLengthRule(MINIMUN_LENGTH),
               new LowerCaseRule(),
               new UpperCaseRule(),
               new ContainsNumberRule(),
               new ContainsUnderscoreRule());
    }

    public StandardPassword(Rule... rules) {
        this.rule.addAll(Arrays.asList(rules));
    }

    public boolean validate(String password) {
        for (Rule rul: rule) {
            if (!rul.validate(password)) {
                return false;
            };
        }
        return true;
    }



}
