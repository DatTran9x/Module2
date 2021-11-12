package BTVN.CNNV;

public class KiSu extends CongNhan implements TinhLuong{
    double HeSoLuong;

    public KiSu() {
    }

    public KiSu(String name, int age, String adress, int basicSalary, int days, double heSoLuong) {
        super(name, age, adress, basicSalary, days);
        HeSoLuong = heSoLuong;
    }

    @Override
    public void tinhLuong(){
        this.salary= this.basicSalary*this.days*this.HeSoLuong;
    }

    @Override
    public String toString() {
        return "KiSu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", adress='" + adress + '\'' +
                ", basicSalary=" + basicSalary +
                ", days=" + days +
                ", HeSoLuong=" + HeSoLuong +
                ", Salary="+salary+
                '}';
    }
}
