package Test.MiniTest2.Model;

public class GiaoVien extends Nguoi {
    private int salary;

    public GiaoVien() {
    }

    public GiaoVien(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", salary=" + salary +
                '}';
    }
}
