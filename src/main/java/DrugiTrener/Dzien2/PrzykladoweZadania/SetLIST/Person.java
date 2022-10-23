package DrugiTrener.Dzien2.PrzykladoweZadania.SetLIST;

public class Person {
    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

//    @Override
//    public boolean equals(Object obj){
//        if(this == obj){
//            return true;
//        }
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        Person person = (Person) obj;
//        boolean firstNameComparation =
//    }
}
