import Bai5.NV;

import java.util.Objects;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int n = 2;
        Object[] arr = new Object[n];
        NV NV1 = new NV("Toan", 18, "Nam");
        NV NV2 = new NV("Tien", 18, "Nam");
        arr[1] = NV2;
        arr[0] = NV1;
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Hiển thị nhân viên");
            System.out.println("2.Thêm nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("0.Thoát");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (Object o : arr) {
                        NV a;
                        a = (NV) o;
                        if (a == null) {
                            System.out.println("Chưa có NV");
                            break;
                        }
                        a.show();
                    }
                    break;
                case 2:
                    n++;
                    System.out.println("Nhập tên NV");
                    String name = sc.next();
                    System.out.println("Nhập tuổi NV");
                    int age = sc.nextInt();
                    System.out.println("Nhập giới tính");
                    String gedner = sc.next();
                    NV Nv = new NV(name, age, gedner);
                    Object[] arr1 = new Object[n];
                    arr1[n - 1] = Nv;
                    System.arraycopy(arr, 0, arr1, 0, arr.length);
                    arr = arr1;
                    break;
                case 3:
                    n--;
                    System.out.println("Nhập tên NV bạn muốn xóa");
                    String deleteName = sc.next();
                    Object[] arr2 = new Object[n];
                    int c = 0;
                    for (Object o : arr) {
                        NV a;
                        a = (NV) o;
                        if (a == null) {
                            break;
                        }
                        String name1 = a.getName();
                        if (!Objects.equals(name1, deleteName)) {
                            arr2[c] = o;
                            c++;
                        }
                    }
                    c = 0;
                    arr = arr2;
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }

}
