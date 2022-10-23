package DrugiTrener.Dzien1.Task20;

public class Circle extends Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea(){
        return (float) (Math.PI*2*radius);
    }
    @Override
    public double calculatePerimeter(){
        return (float) (Math.PI*2*radius);
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
