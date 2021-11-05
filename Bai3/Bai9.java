package Bai3;

public class Bai9 {
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
        int max = 0;
        for (int[] a : arr) {
            for (int b : a) {
                if (max < b) {
                    max = b;
                }
            }
        }
        System.out.println("Max is " + max);
    }
}
