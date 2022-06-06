import java.util.Map;

public class PasswordFactory {
    private static final Map<PasswordType, Password> passwordTypes = (Map<PasswordType, Password>) Map.of(
            PasswordType.SIMPLE_PASSWORD, new SimplePasswordValidator(),
            PasswordType.MEDIUM_PASSWORD, new MediumPasswordValidator(),
            PasswordType.STANDARD_PASSWORD, new StandardPassword()
    );

    public static Password create(PasswordType passwordType) {
        if (null == passwordType) {
            throw new IllegalArgumentException();
        }

        return passwordTypes.get(passwordType);
    }
}
