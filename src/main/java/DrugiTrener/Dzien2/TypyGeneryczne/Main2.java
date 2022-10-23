package DrugiTrener.Dzien2.TypyGeneryczne;

import DrugiTrener.Dzien2.ENUMY.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Pair<String, Car> pair = new Pair<>("Passat", new Car()); //Car bezparametrowy
        System.out.println(pair.getValue1());
        System.out.println(pair.getValue2());

        Map<String, Car> pairInMap = new HashMap<>();
        pairInMap.put("Passat", new Car());
        System.out.println(new ArrayList<>(pairInMap.keySet()).get(0));
        System.out.println(pairInMap.get(new ArrayList<>(pairInMap.keySet()).get(0)));







        System.out.println("");

        Pair<Double, String> bmiPair = esimateBMI(178,76);
        System.out.println("Twoje BMI wynosi: " + bmiPair.getValue1() + " . " + bmiPair.getValue2());
    }
//        private static String esimateBMI(int height, double weight){
//            double heightInM= (double) height /100;
//            double bmi = weight / (height * height);
//            return bmi> 18.5 && bmi < 24.9 ? " BMI optymalne" : "BMI nieoptymalne";
//        }
private static Pair<Double, String> esimateBMI(int height, double weight){
    double heightInM= (double) height /100;
    double bmi = weight / (heightInM * heightInM);
    return bmi> 18.5 && bmi < 24.9
            ? new Pair<>(bmi, " BMI optymalne")
            : new Pair<>(bmi, "BMI nieoptymalne");
}
    }

