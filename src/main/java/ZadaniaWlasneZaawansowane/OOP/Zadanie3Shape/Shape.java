package ZadaniaWlasneZaawansowane.OOP.Zadanie3Shape;

public class Shape {
    private String color;
    private boolean isFilled;
    public Shape(){
        color = "unknown";
        isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
public String messageifFilled(){
        if(isFilled){
            return "filled";
        } else{
            return "notFilled";
        }
}
    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + messageifFilled();

    }
}
