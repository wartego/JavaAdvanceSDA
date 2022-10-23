package DrugiTrener.Dzien3.maps;

import java.util.*;

public class MapsMain {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        //dodawanie par do map
        map.put("B", 2);
        map.put("D", 4);
        map.put("C", 3);

        String b = "B";
        // pobieranie wartosci na podstawie klucza
        System.out.println(b + " jest " + map.get(b) + " litera w alfabecie.");

        //tworzenie seta z mapy
        Set<String> keys = map.keySet();
        System.out.println(keys);
        //iterowanie przez mapy
        for (String key : keys) {
            System.out.print("Klucz: " + key);
            System.out.println(" , Value: " + map.get(key));
        }
        List<String> names = List.of("Ania", "Ala", "Tomek");
        //wyrazenie lambda
        names.forEach(s -> System.out.println(s));

        //iterowanie za pomoca wyrazenia lambda

        System.out.println("======EntrySet=======");
        //iterowanie za pomoca EntrySet
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {

            //  prosta sposob wypisania -> System.out.println(entry);

            // lub
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + " , value " + value);
        }

        ///iterator
        System.out.println("=================");
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.print(" key: " + key + ", value: " + value);
            if (iterator.hasNext()) {
                System.out.print("; ");
            } else {
                System.out.print(".");
            }
        }
    }
}
