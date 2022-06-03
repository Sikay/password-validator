public class PasswordFactory {
    public static Password createPassword(String password) {
        if (password.equals("simplePassword")) {
            return new SimplePasswordValidator();
        }
        if (password.equals("mediumPassword")) {
            return new MediumPasswordValidator();
        }

        return new StandardPassword();
    }
}
