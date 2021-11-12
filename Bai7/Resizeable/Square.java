package Bai7.Resizeable;

public class Square extends Shape implements Resizeable {
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
    public void resize(double num) {
        num /=100;
        num++;
        setSide(getSide()*num);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " area="+getArea()+
                '}';
    }
}
