package Test;

public class NhanVien {
    private int id;
    private String name;
    private String phoneNumber;
    private String adress;
    private static int idnumber;

    public NhanVien(String name, String phoneNumber, String adress) {
        this.id = ++idnumber;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public NhanVien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public static void setIdnumber(int idnumber) {
        NhanVien.idnumber = idnumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", adress='" + adress + '\'' +
                '}';
    }
}

