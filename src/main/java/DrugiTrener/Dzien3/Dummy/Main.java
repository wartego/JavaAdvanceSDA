package DrugiTrener.Dzien3.Dummy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Dummy dummy1 = new Dummy("name", 1);
        Dummy dummy2 = new Dummy("name", 1);
        System.out.println(dummy1.equals(dummy2));

        System.out.println(dummy1.hashCode());
        System.out.println(dummy2.hashCode());

        Set<Dummy> set = new HashSet<>();
        set.add(dummy1);
        set.add(dummy2);
        System.out.println(set);

        Map<Dummy, String> map = new HashMap<>();
        map.put(dummy1, "dummy1");
        map.put(dummy2, "dummy2");
        System.out.println(map);
    }
}
