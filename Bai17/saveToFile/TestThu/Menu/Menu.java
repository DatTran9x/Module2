package Bai17.saveToFile.TestThu.Menu;

import java.util.Scanner;

public class Menu {
    public Menu() {
        DieuKhien dieuKhien = new DieuKhien();
        while (true) {
            System.out.println("----MENU---- \n" +
                    "1.Xem danh sach \n" +
                    "2.Them moi \n" +
                    "3.Cap nhat \n" +
                    "4.Xoa \n" +
                    "5.Sap xep \n" +
                    "6.San pham co gia dat nhat \n" +
                    "7.Doc tu file \n" +
                    "8.Ghi vao file \n" +
                    "9.Thoat");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    dieuKhien.hienThiSanPham();
                    break;
                case "2":
                    dieuKhien.themSanPham();
                    break;
                case "3":
                    dieuKhien.capNhatSanPham();
                    break;
                case "4":
                    dieuKhien.xoaSanPham();
                    break;
                case "5":
                    dieuKhien.sapXepSanPham();
                    break;
                case "6":
                    dieuKhien.timSanPhamDatNhat();
                    break;
                case "7":
                    dieuKhien.docTuFile();
                    break;
                case "8":
                    dieuKhien.luuVaoFile();
                    break;
                case "9":
                    System.exit(9);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }
}