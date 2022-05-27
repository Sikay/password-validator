public class Password {


    public boolean validate(String password) {

        if (password.length() < 8) {
            return false;
        }

        String passwordLowerCase = password.toLowerCase();
       if (!password.equals(passwordLowerCase)) {
           return false;
       }

        return true;
    }
}
