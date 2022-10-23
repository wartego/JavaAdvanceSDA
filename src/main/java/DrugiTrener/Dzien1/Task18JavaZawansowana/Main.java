package DrugiTrener.Dzien1.Task18JavaZawansowana;
// 18. Stwórz klasę Computer posiadającą pola określające cechy
//komputera: procesor, ram, karta grafiki, firma oraz model.
//Zaimplementuj settery, gettery, konstruktor z wszystkimi
//polami, metody toString()

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computer computer5 = new Computer("Intel","1GB","Geforce", "Panasonic", "ForceXX");

        Computer computer1 = new Laptop("Intel","8GB","Nvidia Geforce", "Panasonic", "ForceXX","5000mAh");
        Computer computer2 = new Laptop("AMD","16GB","Radeon", "Dell", "PowerXX","2000mAh");
        Computer computer3 = new Laptop("Intel","26GB","Nvidia", "Sony", "XX","4000mAh");

        Laptop computer4 = new Laptop("Intel","8GB","Nvidia Geforce", "Panasonic", "ForceXX","2000mAH");

        List<Computer> list = new ArrayList<>();
        list.add(computer1);
        list.add(computer2);
        list.add(computer3);
        list.add(computer4);
        list.add(computer5);

        for (Computer temp: list) {
            System.out.println(temp.toString());
        }
    }
}
