public class LowerCaseRule {
    public boolean validate(String password) {
        return password.equals(password.toLowerCase());
    }
}
