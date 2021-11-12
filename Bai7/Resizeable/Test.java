package Bai7.Resizeable;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double number = Math.random()*100;
        Circle circle = new Circle(1);
        Square square = new Square(1);
        Triangle triangle = new Triangle(1,1,1);
        circle.resize(number);
        System.out.println(circle.toString());
        square.resize(number);
        System.out.println(square.toString());
        triangle.resize(number);
        System.out.println(triangle.toString());
    }
}
