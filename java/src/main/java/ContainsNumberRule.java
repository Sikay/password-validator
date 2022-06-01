import java.util.regex.Pattern;

public class ContainsNumberRule implements Rule {

    public static final String NUMBER_REGEX = "[0-9]+";

    public boolean validate(String password) {
        Pattern regexNumber = Pattern.compile(NUMBER_REGEX);
        return regexNumber.matcher(password).find();
    }
}
