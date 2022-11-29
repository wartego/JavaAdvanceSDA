package ZadaniaWlasneZaawansowane.OOP.Zadanie3Shape;

public class Square extends Rectangle{

public Square(String color, boolean isFilled, double sizeSquare) {
super(color,isFilled, sizeSquare, sizeSquare);

}

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

//    @Override
//    public void setWidth(double width) {
//        super.setWidth(width);
//        super.setLength(width);
//    }

   @Override
    public String toString(){
       return String.format("Square with width = %.2f and length = %.2f which is subclass off %s", getWidth(),getLength() ,super.toString());
   }
}

