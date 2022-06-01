public class UpperCaseRule implements Rule {
    public boolean validate(String password) {
        return !password.equals(password.toLowerCase());
    }
}
