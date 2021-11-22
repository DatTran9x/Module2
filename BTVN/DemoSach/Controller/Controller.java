package BTVN.DemoSach.Controller;

import BTVN.DemoSach.model.Sach;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Sach> books = new ArrayList<>();

    public void addBook() {
        books.add(createBook());
    }

    public Sach createBook() {
        System.out.println("Nhap ten sach");
        scanner.nextLine();
        String name = scanner.nextLine();
        return new Sach(name);
    }

    public void deleteBook() {
        int index = searchByID();
        if (index == -1) return;
        books.remove(index);
    }

    public int searchByID() {
        System.out.println("Nhap ID sach");
        int id = scanner.nextInt();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) return i;
        }
        System.out.println("Khong tim thay sach");
        return -1;
    }

    public void editBook() {
        int index = searchByID();
        if (index == -1) return;
        int id = books.get(index).getId();
        books.set(index, createBook());
        books.get(index).setId(id);
        Sach.setIdNumber(Sach.getIdNumber()-1);
    }

    public void showBooks() {
        for (Sach book : books) {
            System.out.println(book);
        }
    }
}
