package Test.MiniTest2.View;

import java.util.Scanner;

public class View {
    public void Menu() {
        SinhVienView sinhVienView = new SinhVienView();
        GiaoVienView giaoVienView = new GiaoVienView();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("---MENU CHINH---");
            System.out.println("Vui long chon Menu Quan Ly ban muon vao");
            System.out.println("1.Sinh vien");
            System.out.println("2.Giao vien");
            System.out.println("3.Thoat");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    sinhVienView.Menu();
                    break;
                case "2":
                    giaoVienView.Menu();
                    break;
                case "3":
                    System.exit(3);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }
}
