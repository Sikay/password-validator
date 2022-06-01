public class PasswordFactory {
    public static Password createPassword(String simplePassword) {
        if (simplePassword.equals("simplePassword")) {
            return new SimplePasswordValidator();
        }

        return new BasicPassword();
    }
}
