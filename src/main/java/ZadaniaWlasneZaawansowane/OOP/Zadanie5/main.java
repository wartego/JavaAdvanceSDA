package ZadaniaWlasneZaawansowane.OOP.Zadanie5;

public class main {
    public static void main(String[] args) {


        //Point2D obiekt = new Point2D(3,4);
        Line obiekt1 = new Line(5, 3, 7, 4);
        System.out.println(String.format("Dlugosc linii to: %.3f ", obiekt1.getLength()));

        System.out.println(obiekt1);

    }
}