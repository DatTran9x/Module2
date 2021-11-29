package Bai17.saveToFile.TestThu.Menu;

import Bai17.saveToFile.TestThu.SanPham.SanPham;

import java.io.*;
import java.util.*;

public class DieuKhien {
    ArrayList<SanPham> sanPhams = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    {
        SanPham sanPham1 = new SanPham(1, "Giay", "Nike", 12, "Dep va ben");
        SanPham sanPham2 = new SanPham(2, "Ao", "Adidas", 6, "Ao fake");
        SanPham sanPham3 = new SanPham(3, "Quan", "Gucci", 8, "Quan thung dit");
        SanPham sanPham4 = new SanPham(4, "Laptop", "Acer", 25, "Ngon");
        SanPham sanPham5 = new SanPham(5, "Dien thoai", "Galaxy", 18, "Dien thoai cu");
        SanPham sanPham6 = new SanPham(6, "Xe may", "Honda", 30, "Xe deu");
        sanPhams.add(sanPham1);
        sanPhams.add(sanPham2);
        sanPhams.add(sanPham3);
        sanPhams.add(sanPham4);
        sanPhams.add(sanPham5);
        sanPhams.add(sanPham6);
    }

    public void hienThiSanPham() {
        int count = 0;
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham.toString());
            count++;
            if (count % 5 == 0) {
                System.out.println("An enter de tiep tuc!");
                scanner.nextLine();
            }
        }
        System.out.println("1.Them san pham");
        System.out.println("2.Thoat");
        String choice = scanner.nextLine();
        if (Objects.equals(choice, "1")) {
            themSanPham();
        }
        System.out.println("Quay lai Menu!");
    }

    public void themSanPham() {
        try {
            sanPhams.add(taoSanPham());
            System.out.println("Da them san pham");
        } catch (Exception e) {
            System.out.println("Vui long nhap so!");
        }
    }

    private SanPham taoSanPham() {
        System.out.println("Ma san pham");
        String maSanPham1 = scanner.nextLine();
        int maSanPham = Integer.parseInt(maSanPham1);
        System.out.println("Ten san pham");
        String tenSanPham = scanner.nextLine();
        System.out.println("Hang san xuat san pham");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Gia san pham");
        String giaSanPham1 = scanner.nextLine();
        int giaSanPham = Integer.parseInt(giaSanPham1);
        System.out.println("Mo ta san pham");
        String moTaSanPham = scanner.nextLine();
        return new SanPham(maSanPham, tenSanPham, hangSanXuat, giaSanPham, moTaSanPham);
    }

    public void capNhatSanPham() {
        try {
            int index = timSanPham();
            if (index == -1) return;
            sanPhams.set(index, taoSanPham());
            System.out.println("Da cap nhat san pham");
        } catch (Exception e) {
            System.out.println("Vui long nhap so!");
        }
    }

    public int timSanPham() {
        System.out.println("Nhap ma san pham");
        String maSanPham1 = scanner.nextLine();
        int maSanPham = Integer.parseInt(maSanPham1);
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getMaSanPham() == maSanPham) {
                return i;
            }
        }
        System.out.println("Khong tim thay san pham voi ma san pham tren");
        return -1;
    }

    public void xoaSanPham() {
        try {
            int index = timSanPham();
            if (index == -1) return;
            System.out.println("Vui long nhap Y de xac nhan lai");
            String Y = scanner.next();
            if (Objects.equals(Y, "Y")) {
                sanPhams.remove(index);
                System.out.println("Da xoa san pham");
            }
        } catch (Exception e) {
            System.out.println("Vui long nhap so!");
        }
    }

    public void sapXepSanPham() {
        System.out.println("1.Sap xep theo gia tang dan");
        System.out.println("2.Sap xep theo gia giam dan");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                sapXepTangDan();
                break;
            case "2":
                sapXepGiamDan();
                break;
            default:
                System.out.println("Quay ve man hinh chinh");
                scanner.nextLine();
                break;
        }
    }

    public void sapXepTangDan() {
        TangDan tangDan = new TangDan();
        sanPhams.sort(tangDan);
        System.out.println("Danh sach san pham sau khi sap xep lai");
        int count = 0;
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham.toString());
            count++;
            if (count % 5 == 0) {
                scanner.nextLine();
            }
        }
    }

    public void sapXepGiamDan() {
        GiamDan giamDan = new GiamDan();
        sanPhams.sort(giamDan);
        System.out.println("Danh sach san pham sau khi sap xep lai");
        int count = 0;
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham.toString());
            count++;
            if (count % 5 == 0) {
                scanner.nextLine();
            }
        }
    }

    public void timSanPhamDatNhat() {
        int max = 0;
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(max).getGia() < sanPhams.get(i).getGia()) max = i;
        }
        System.out.println(sanPhams.get(max));
    }


    public void luuVaoFile() {
        try {
            FileWriter writer = new FileWriter("C:\\Module2.1\\src\\Bai17\\saveToFile\\TestThu\\Data\\data.csv", false);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (SanPham sp : sanPhams) {
                bufferedWriter.write(sp.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Da luu xong!!");
    }

    public void docTuFile() {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("C:\\Module2.1\\src\\Bai17\\saveToFile\\TestThu\\Data\\data.csv"));

            while ((line = br.readLine()) != null) {
                inSanPham(parseCsvLine(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            Collections.addAll(result, splitData);
        }
        return result;
    }

    private static void inSanPham(List<String> sanpham) {
        System.out.println(
                sanpham.get(0) + sanpham.get(1) + sanpham.get(2) + sanpham.get(3) + sanpham.get(4));
    }
}
