package DrugiTrener.Dzien2.ENUMY;

public class Main {
    public static void main(String[] args) {


//        Car car = new Car("VW", "Passat B5", EngineType.TDI);
//
//        // enum (typ wyliczeniowy) - daje nam dostęp do kilku metod statycznych
//        EngineType[] engineTypes = EngineType.values();
//
//        for (EngineType engineType : engineTypes) {
//            System.out.println(engineType);
//        }
///
        String friday = Weekday.FRIDAY.name(); // tutaj przechodziny z enuma na STRING
        System.out.println(friday);
        System.out.println(Weekday.SUNDAY.ordinal());

        ///


        for (Weekday weekday: Weekday.values()){
            System.out.println(weekday + " znaczy po polsku: " + weekday.getPolishName());
        }
    }
}
