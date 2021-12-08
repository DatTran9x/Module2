package Test.TestThucHanh.Service;

import Bai17.saveToFile.TestThu.SanPham.SanPham;
import Test.TestThucHanh.Model.Student;

import java.util.Comparator;

public class Ascending implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAvgScore(), o2.getAvgScore());
    }
}
