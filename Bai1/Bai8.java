package Bai1;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số ");
        int num = scanner.nextInt();
        number(num);
    }

    public static void number(int num) {
        switch (num) {
            case 1:
                System.out.print("Một ");
                break;
            case 2:
                System.out.print("Hai ");
                break;
            case 3:
                System.out.print("Ba ");
                break;
            case 4:
                System.out.print("Bốn ");
                break;
            case 5:
                System.out.print("Năm ");
                break;
            case 6:
                System.out.print("Sáu");
                break;
            case 7:
                System.out.print("Bảy ");
                break;
            case 8:
                System.out.print("Tám ");
                break;
            case 9:
                System.out.print("Chín ");
                break;

        }
    }
}
