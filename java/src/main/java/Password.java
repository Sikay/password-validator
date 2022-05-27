public class Password {


    public boolean validate(String password) {

        if (password.length() < 8) {
            return false;
        }

        String[] arrayPassword = password.split("");
        String passwordLowerCase = password.toLowerCase();
        for (int i = 0; i < arrayPassword.length ; i++) {
            if (!arrayPassword[i].equals(passwordLowerCase)) {
                return false;
            }
        }

        return true;
    }
}
