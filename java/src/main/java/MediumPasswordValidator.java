public class MediumPasswordValidator implements Password{

    @Override
    public boolean validate(String password) {
        return new StandardPassword(
                new MinimumLengthRule(5),
                new UpperCaseRule(),
                new ContainsUnderscoreRule()
        ).validate(password);
    }
}
