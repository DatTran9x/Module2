package BTVN.Book;

import java.util.Scanner;

public class Method {
    static Scanner sc = new Scanner(System.in);

    public static Book create() {
        System.out.println("Insert name of book");
        String name = sc.next();
        System.out.println("Insert create time");
        int createTime = sc.nextInt();
        System.out.println("Insert string author's name");
        String author = sc.next();
        System.out.println("Insert language");
        String language = sc.next();
        System.out.println("Insert number of books");
        int number = sc.nextInt();
        return new Book(name, createTime, author, language, number);
    }

    public static Book[] add(Book[] books) {
        Book newBook = create();
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = newBook;
        return newBooks;
    }

    public static Book[] remove(Book[] books) {
        System.out.println("Insert the id of book");
        int id = sc.nextInt();
        id--;
        if (id < books.length && id >= 0) {
            Book[] newBooks = new Book[books.length - 1];
            int c = 0;
            for (int i = 0; i < books.length; i++) {
                if (i != id) {
                    newBooks[c] = books[i];
                    c++;
                }
            }
            return newBooks;
        }
        System.out.println("404 not found");
        return books;
    }

    public static void update(Book[] books) {
        System.out.println("Insert the id of book");
        int id = sc.nextInt();
        id--;
        books[id] = create();
    }

    public static void search(Book[] books) {
        System.out.println("Insert the id of book");
        int id = sc.nextInt();
        id--;
        System.out.println(books[id].toString());
    }

    public static void sort(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            for (int j = i; j < books.length; j++) {
                if (books[i].getId() > books[j].getId()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    public static void show(Book[] books) {
        for (Book a : books) {
            System.out.println(a.toString());
        }
    }
}

