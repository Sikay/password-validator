public class PasswordFactory {
    public static Password createPassword(String simplePassword) {
        return new SimplePasswordValidator();
    }
}
