package DrugiTrener.Dzien1;

public class ColorBox extends Box{
    private String color;

    public ColorBox(int height,
                    int width,
                    int depth,
                    String color){
        super(height,width,depth); // wywolanie kontruktora klasy nadrzednej (dziedziczenie extends)
        this.color = color; // konstuktor tej klasy ColorBox

    }
    @Override
    public String getBoxDescription(){
        return super.getBoxDescription() + " color: " + color; // nadpisanie metody
    }
}
