package Bai5.AccessModifier;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double getArea() {
        return this.radius * this.radius * Math.PI;
    }
}
