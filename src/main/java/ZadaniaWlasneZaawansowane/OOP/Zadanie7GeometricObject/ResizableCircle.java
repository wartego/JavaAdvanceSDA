package ZadaniaWlasneZaawansowane.OOP.Zadanie7GeometricObject;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
     setRadius(getRadius() * (100-percent) / 100);
    }

    @Override
    public String toString() {
        return "ResizableCircle: \n" + getArea() + "\n" + getPerimeter();
    }
}
