package Bai5.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = circle.getRadius();
        double Area = circle.getArea();
        System.out.println(radius);
        System.out.println(Area);
    }
}
