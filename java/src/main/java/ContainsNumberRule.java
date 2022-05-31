import java.util.regex.Pattern;

public class ContainsNumberRule {
    public boolean validate(String password) {
        Pattern regexNumber = Pattern.compile("[0-9]+");
        return regexNumber.matcher(password).find();
    }
}
