package ZadaniaWlasneZaawansowane.OOP.Zadanie3ShapeAbstract.Zadanie3Shape;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(){
       super();
        width = 1;
        length = 1;
    }
    public Rectangle(String color, boolean isFilled, double width, double length){
        super(color, isFilled);
        this.width = width;
        this.length = length;
  }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return 2 * width + 2 * length;
    }

    @Override
    public String toString(){
        return "Rectangle with width = " + getWidth() + " and length = " + getLength() + " which is a subclass off " + super.toString();
    }


}
