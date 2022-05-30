public class MinimumLengthRule {
    private int passwordLength;
    private final static int MIN_PASSWORD_LENGTH = 0;

    public MinimumLengthRule(int passwordLength) {
        if (passwordLength <= MIN_PASSWORD_LENGTH) {
            throw new IllegalArgumentException("Password length must be greater than 0");
        }
        this.passwordLength = passwordLength;
    }

    public boolean validate(String password) {
        return password.length() >= passwordLength;
    }
}
