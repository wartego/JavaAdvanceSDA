package DrugiTrener.Dzien3.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("C", "Z", "B" , "D", "A");

        Stream<String > lettersStream = letters.stream();

        List<Person> people = List.of(
                new Person("Jan", "Malicki", 42),
                new Person("Maciej", "Januszko", 32),
                new Person("Karol", "Waceko", 64),
                new Person("Magda", "Zezko", 14),
                new Person("Marika", "Cialko", 45)
        );
        List<Person> sortedPeople = people.stream()
                .sorted((p1,p2) -> p2.getLastName().compareTo(p1.getLastName()))
                .collect(Collectors.toList()); // metoda zamykajaca strumien. zmienia strumien na liste spowrotem



        List<String> lastNames = people.stream()
                .map(person -> person.getLastName())
                .sorted()
                .collect(Collectors.toList());


       String s = people.stream()
                .map(person -> person.getLastName())
                .sorted()
                .collect(Collectors.joining(", "));


       long count = people.stream().filter(p -> p.getAge() > 18).count();
        System.out.println(count + "\n");


        System.out.println(sortedPeople +"\n");

        System.out.println(lastNames + "\n");

        System.out.println(s);

        // srednia osob, ktorych imie nie konczy sie na litere a
        double avg = people.stream().filter(p-> !"a".equals(String.valueOf(p.getFirstName().charAt(p.getFirstName().length() - 1))))
                .mapToInt(p-> p.getAge())
                .average().getAsDouble();
        System.out.println(avg);


        // stworz z listy people liste osob pelnoletnich

        System.out.println("============");

   //     List<Person> adults = people.stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());
  //      System.out.println(adults);

        // stworz na podstawie listy people liste stringow, zawierajace imiona i nazwiska osob pelnoletnich


        System.out.println("============");
       // List<Person> adults = people.stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());

        List<String> over18 = people.stream().
                filter(person -> person.getAge() >= 18)
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .collect(Collectors.toList());
        System.out.println(over18);


    }
}
