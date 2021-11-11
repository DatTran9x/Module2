package Bai6.CircleAndCylinder;

public class Cylinder extends Circle{
    double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Double getVolume() {
        return this.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", height=" + height +
                '}';
    }
}
