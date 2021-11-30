package Test.MiniTest2.Service;

import Test.MiniTest2.Model.GiaoVien;
import Test.MiniTest2.Model.SinhVien;

public interface iGiaoVienService {
    void readFromFileGiaoVien(String path);
    void saveToFileGiaoVien(String path);
    void addGiaoVien(GiaoVien giaoVien);
    void editGiaoVien(int index,GiaoVien giaoVien);
    void deleteGiaoVien(int index);
}
