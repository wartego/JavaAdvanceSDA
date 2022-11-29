package ZadaniaWlasneZaawansowane.OOP.Zadanie7GeometricObject;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());


        ResizableCircle resizableCircle = new ResizableCircle(4);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());

        resizableCircle.resize(1);
        System.out.println(resizableCircle);
    }
}
