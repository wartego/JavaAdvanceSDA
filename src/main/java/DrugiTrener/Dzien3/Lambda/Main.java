package DrugiTrener.Dzien3.Lambda;

import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Marek", "Zanuszko", 54));
        people.add(new Person("Zuzanna", "Kieczko", 14));
        Person kowalski = new Person("Jan", "Kowalski", 20);
        people.add(new Person("Adam", "Kowalska", 20));
        people.add(kowalski);
        Person lipa = new Person("Marta", "Lipa", 34);
        people.add(lipa);

        // sortowanie (treeset)

        System.out.println(people); // bez sortowania

   //     AgeComperator ageComperator = new AgeComperator(); // to dziala




         ////////////////////////

        // wyrazenie lambda (zwiezlosc kod)

//        Comparator<Person> ageComparator  = (Person p1, Person p2) -> {
//            return Integer.compare(p1.getAge(), p2.getAge());
//        };

        /*/////////////////////////


        Comparator <Person> ageComparator = (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge());
        Collections.sort(people, (p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()));


        *//////////////////////////

        Comparator<Person> ageComparator = new Comparator<Person>() {
            //klasa anonimowa
            @Override
            public int compare(Person p1, Person p2) {
                if(p1.getAge() > p2.getAge()){
                    return 1;
                } else if(p1.getAge() < p2.getAge()) {
                    return -1;
                } else {
                    return 0;

                    //return Integer.compare(p1.getAge(), p2.getAge()); - to tez zadziala zamiast if
                }
            }
        };

        Collections.sort(people, ageComparator);

     //   Collections.sort(people);
        System.out.println(people);


//klasa Collection
///////////////////////////////////////////////////////////////

        List<String> string = new ArrayList<>();
        string.add("b");
        string.add("c");
        string.add("e");



        Collections.sort(string); //sortowanie
      //  Collections.reverse(string); //odwrocenie sortowania
        System.out.println(string);
//////////////////////


        System.out.println("=========....=======");
        people.forEach(p -> System.out.println(p.getFirstname() + " " + p.getSecondname()));
////////////////
//        Predicate<Person> personPredicate = new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAge() > 18;
//            }
//        };
//        System.out.println("=========....=======");
//        people.removeIf(personPredicate);
//        System.out.println(people);


/////////////////
// Wyswietla tylko osoby o nazwisko Kowalski
  // przyklad      people.removeIf(person -> person.getAge() > 18);
        people.removeIf(person -> !person.getSecondname().equals("Kowalski"));
        System.out.println(people);


/////////////
        System.out.println("=============");
        people.replaceAll(p -> {
            Person p1 = new Person(p.getFirstname(),p.getSecondname().toUpperCase(),p.getAge());
            return p1;
        });
        System.out.println(people);

    }
}