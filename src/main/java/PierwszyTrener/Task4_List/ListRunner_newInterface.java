package PierwszyTrener.Task4_List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ListRunner_newInterface {
    public static void main(String[] args) {

//LIST
        List<Integer> myList = new ArrayList<>();   // to sa generyki
        myList.add(2);
        myList.add(-20);
        myList.add(50);
        myList.add(5000);
        myList.add(40);
        myList.add(800);
        myList.add(55);
        myList.add(78);
        System.out.println("Old fashion interation /depracated  ");
        for (int i =0; i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        System.out.println("---Enhanced list iteration");
        for (Integer el : myList){
            System.out.println(el);
        }
        System.out.println("---Stream iteration---");
        //myList.stream().forEach(el -> System.out.println(el)); // wyrazenie lambda
        myList.forEach(System.out::println); // zapis method :: reference



//SET

        Set<Integer> mySet = new HashSet<>();
        mySet.add(22);
        mySet.add(2);
        mySet.addAll(myList);
        System.out.println("---Stream iteration from SET---");
        mySet.forEach(System.out::println);
//Stream

//        System.out.println("Number from range 20-100");
//        Consumer myPrint = el -> System.out.println("Moj element : " + el); // wyrazenie lambda
//
//        myList.stream()
////                filter(integer -> integer>=20 && integer <=100)
//                .filter(el -> el>=20)
//                .filter(el -> el <=100)
//                .distinct()
//                .forEach(System.out::println);


        // Druga wersja

        System.out.println("Number from range 20-100");
        Consumer<Integer> myPrint = el -> System.out.println("Moj element : " + el); // wyrazenie lambda
        Predicate<Integer> valuesLowerThen100 = el -> el <=100;
//        Supplier<Integer> mySupp = () -> Integer.MIN_VALUE; // wyrazenie lambda
        Supplier<Integer> mySupp = () -> {
            System.out.println("bla bla bla ");
            return Integer.MIN_VALUE;
        };


        myList.stream()
//                filter(integer -> integer>=20 && integer <=100)
                .filter(new ValuesGreater())
                .filter(valuesLowerThen100)
                .distinct()
                .forEach( myPrint);
    }
}
// bezposrednie implementowanie interfejsu funkcyjnego
class ValuesGreater implements Predicate<Integer> {
private  final int LOW_BOUND = 20;
@Override
    public boolean test(Integer element){
        return LOW_BOUND <=element;
    }

}
