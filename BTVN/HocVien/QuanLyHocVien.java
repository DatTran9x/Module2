package BTVN.HocVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLyHocVien implements QuanLy<HocVien> {
    ArrayList<HocVien> hocViens = new ArrayList<>(1);
    static Scanner scanner = new Scanner(System.in);

    public void Menu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Hien thi hoc vien");
            System.out.println("2.Them mot nguoi vao trong danh sach");
            System.out.println("3.Tim vi tri mot nguoi trong danh sach");
            System.out.println("4.Xoa mot nguoi theo ID");
            System.out.println("5.Sua thong tin theo ID");
            System.out.println("6.Sap xep danh sach theo diem");
            System.out.println("7.Tinh tong diem");
            System.out.println("0.Thoat");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    show();
                    break;
                case 2:
                    addLast();
                    break;
                case 3:
                    findByID();
                    break;
                case 4:
                    deleteByID();
                    break;
                case 5:
                    editByID();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    sum();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui long chon lai");
            }
        }
    }

    @Override
    public void show() {
        for (HocVien hocVien : hocViens) {
            System.out.println(hocVien);
        }
    }

    @Override
    public void addLast() {
        HocVien newHV = createHocVien();
        hocViens.add(newHV);
    }

    @Override
    public void findByID() {
        Integer index = getIndex();
        if (index == null) return;
        System.out.println(hocViens.get(index).toString());
    }

    public HocVien createHocVien() {
        System.out.println("Nhap ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = scanner.nextInt();
        System.out.println("Nhap diem");
        int score = scanner.nextInt();
        return new HocVien(name, age, score);
    }


    private Integer getIndex() {
        System.out.println("Nhap ID");
        int id = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < hocViens.size(); i++) {
            if (hocViens.get(i).getId() == id) {
                index = i;
            }
        }
        if (index < 0 || index > hocViens.size()) {
            System.out.println("Khong co gia tri");
            return null;
        }
        return index;
    }

    @Override
    public void deleteByID() {
        Integer index = getIndex();
        if (index == null) return;
        hocViens.remove((int) index);
    }

    @Override
    public void editByID() {
        Integer index = getIndex();
        if (index == null) return;
        HocVien newHV = createHocVien();
        HocVien.setIdNumber(HocVien.getIdNumber()-1);
        newHV.setId(hocViens.get(index).getId());
        hocViens.set(index, newHV);
    }

    @Override
    public void sort() {
        Collections.sort(hocViens, new SoSanhHocVien());
    }

    @Override
    public void sum() {
        int sum = 0;
        for (HocVien hv : hocViens) {
            sum += hv.getScore();
        }
        sum/=hocViens.size();
        System.out.println("Tong diem la: " + sum);
    }

}
