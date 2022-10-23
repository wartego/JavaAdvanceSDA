package PierwszyTrener.Task2_Person;

public class Runner {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Brooklyn Av. 12");
        Person s1 = new Student("Suzy", "New York");
        Person s2 = new Student("Suzy", "New York",StudiesType.DOKTORAT,1,100);
        Person w1 = new Staff("Tom", "Boston", "Driver",1000);
        Person test1 = new Staff("Tom", "Boston", "Driver",1_000);

        System.out.println(p1);
        System.out.println();
        System.out.println(s1);
        System.out.println();
        System.out.println(s2);
        System.out.println();
        System.out.println(w1);
        System.out.println();
        System.out.println(test1);

        Student s3 = new Student("Marian","Zgierz",StudiesType.PODYPLOMOWE,1,15_000);
    }
}
