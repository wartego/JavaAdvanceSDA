package DrugiTrener.Dzien2.TypyGeneryczne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        List list = new ArrayList<>();
//        list.add("Ewa");
//        list.add("Monika");
//        list.add("Maciej");
//        list.add("Anna");
//
//        for (Object o: list){
//            String name = (String) o;
//            System.out.println(name.toUpperCase());
//        }

//if (o instanceof String)
       // String name =






//typy genertyczne
        List<String> list = new ArrayList<>();
        list.add("Ewa");
        list.add("Monika");
        list.add("Maciej");
        list.add("Anna");
      // tego nie pozwoli dodac  list.add(new Car());

        for (String name: list){
            System.out.println(name.toUpperCase());

        }
    }
}
