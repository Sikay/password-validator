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
    }

    public Password(MinimumLengthRule minimumLengthRule, LowerCaseRule lowerCaseRule, UpperCaseRule upperCaseRule) {
        this.minimumLengthRule = minimumLengthRule;
        this.lowerCaseRule = lowerCaseRule;
        this.upperCaseRule = upperCaseRule;
    }

    public boolean validate(String password) {
        return minimumLengthRule.validate(password) &&
                lowerCaseRule.validate(password) &&
                hasCapitalLetter(password) &&
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

    private boolean hasCapitalLetter(String password) {
        return !password.equals(password.toUpperCase());
    }

}
