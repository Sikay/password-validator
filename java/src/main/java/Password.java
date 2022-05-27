public class Password {
    private final int MIN_LENGTH = 8;
    private final String REGEX = "[0-9a-zA-Z]+";
    ;

    public boolean validate(String password) {
        return !password.matches(REGEX);
    }
}