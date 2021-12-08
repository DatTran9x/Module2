package Test.TestThucHanh.Service;

import Bai17.saveToFile.TestThu.SanPham.SanPham;
import Test.TestThucHanh.Model.Student;

import java.util.Comparator;

public class Descending implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getAvgScore(), o1.getAvgScore());
    }
}
