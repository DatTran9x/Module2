package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        //        int[][] matrix = new int[10][10];
//        java.util.Scanner input = new Scanner(System.in);
//        System.out.println("Enter " + matrix.length + " rows and " +
//                matrix[0].length + " columns: ");
//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = input.nextInt();
//            }
//        }

        int[][] arr = {
                {0, 983, 787, 714, 1375, 967, 1087},
                {983, 0, 214, 1102, 1763, 1723, 1842},
                {787, 214, 0, 888, 1549, 1548, 1627},
                {714, 1102, 888, 0, 661, 781, 810},
                {1375, 1763, 1549, 661, 0, 1426, 1187},
                {967, 1723, 1548, 781, 1426, 0, 239},
                {1087, 1842, 1627, 810, 1187, 239, 0},
        };
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("Where do you want to sum?");
        Scanner input = new Scanner(System.in);
        int index = input.nextInt();
        int result = 0;
        for (int[] a : arr) {
            for (int i = 0; i < a.length; i++) {
                if (i == index) {
                    result += a[i];
                }
            }
        }
        System.out.println("Result is " + result);
    }
}
