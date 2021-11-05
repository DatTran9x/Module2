package Bai1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight is:");
        double weight = scanner.nextDouble();
        System.out.println("Height is:");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else if (30 <= bmi) {
            System.out.println("Obese");
        }
    }
}
