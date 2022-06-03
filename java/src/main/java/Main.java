public class Main {
    public static void main(String[] args) {
        SimplePasswordValidator simplePasswordValidator = new SimplePasswordValidator();

        System.out.println(simplePasswordValidator.validate("hola"));

        SimplePasswordValidator simplePasswordValidator1 = (SimplePasswordValidator) PasswordFactory.createPassword("simplePassword");
        System.out.println(simplePasswordValidator1.validate("hola"));
    }
}
