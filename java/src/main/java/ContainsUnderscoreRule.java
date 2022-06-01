public class ContainsUnderscoreRule implements Rule {
    public boolean validate(String password) {
        return password.contains("_");
    }
}
