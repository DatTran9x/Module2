package Bai3;

import java.util.Arrays;

public class Bai8 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr1.length * 2];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr3.length - arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));
    }
}
