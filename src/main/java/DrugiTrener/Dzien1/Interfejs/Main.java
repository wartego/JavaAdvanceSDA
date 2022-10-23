package DrugiTrener.Dzien1.Interfejs;

public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 15;
//        b+= 10;
//        System.out.println();
        Square squareA = new Square(10);
        Square squareB = squareA;
        squareB.setSideLength(25);
        //to jest referencja
        System.out.println(squareA.getSideLength());
        System.out.println(squareB.getSideLength());
    }
}
