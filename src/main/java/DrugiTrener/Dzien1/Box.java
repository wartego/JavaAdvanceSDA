package DrugiTrener.Dzien1;

public class Box {
    protected int height;
    protected int width;
    protected int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    protected String getBoxDescription(){
        return "h: "  + height + ", " + "w: " + width + ", d: " + depth;
    }
}
