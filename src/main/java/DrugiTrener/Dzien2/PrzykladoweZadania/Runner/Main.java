package DrugiTrener.Dzien2.PrzykladoweZadania.Runner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


Runner runner1 = Runner.getFitnessLevel(5);
Runner runner2 = Runner.getFitnessLevel(15);
Runner runner3 = Runner.getFitnessLevel(25);
        System.out.println(runner1);

        List<Runner> list = new ArrayList<>();
        list.add(runner1);
        list.add(runner2);
        list.add(runner3);

        for (Runner runner: list) {
            System.out.println("Runner level: " + runner);
        }

}
}
