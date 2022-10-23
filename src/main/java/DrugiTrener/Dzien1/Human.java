package DrugiTrener.Dzien1;

public class Human {
    private String firstName;
    private String secondName;
    private String lastName;

    public Human(String firstName, String secondName, String lastName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }
    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
