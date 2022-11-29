package ZadaniaWlasneZaawansowane.KlasyIInterfejsy.Zadanie1UserValidator;

import java.util.regex.Pattern;

public class UserValidator {
    public final String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private String email;
    private String alternativeEmail;
    public UserValidator() {
    }

    public UserValidator(String email, String alternativeEmail) {
        this.email = email;
        this.alternativeEmail = alternativeEmail;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }

    public void validateEmails() {
     checkEmailCondition(email);
     checkAlternativeEmailCondition(alternativeEmail);
    }


    public void checkEmailCondition(String mail) {
        if (mail.equals("") || mail == null) {
            setEmail("unknown");
        }
        if (!Pattern.matches(regexPattern, mail)) {
            setEmail("unknown");
        }

    }

    public void checkAlternativeEmailCondition(String mail) {
        if (mail.equals("") || mail == null) {
            setAlternativeEmail("unknown");
        }
        if (!Pattern.matches(regexPattern, mail)) {
            setAlternativeEmail("unknown");
        }

    }


    @Override
    public String toString() {
        return "UserValidator{" +
                "email='" + email + '\'' +
                ", alternativeEmail='" + alternativeEmail + '\'' +
                '}';
    }
}
