public class Password {


    public boolean validate(String password) {

        if (password.length() < 8) {
            return false;
        }

        return true;
    }
}
