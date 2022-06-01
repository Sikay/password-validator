public class SimplePasswordValidator extends Password {

    public static final int PASSWORD_LENGTH = 3;

    SimplePasswordValidator() {
        super(new MinimumLengthRule(PASSWORD_LENGTH));
    }
}
