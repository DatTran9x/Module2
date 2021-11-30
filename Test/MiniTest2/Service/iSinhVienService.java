package Test.MiniTest2.Service;

import Test.MiniTest2.Model.Nguoi;
import Test.MiniTest2.Model.SinhVien;

import java.util.List;

public interface iSinhVienService {
    void readFromFile(String path);
    void saveToFile(String path);
    void addSinhVien(SinhVien sinhVien);
    void editSinhVien(int index,SinhVien sinhVien);
    void deleteSinhVien(int index);
}
