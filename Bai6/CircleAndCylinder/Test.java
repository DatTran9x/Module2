package Bai6.CircleAndCylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0D, "Red");
        System.out.println(circle.toString1());
        Cylinder cylinder = new Cylinder(2.0D, "red", 5.0D);
        System.out.println(cylinder.toString1());
    }
}
