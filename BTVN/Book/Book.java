package BTVN.Book;

public class Book {
    private int id;
    private String name;
    private int createTime;
    private String author;
    private String language;
    private int number;
    public static int idNumber=0;

    public int getId() {
        return id;
    }

    public Book(String name, int createTime, String author, String language, int number) {
        this.name = name;
        this.createTime = createTime;
        this.author = author;
        this.language = language;
        this.number = number;
        this.id = ++idNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", number=" + number +
                '}';
    }
}
