package Test.MiniTest2.View;

import Test.MiniTest2.Controller.GiaoVienController;
import Test.MiniTest2.Model.GiaoVien;

import java.util.Scanner;

public class GiaoVienView {
    Scanner scanner = new Scanner(System.in);
    GiaoVienController giaoVienController = new GiaoVienController();

    public void Menu() {
        while (true) {
            System.out.println("---MENU---");
            System.out.println("1.Doc tu File va luu vao danh sach");
            System.out.println("2.Them mot nguoi vao danh sach");
            System.out.println("3.Sua mot nguoi trong danh sach");
            System.out.println("4.Xoa mot nguoi khoi danh sach");
            System.out.println("5.Luu danh sach vao File");
            System.out.println("0.Quay ve Menu chinh");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    giaoVienController.readFromFile();
                    showSinhVien();
                    break;
                case "2":
                    giaoVienController.addSSinhVien(createsGiaoVien());
                    break;
                case "3":
                    giaoVienController.editSinhVien(getName(), createsGiaoVien());
                    break;
                case "4":
                    giaoVienController.deleteSinhVien(getName());
                    break;
                case "5":
                    giaoVienController.saveToFile();
                    showSinhVien();
                    break;
                case "0":
                    new View().Menu();
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }

    private void showSinhVien() {
        for (GiaoVien gv : giaoVienController.getList()) {
            System.out.println(gv);
        }
    }


    private String getName() {
        System.out.println("Nhap ten Giao Vien");
        return scanner.nextLine();
    }

    private GiaoVien createsGiaoVien() {
        System.out.println("Nhap ten Giao Vien");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi Giao Vien");
        int age = createTuoi();
        System.out.println("Nhap luong");
        int salary = createLuong();
        return new GiaoVien(name, age, salary);
    }

    private int createTuoi() {
        try {
            String tuoi = scanner.nextLine();
            if (Integer.parseInt(tuoi) < 0 || Integer.parseInt(tuoi) > 100) {
                System.out.println("Vui long nhap lai tuoi");
                createTuoi();
            }
            return Integer.parseInt(tuoi);
        } catch (Exception e) {
            System.out.println("Vui long nhap so");
            return createTuoi();
        }
    }

    private int createLuong() {
        try {
            String luong = scanner.nextLine();
            if (Integer.parseInt(luong) < 0 || Integer.parseInt(luong) > 100) {
                System.out.println("Vui long nhap lai luong");
                createLuong();
            }
            return Integer.parseInt(luong);
        } catch (Exception e) {
            System.out.println("Vui long nhap so");
            return createTuoi();
        }
    }
}
