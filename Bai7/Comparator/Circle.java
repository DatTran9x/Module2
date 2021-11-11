//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Bai7.Comparator;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * 3.141592653589793D;
    }

    public double getPerimeter() {
        return this.radius * 2.0D * 3.141592653589793D;
    }

    public String toString1() {
        return "Radius is :" + this.getRadius() + ".Color is :" + this.getColor() + ".Area is :" + this.getArea() + ".Perimeter is :" + this.getPerimeter() + ".";
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
