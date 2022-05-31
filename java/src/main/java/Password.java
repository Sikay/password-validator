import java.util.regex.Pattern;

public class Password {
    public static final int MINIMUN_LENGTH = 8;
    String numberRegex = "[0-9]+";

    private MinimumLengthRule minimumLengthRule;
    private LowerCaseRule lowerCaseRule;
    private UpperCaseRule upperCaseRule;

    public Password() {
        this.minimumLengthRule = new MinimumLengthRule(MINIMUN_LENGTH);
        this.lowerCaseRule = new LowerCaseRule();
        this.upperCaseRule = new UpperCaseRule();
    }

    public Password(MinimumLengthRule minimumLengthRule, LowerCaseRule lowerCaseRule, UpperCaseRule upperCaseRule) {
        this.minimumLengthRule = minimumLengthRule;
        this.lowerCaseRule = lowerCaseRule;
        this.upperCaseRule = upperCaseRule;
    }

    public boolean validate(String password) {
        return minimumLengthRule.validate(password) &&
                lowerCaseRule.validate(password) &&
                upperCaseRule.validate(password) &&
                hasNumber(password) &&
                hasUnderscore(password);
    }

    private boolean hasUnderscore(String password) {
        return password.contains("_");
    }

    private boolean hasNumber(String password) {
        Pattern regexNumber = Pattern.compile(numberRegex);
        return regexNumber.matcher(password).find();
    }

}
