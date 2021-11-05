package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println();
            System.out.println(Arrays.toString(arr));
            System.out.println("1.Thêm phần tử");
            System.out.println("0. Thoát");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số bạn muốn thêm vào");
                    int number = input.nextInt();
                    System.out.println("Nhập vị trí bạn muốn thêm vào");
                    int index = input.nextInt();
                    index--;
                    for (int i = 0; i < arr.length; i++) {
                        if (i == index) {
                            System.arraycopy(arr, i, arr, i + 1, arr.length - 1 - i);
                            arr[i] = number;
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("vui lòng chọn lại");
            }
        }
    }
}
