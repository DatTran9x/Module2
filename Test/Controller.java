package Test;

import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);

    public static void Menu(NhanVien[] nhanViens) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Them nhan vien");
            System.out.println("2.Xoa nhan vien");
            System.out.println("3.Hien thi nhan vien");
            System.out.println("4.Sua nhan vien");
            System.out.println("0.Thoat");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    nhanViens = add(nhanViens);
                    break;
                case 2:
                    nhanViens = delete(nhanViens);
                    break;
                case 3:
                    show(nhanViens);
                    break;
                case 4:
                    edit(nhanViens);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("404.Not Found!");
            }
        }
    }

    public static NhanVien[] add(NhanVien[] nhanViens) {
        NhanVien newNV = create();
        NhanVien[] newNhanViens = new NhanVien[nhanViens.length + 1];
        System.arraycopy(nhanViens, 0, newNhanViens, 0, nhanViens.length);
        newNhanViens[nhanViens.length] = newNV;
        return newNhanViens;
    }

    public static NhanVien create() {
        System.out.println("Nhap ten nhan vien");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhap so dien thoai");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhap dia chi");
        String adress = sc.nextLine();
        return new NhanVien(name, phoneNumber, adress);
    }

    public static NhanVien[] delete(NhanVien[] nhanViens) {
        int index = checkID(nhanViens);
        if (index == -1) {
            return nhanViens;
        }
        for (int j = index; j < nhanViens.length - 1; j++) {
            NhanVien temp = nhanViens[index];
            nhanViens[index] = nhanViens[index + 1];
            nhanViens[index + 1] = temp;
        }
        NhanVien[] newNhanViens = new NhanVien[nhanViens.length - 1];
        System.arraycopy(nhanViens, 0, newNhanViens, 0, newNhanViens.length);
        return newNhanViens;
    }

    public static void show(NhanVien[] nhanViens) {
        for (NhanVien nv : nhanViens) {
            System.out.println(nv);
        }
    }

    public static void edit(NhanVien[] nhanViens) {
        int index = checkID(nhanViens);
        if (index != -1) {
            NhanVien newNV = create();
            NhanVien.setIdnumber(newNV.getId() - 1);
            newNV.setId(nhanViens[index].getId());
            nhanViens[index] = newNV;
        }
    }

    public static int checkID(NhanVien[] nhanViens) {
        System.out.println("Nhap ID nhan vien ban muon xoa");
        int ID = sc.nextInt();
        boolean check = true;
        int index = 0;
        for (int i = 0; i < nhanViens.length; i++) {
            if (ID == nhanViens[i].getId()) {
                check = false;
                index = i;
            }
        }
        if (check) {
            System.out.println("Khong tim thay ID");
            return -1;
        } else
            return index;
    }
}
