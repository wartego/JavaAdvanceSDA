package ZadaniaWlasneZaawansowane.OOP.Zadanie6MovablePoint;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint movablePoint;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.movablePoint = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveLeft() {
        movablePoint.moveLeft();
    }

    @Override
    public void moveRigth() {
        movablePoint.moveRigth();
    }

    @Override
    public void moveUp() {
        movablePoint.moveUp();
    }

    @Override
    public void moveDown() {
        movablePoint.moveDown();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", movablePoint=" + movablePoint +
                '}';
    }
}
