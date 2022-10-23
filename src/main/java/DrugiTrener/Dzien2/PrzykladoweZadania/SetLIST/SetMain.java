package DrugiTrener.Dzien2.PrzykladoweZadania.SetLIST;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        set.add("Adnia");
//        set.add("Kasia");
//        set.add("Adnia");
//        set.add("Marta");
//        set.add("Adnia");
//        System.out.println(set.size());
        Set<Person> people = new HashSet<>();


        // tutaj duplilat przejdzie bo to są 3 rozne obiekty
        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Andrzej", "Migalski"));
        people.add(new Person("Jan", "Kowalski"));
        System.out.println(people.size());


        //da nam to wynik NullPointerException
//        p1.equals(null);
//        Person p4 = null;
//        p4.equals(p1);
    }
}
