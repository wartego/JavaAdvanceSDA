package OOP.Task1_Point2D;

public class PointRun {
    public static void main(String[] args) {
        Point2D _2d = new Point2D(3,4);
        Point3D _3d_a = new Point3D(22,33,44);
        Point2D _3d_b = new Point3D(220,330,440); //Point2D

        System.out.println("2D: " + _2d); // nie trzeba wywolywac .toString() na _2d bo domyslnie sie to robi
        System.out.println("3D: " + _3d_a);
        System.out.println("3D: " + _3d_b);



    }
}
