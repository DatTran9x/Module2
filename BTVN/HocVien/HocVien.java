package BTVN.HocVien;

public class HocVien extends Nguoi{
    private int score;
    private int id;
    public static int idNumber;

    public HocVien(String name, int age, int score) {
        super(name, age);
        this.score = score;
        id = ++idNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        HocVien.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                "score=" + score +
                ", id=" + id +
                '}';
    }
}
