public class UpperCaseRule {
    public Boolean validate(String password) {
        return !password.equals(password.toLowerCase());
    }
}
