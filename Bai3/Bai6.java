package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element need delete: ");
        int element = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                for (int j = i; j < (arr.length - 1); j++) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0, c = 0; i < (arr.length - 1); i++, c++) {
            arr1[i] = arr[i];
        }
        System.out.println("New one is : " + Arrays.toString(arr1));
    }
}
