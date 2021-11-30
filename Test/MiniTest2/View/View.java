package Test.MiniTest2.View;

import java.util.Scanner;

public class View {
    public void Menu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---MENU QUAN LY---");
            System.out.println("1.Sinh vien");
            System.out.println("2.Giao vien");
            System.out.println("3.Thoat");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    new SinhVienView().Menu();
                    break;
                case "2":
                    new GiaoVienView().Menu();
                    break;
                case "3":
                    System.exit(3);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }
}
