
public class Password {
    public static final int MINIMUN_LENGTH = 8;

    private MinimumLengthRule minimumLengthRule;
    private LowerCaseRule lowerCaseRule;
    private UpperCaseRule upperCaseRule;
    private ContainsNumberRule containsNumberRule;

    public  Password() {
       this(
               new MinimumLengthRule(MINIMUN_LENGTH),
               new LowerCaseRule(),
               new UpperCaseRule(),
               new ContainsNumberRule());
    }

    public Password(MinimumLengthRule minimumLengthRule, LowerCaseRule lowerCaseRule, UpperCaseRule upperCaseRule, ContainsNumberRule containsNumberRule) {
        this.minimumLengthRule = minimumLengthRule;
        this.lowerCaseRule = lowerCaseRule;
        this.upperCaseRule = upperCaseRule;
        this.containsNumberRule = containsNumberRule;
    }

    public boolean validate(String password) {
        return minimumLengthRule.validate(password) &&
                lowerCaseRule.validate(password) &&
                upperCaseRule.validate(password) &&
                containsNumberRule.validate(password) &&
                hasUnderscore(password);
    }

    private boolean hasUnderscore(String password) {
        return password.contains("_");
    }

}
