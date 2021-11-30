package Test.MiniTest2.View;

import Test.MiniTest2.Controller.SinhVienController;
import Test.MiniTest2.Model.SinhVien;

import java.util.Scanner;

public class SinhVienView {
    Scanner scanner = new Scanner(System.in);
    SinhVienController sinhVienController = new SinhVienController();
    public void Menu() {
        View view = new View();
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
                    sinhVienController.readFromFile();
                    showSinhVien();
                    break;
                case "2":
                    sinhVienController.addSSinhVien(createSinhVien());
                    break;
                case "3":
                    sinhVienController.editSinhVien(getName(),createSinhVien());
                    break;
                case "4":
                    sinhVienController.deleteSinhVien(getName());
                    break;
                case "5":
                    sinhVienController.saveToFile();
                    showSinhVien();
                    break;
                case "0":
                    view.Menu();
                    break;
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }

    private void showSinhVien() {
        for (SinhVien sv:sinhVienController.getList()) {
            System.out.println(sv);
        }
    }


    private String getName() {
            System.out.println("Nhap ten Sinh Vien");
            return scanner.nextLine();
    }

    private SinhVien createSinhVien() {
        System.out.println("Nhap ten Sinh Vien");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi Sinh Vien");
        int age = epTuoi();
        System.out.println("Nhap diem trung binh");
        double averageScore = epDiem();
        return new SinhVien(name,age,averageScore);
    }

    private int epTuoi() {
        try {
            String tuoi = scanner.nextLine();
            return Integer.parseInt(tuoi);
        } catch (Exception e){
            System.out.println("Vui long nhap so");
            return epTuoi();
        }
    }
    private double epDiem() {
        try {
            String tuoi = scanner.nextLine();
            return Integer.parseInt(tuoi);
        } catch (Exception e){
            System.out.println("Vui long nhap so");
            return epDiem();
        }
    }
}
