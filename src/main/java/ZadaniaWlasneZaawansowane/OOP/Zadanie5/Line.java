package ZadaniaWlasneZaawansowane.OOP.Zadanie5;


public class Line {
    private Point2D p1;
    private Point2D p2;

    public Line(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(float p1Start,float p1End,float p2Start,float p2End) {
        this.p1 = new Point2D(p1Start,p1End);
        this.p2 = new Point2D(p2Start,p2End);
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }
    public double getLength(){
        double lengthX = Math.abs(p1.getX() - p2.getX());
        double lengthY = Math.abs( p1.getY() - p2.getY());

        return (double)Math.sqrt(Math.pow(lengthX,2) + Math.pow(lengthY,2));
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
