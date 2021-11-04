package Bai1;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền Đô :");
        int money = scanner.nextInt();
        System.out.println("Giá trị tiền Việt là :" + (money * 23.100));
    }
}
