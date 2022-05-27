public class Password {
    private final int MIN_LENGTH = 8;
    String numberRegex = "[0-9]+";

    public boolean validate(String password) {
        return minuminLengthPassword(password) && haveAnyCapitalLetter(password)
                && haveAnyLowerLetter(password) && haveAnyNumber(password);
    }


    private boolean haveAnyNumber(String password) {
        return !password.matches(numberRegex);
    }

    private boolean haveAnyLowerLetter(String password) {
        return password.equals(password.toUpperCase());
    }

    private boolean haveAnyCapitalLetter(String password) {
        return password.equals(password.toLowerCase());
    }

    private boolean minuminLengthPassword(String password) {
        return (password.length() < MIN_LENGTH);
    }
}
