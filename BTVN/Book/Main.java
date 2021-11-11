package BTVN.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[2];
        books[0] = new Book(
                "Nhung nguoi khon kho", 1862, "Victor Hugo", "France", 5
        );
        books[1] = new Book("Nha tho duc ba Paris", 1828, "Victor Hugo", "France", 6);
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Insert");
            System.out.println("2.Remove");
            System.out.println("3.Update");
            System.out.println("4.Search");
            System.out.println("5.Sort");
            System.out.println("6.Show");
            System.out.println("7.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    books = Method.add(books);
                    break;
                case 2:
                    books = Method.remove(books);
                    break;
                case 3:
                    Method.update(books);
                    break;
                case 4:
                    Method.search(books);
                    break;
                case 5:
                    Method.sort(books);
                    break;
                case 6:
                    Method.show(books);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("404 not found");
            }
        }
    }
}
