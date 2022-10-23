package DrugiTrener.Dzien1;

public class Main2 {
    public static void main(String[] args) {
        Box box = new Box(100,150,50);
        System.out.println(box.getBoxDescription());

        ColorBox colorBox = new ColorBox(200,100,80,"red");
        System.out.println(colorBox.getBoxDescription());
    }
}
