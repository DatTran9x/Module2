package Bai6.PointAndMoveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(2,3);
        System.out.println(point.toString());
        MoveablePoint moveablePoint = new MoveablePoint(1,2,3,4);
        System.out.println(moveablePoint.toString());
    }
}
