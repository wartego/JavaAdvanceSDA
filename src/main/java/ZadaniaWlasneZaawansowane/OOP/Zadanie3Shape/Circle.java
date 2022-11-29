package ZadaniaWlasneZaawansowane.OOP.Zadanie3Shape;

public class Circle extends Shape{
    private int radius;

    public Circle() {
        super();
        radius = 1;
    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
    @Override
    public String toString(){
        return "Circle with radius = " + getRadius() + " which is a subclass off " + super.toString();
    }

}
