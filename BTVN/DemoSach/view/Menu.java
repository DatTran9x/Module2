package BTVN.DemoSach.view;


import BTVN.DemoSach.Controller.Controller;

import java.util.Scanner;

public class Menu {
    Controller controller = new Controller();
    public void menu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1.Them sach");
            System.out.println("2.Sua sach");
            System.out.println("3.Xoa sach");
            System.out.println("4.Hien thi sach");
            System.out.println("0.Thoat");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addBook();
                    break;
                case 2:
                    controller.editBook();
                    break;
                case 3:
                    controller.deleteBook();
                    break;
                case 4:
                    controller.showBooks();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap lai");
            }
        }
    }
}
