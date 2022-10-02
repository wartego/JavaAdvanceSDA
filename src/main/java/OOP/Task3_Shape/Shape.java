package OOP.Task3_Shape;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Shape {
    private String color;
    private boolean isFilled;

    public Shape(){
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    public String toString() {
//        if (isFilled){
//       return  String.format("Shape with color of %s and filled", color);
//    }
//        return String.format("Shape with color of %s and not filled", color);
//

        return "Shape with color of " + color + " and " + (isFilled ? "" : "not ") + "filled";

}
}
