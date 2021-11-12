package Bai7.ColorAble;

import Bai7.Resizeable.Resizeable;
import Bai7.Resizeable.Shape;

public class Square extends Shape implements Colorable {
    private double side=1;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "color="+getColor()+
                " side=" + side +
                " area="+getArea()+
                '}';
    }
}
