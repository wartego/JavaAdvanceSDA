package DrugiTrener.Dzien4.ObsługaWyjatkow;

public class BMIException {
    public static void main(String[] args) {
        try {
            System.out.println(estimateBMI(180, 500000));
        }catch (IllegalArgumentException e){
            System.out.println("Exception was thrown");
            e.printStackTrace();
        }
        System.out.println("Line");

    }
    private static String estimateBMI(int height, int weight){
        if (height < 0 || weight < 0) {
            throw new IllegalArgumentException("waga ani wzrost nie moga byc mniejsze od 0");
        }
        double h = (double) height / 100;
        double bmi = (weight) / (h*h);

        if(bmi < 10 || bmi > 100){
            throw new InvalidBMIException_CUSTOM(); // swoja klasa z wyjatkiem
        }
        return bmi > 18.9 && bmi < 25 ? "BMI optymalne" : "BMI nieoptymalne";
    }
}
