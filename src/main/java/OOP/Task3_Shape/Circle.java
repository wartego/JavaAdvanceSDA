package OOP.Task3_Shape;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Circle extends Shape{
    private float radius;

    public Circle(){
        super();
        radius = 1;
    }

    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }
    public static float getArea(float radius){
        return(float) (Math.PI * radius * radius);
    }
    public static float getPerimeter(float radius){
        return(float) Math.PI * radius * 2 ;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius= %d which is a subclass off y", radius);
    }
}
