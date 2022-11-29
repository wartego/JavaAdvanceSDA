package ZadaniaWlasneZaawansowane.OOP.Zadanie6MovablePoint;

public class main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(10,10,5,3);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        System.out.println(movablePoint);
        movablePoint.moveRigth();
        System.out.println(movablePoint);


        System.out.println("");

        Movable movableCircle = new MovableCircle(10,4,6,2,8);
        System.out.println(movableCircle);
        movableCircle.moveRigth();
        System.out.println(movableCircle);
    }
}
