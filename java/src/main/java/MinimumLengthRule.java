public class MinimumLengthRule {
    private int passwordLength;

    public MinimumLengthRule(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    public boolean validate(String password) {
        return password.length() >= passwordLength;
    }
}
