package ZadaniaWlasneZaawansowane.OOP.Zadanie1Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }


    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        super.getXY();
        float[] tab = new float[3];
        tab[0] = getX();
        tab[1] = getY();
        tab[2] = getZ();
        return tab;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        super.setXY(x,y);
        this.z = z;
    }


    @Override
    public String toString() {
        return   "(" + super.getX() +
                ", " + super.getY() +
                ", " + z +
                ")";
    }
}
