package Bai4;

import java.util.Scanner;

public class Bai2 {
    public static class QuadraticEquation {
        int a;
        int b;
        int c;
        double d;


        public QuadraticEquation(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = (b * b - 4 * a * c);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ax^2+Bx+C=0");
            System.out.println("A is:");
            int a = sc.nextInt();
            System.out.println("B is:");
            int b = sc.nextInt();
            System.out.println("C is:");
            int c = sc.nextInt();
            QuadraticEquation quad = new QuadraticEquation(a, b, c);
            System.out.println("Delta is :" + quad.getDiscriminant());
            if (quad.getDiscriminant() < 0) {
                System.out.println("The equation has no roots");
            } else if (quad.getDiscriminant() == 0) {
                System.out.println(quad.getRoot1());
            } else {
                System.out.println(quad.getRoot1());
                System.out.println(quad.getRoot2());
            }
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public double getDiscriminant() {
            return d;
        }

        public double getRoot1() {
            if (d < 0) {
                return 0;
            } else {
                return (-b + Math.sqrt(d)) / (2 * a);
            }
        }

        public double getRoot2() {
            if (d < 0) {
                return 0;
            } else {
                return (-b - Math.sqrt(d)) / (2 * a);
            }
        }
    }
}
