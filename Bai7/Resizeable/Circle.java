//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Bai7.Resizeable;

public class Circle implements Resizeable {
    private double radius=1;
    private String color;

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

    @Override
    public void resize(double num) {
        num /= 100;
        num++;
        setRadius(getRadius() * num);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                " area="+getArea()+
                '}';
    }
}
