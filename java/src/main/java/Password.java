import java.util.regex.Pattern;

public class Password {
    String numberRegex = "[0-9]+";

    public boolean validate(String password) {
        if (password.length() < 8) {
            return false;
        }

        String passwordLowerCase = password.toLowerCase();
        if (password.equals(passwordLowerCase)) {
            return false;
        }

        if (password.equals(password.toUpperCase())) {
            return false;
        }

        Pattern regexNumber = Pattern.compile(numberRegex);

        if (!regexNumber.matcher(password).find()){
            return false;
        }

        if (!password.contains("_")) {
            return false;
        }

        return true;
    }
}
