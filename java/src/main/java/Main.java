public class Main {
    public static void main(String[] args) {
        SimplePasswordValidator simplePasswordValidator = new SimplePasswordValidator();

        System.out.println(simplePasswordValidator.validate("hola"));

        Password simplePasswordValidator1 = PasswordFactory.create(PasswordType.SIMPLE_PASSWORD);
        System.out.println(simplePasswordValidator1.validate("hola"));
    }
}
