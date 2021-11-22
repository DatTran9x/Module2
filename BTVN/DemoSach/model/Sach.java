package BTVN.DemoSach.model;

public class Sach {
    private int id;
    private String name;
    static int idNumber=1;

    public Sach(String name) {
        this.name = name;
        id = idNumber++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Sach.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
