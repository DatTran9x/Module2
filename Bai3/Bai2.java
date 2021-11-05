package Bai3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String[] students = {"Dat", "Tai", "Lam", "Tu Anh"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your student's name is: ");
        String name = scanner.nextLine();
        boolean status = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the student in the list is " + (i + 1));
                status = false;
                break;
            }
        }
        if (status) {
            System.out.println("404 Not found");
        }
    }
}
