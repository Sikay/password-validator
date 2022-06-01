public class LowerCaseRule implements Rule {
    public boolean validate(String password) {
        return !password.equals(password.toUpperCase());
    }
}
