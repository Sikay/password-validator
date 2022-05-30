import java.util.regex.Pattern;

public class Password {
    public static final int MINIMUN_LENGTH = 8;
    String numberRegex = "[0-9]+";

    public boolean validate(String password) {
        return hasMinimunLength(password) &&
                hasLowerCase(password) &&
                hasCapitalLetter(password) &&
                hasNumber(password) &&
                hasUnderscore(password);
    }

    private boolean hasUnderscore(String password) {
        return !password.contains("_");
    }

    private boolean hasNumber(String password) {
        Pattern regexNumber = Pattern.compile(numberRegex);
        return !regexNumber.matcher(password).find();
    }

    private boolean hasCapitalLetter(String password) {
        return password.equals(password.toUpperCase());
    }

    private boolean hasLowerCase(String password) {
        return password.equals(password.toLowerCase());
    }

    private boolean hasMinimunLength(String password) {
        return password.length() < MINIMUN_LENGTH;
    }
}
