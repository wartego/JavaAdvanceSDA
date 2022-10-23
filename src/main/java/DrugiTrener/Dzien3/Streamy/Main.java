package DrugiTrener.Dzien3.Streamy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> letters = Arrays.asList("C", "D","Z","A","A");
        Stream<String> lettersStream = letters.stream();
 //       lettersStream.sorted((l1,l2) -> l1.compareTo(l2)).forEach(letter -> System.out.println(letter));
        lettersStream.sorted((l1,l2) -> l2.compareTo(l1)).forEach(letter -> System.out.println(letter));

        //filtrowanie danych
        System.out.println("!!!!!!!!!!!!!!!!");
        letters.stream().filter(letter -> !"A".equals(letter)).forEach(l -> System.out.println(l));

        ///////
        System.out.println("!!!!!!!!!!!!!!!!");
        letters.stream().map(l -> l.toLowerCase()).forEach( l -> System.out.println(l));
        System.out.println("!!!!!!!!!!!!!!!!");
        letters.stream().sorted().map(l -> l.toLowerCase()).forEach( l -> System.out.println(l));
    }
}
