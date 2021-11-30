package Test.MiniTest2.Model;

import java.io.Serializable;

public class SinhVien extends Nguoi {
    private double averageScore;

    public SinhVien() {
    }

    public SinhVien(double averageScore) {
        this.averageScore = averageScore;
    }

    public SinhVien(String name, int age, double averageScore) {
        super(name, age);
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", averageScore=" + averageScore +
                '}';
    }
}
