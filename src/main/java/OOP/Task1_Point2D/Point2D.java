package OOP.Task1_Point2D;

class Point2D {
    private float x;
    private float y;

    public Point2D() {
          x = 0.0f;
          y = 0.0f;
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

    public float[] getXY (){
        return new float[]{x,y};

//      float[][] table = new float[1][1];
//        return table;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x,y);
    }
}
