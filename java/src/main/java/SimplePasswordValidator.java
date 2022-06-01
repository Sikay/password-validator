public class SimplePasswordValidator {
    public boolean validate(String password) {
        return new MinimumLengthRule(3).validate(password);
    }
}
