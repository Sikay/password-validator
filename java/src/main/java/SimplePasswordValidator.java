public class SimplePasswordValidator implements Password {

    public static final int PASSWORD_LENGTH = 3;

    public boolean validate(String password) {
        return new MinimumLengthRule(PASSWORD_LENGTH).validate(password);
    }
}
