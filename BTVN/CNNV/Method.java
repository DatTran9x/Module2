package BTVN.CNNV;

import java.util.Objects;
import java.util.Scanner;

public class Method {
    static Scanner sc = new Scanner(System.in);

    public static void menu(CongNhan[] congNhans) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Them nhan vien");
            System.out.println("2.Tim theo ten");
            System.out.println("3.Xoa theo ten");
            System.out.println("4.Sua theo ten");
            System.out.println("5.Hien thi thong tin trong danh sach");
            System.out.println("6.Sap xep theo ten");
            System.out.println("7.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    congNhans=add(congNhans);
                    break;
                case 2:
                    searchByName(congNhans);
                    break;
                case 3:
                    congNhans = deleteByName(congNhans);
                    break;
                case 4:
                    editByName(congNhans);
                    break;
                case 5:
                    show(congNhans);
                    break;
                case 6:
                    congNhans = sort(congNhans);
                    break;
                case 7:
                    System.exit(7);
                default:
                    System.out.println("404.Not found!");
            }
        }
    }

    public static CongNhan[] add(CongNhan[] congNhans) {
        System.out.println("1.Cong nhan");
        System.out.println("2.Ki su");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                congNhans = addCN(congNhans);
                return congNhans;
            case 2:
                congNhans = addKiSu(congNhans);
                return congNhans;
            default:
                System.out.println("404.Not found!");
                return congNhans;
        }
    }

    public static CongNhan[] addCN(CongNhan[] congNhans) {
        CongNhan[] CNs = new CongNhan[congNhans.length + 1];
        System.arraycopy(congNhans, 0, CNs, 0, congNhans.length);
        CNs[congNhans.length] = createCN();
        return CNs;
    }

    public static CongNhan createCN() {
        System.out.println("Nhap ten cong nhan");
        String name = sc.next();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
        System.out.println("Nhap dia chi");
        String adress = sc.next();
        System.out.println("Nhap luong");
        int salary = sc.nextInt();
        System.out.println("Nhap so ngay");
        int days = sc.nextInt();
        return new CongNhan(name, age, adress, salary, days);
    }

    public static CongNhan[] addKiSu(CongNhan[] congNhans) {
        CongNhan[] CNs = new CongNhan[congNhans.length + 1];
        System.arraycopy(congNhans, 0, CNs, 0, congNhans.length);
        CNs[congNhans.length] = createKiSu();
        return CNs;
    }

    public static KiSu createKiSu() {
        System.out.println("Nhap ten ki su");
        String name = sc.next();
        System.out.println("Nhap tuoi");
        int age = sc.nextInt();
        System.out.println("Nhap dia chi");
        String adress = sc.next();
        System.out.println("Nhap luong");
        int salary = sc.nextInt();
        System.out.println("Nhap so ngay");
        int days = sc.nextInt();
        System.out.println("Nhap he so luong");
        double heSoLuong = sc.nextDouble();
        return new KiSu(name, age, adress, salary, days, heSoLuong);
    }

    public static void searchByName(CongNhan[] congNhans) {
        System.out.println("Nhap ten muon tim");
        String name = sc.next();
        boolean check = true;
        for (CongNhan cn : congNhans) {
            if (Objects.equals(cn.name, name)) {
                cn.tinhLuong();
                System.out.println(cn);
                check = false;
                break;
            }
        }
        if (check) System.out.println("404.Not found!");
    }

    public static CongNhan[] deleteByName(CongNhan[] congNhans) {
        System.out.println("Nhap ten muon xoa");
        String name = sc.next();
        boolean check = true;
        for (CongNhan cn : congNhans) {
            if (Objects.equals(cn.name, name)) {
                check = false;
                break;
            }
        }
        if (check) return congNhans;
        CongNhan[] newCN = new CongNhan[congNhans.length - 1];
        int c = 0;
        for (CongNhan congNhan : congNhans) {
            if (!Objects.equals(congNhan.name, name)) {
                newCN[c] = congNhan;
                c++;
            }
        }
        return newCN;
    }

    public static void editByName(CongNhan[] congNhans) {
        System.out.println("Nhap ten muon chinh");
        String name = sc.next();
        boolean check = true;
        for (CongNhan cn : congNhans) {
            if (Objects.equals(cn.name, name)) {
                if (cn instanceof KiSu) cn = createKiSu();
                else cn = createCN();
                check = false;
            }
        }
        if (check) System.out.println("404.Not found!");
    }

    public static void show(CongNhan[] congNhans) {
        for (CongNhan cn : congNhans) {
            cn.tinhLuong();
            System.out.println(cn);
        }
    }

    public static CongNhan[] sort(CongNhan[] congNhans) {
        for (int i = 0; i < congNhans.length; i++) {
            for (int j = i; j < congNhans.length; j++) {
                if(congNhans[i].name.compareTo(congNhans[j].name)>0){
                    CongNhan temp =congNhans[i];
                    congNhans[i]=congNhans[j];
                    congNhans[j]=temp;
                }
            }
        }
        return congNhans;
    }
}