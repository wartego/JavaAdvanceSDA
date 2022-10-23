package DrugiTrener.Dzien1.Task20;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(5,15);

        Circle circle = new Circle(10);

        List<Shape> shapes = List.of(r1,r2,circle);

//        double totalArea = 0;
//        for (Shape shape: shapes){
//            totalArea += shape.calculatePerimeter();
//        }
        // linika ponizej jest rownowazna z petla for
        System.out.println("Total are for all shapes: " + shapes.stream().mapToDouble( e -> e.calculateArea()).sum());
    }
}
