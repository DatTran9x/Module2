package BTVN.CNNV;

public class CongNhan implements TinhLuong {
    int id;
    String name;
    int age;
    String adress;
    int basicSalary;
    int days;
    double salary;
    static int idNumber;

    public CongNhan() {
    }

    public CongNhan(String name, int age, String adress, int basicSalary, int days) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        this.basicSalary = basicSalary;
        this.days = days;
        this.id = ++idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public void tinhLuong() {
        this.salary= this.days*this.basicSalary;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", basicSalary=" + basicSalary +
                ", days=" + days +
                ", slary="+salary+
                '}';
    }
}
