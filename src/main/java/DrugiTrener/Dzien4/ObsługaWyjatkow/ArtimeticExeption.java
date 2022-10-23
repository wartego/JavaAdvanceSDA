package DrugiTrener.Dzien4.ObsługaWyjatkow;

public class ArtimeticExeption {
    public static void main(String[] args) {
        try{
            System.out.println(divide(4,0));

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("abc");
        }

        System.out.println("Line");

    }
    private static int divide(int a, int b){
        return a/b;
    }
}
