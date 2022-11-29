package ZadaniaWlasneZaawansowane.KlasyIInterfejsy.Zadanie1UserValidator;

public class main {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator("tomek@brunata.com" ,"wartego@wp.pl");
        userValidator.validateEmails();
        System.out.println(userValidator);

    }
}
