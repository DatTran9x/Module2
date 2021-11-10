package Bai6.Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu dai canh thu nhat ");
        double side1 = sc.nextDouble();
        System.out.println("Chieu dai canh thu hai ");
        double side2 = sc.nextDouble();
        System.out.println("Chieu dai canh thu ba ");
        double side3 = sc.nextDouble();
        System.out.println("Mau sac tam giac");
        String color = sc.next();
        Triangle triangle = new Triangle(color,side1,side2,side3);
        System.out.println(triangle.toString());
    }
}
