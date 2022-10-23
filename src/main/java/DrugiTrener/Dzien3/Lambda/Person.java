package DrugiTrener.Dzien3.Lambda;

public class Person implements Comparable<Person>{
    private String firstname;
    private String secondname;
    private int age;


    //warunki sortowania po 1. nazwisku i 2. po imieniu
    public int compareTo(Person person){
     if(this.getSecondname().compareTo(person.getSecondname()) >0){
         return 1;
     } else if (this.secondname.compareTo(person.getSecondname()) <0) {
         return -1;
     } else {
         return  this.firstname.compareTo(person.firstname); // jezeli nazwiska takie same to sprawdza imiona
         }
     }


    public Person(String firstname, String secondname, int age) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", age=" + age +
                '}';
    }
}
