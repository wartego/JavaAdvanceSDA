package Z1_Point2D;

public class Point2D {
    private float x,y;

    public Point2D() {
          x = 0;
          y = 0;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[][] getXY (float x, float y){
      float[][] table = new float[1][1];
        return table;
    }
}
