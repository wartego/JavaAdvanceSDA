package DrugiTrener.Collection;


import java.util.*;

public class Collections {
    public static void main(String[] args) {
        //1 metoda
//        List<String > names = new ArrayList<>();
//        names.add("Adam");
//        names.add("Tomek");

        // 2 metoda
//        List<String> names = List.of("Adam", "Tomek");
//        System.out.println(names);
//        names.add("Kasia");
//        System.out.println(names);
        // 3 metoda
//        List<String> names = new ArrayList<>(List.of("Adam", "Tomek"));
//        names.add("Kasia");
//        System.out.println(names);
        // 4 metoda
//        List<String> names = new ArrayList<>(List.of("Adam", "Tomek"));
//        names.add("Kasia");
//        for(String name: names){
//            System.out.println("name" + name);
//        }
//        for (int i = 0; i < names.size(); i++){
//            System.out.println("name " + i + ": " + names.get(i));
//        }

        // Iterator
//        List<String> names = new ArrayList<>(List.of("Adam", "Tomek"));
//        names.add("Kasia");
//        Iterator <String> iterator = names.iterator();
//        while(iterator.hasNext()){
//            String name = iterator.next();
//            System.out.println(name);
//        }
//        //List Iterator
//        ListIterator<String> listIterator = names.listIterator();
//        listIterator.


        List<String> names = new ArrayList<>(List.of("Adam", "Tomek"));
        LinkedList<String> ls = new LinkedList<>(List.of("Adam", "Tomek"));
        System.out.println(ls.pollLast());
        System.out.println(ls);

        names.add("KASIA");
    }
}
