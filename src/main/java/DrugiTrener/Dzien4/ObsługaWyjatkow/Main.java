package DrugiTrener.Dzien4.ObsługaWyjatkow;

public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            s.toLowerCase();

            System.out.println(divide(4, 1));
            System.out.println("This line won't be displayed");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Catch is running");

        }
        System.out.println("Line");
    }
    private static int divide (int a, int b){
        return a/b;
    }
}
