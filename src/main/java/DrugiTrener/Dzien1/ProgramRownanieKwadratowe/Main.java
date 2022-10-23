package DrugiTrener.Dzien1.ProgramRownanieKwadratowe;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(3,5,1);
       QuadraticEquation.Solution solution =  quadraticEquation.getSolution();
        System.out.println("x1: " + String.format("value %.2f",solution.getX1()));
        System.out.println("x2: " + String.format("value %.2f",solution.getX2()));

    }
}
