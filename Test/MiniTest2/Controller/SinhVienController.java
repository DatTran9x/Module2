package Test.MiniTest2.Controller;

import Test.MiniTest2.Model.Nguoi;
import Test.MiniTest2.Model.SinhVien;
import Test.MiniTest2.Service.SinhVienService;

import java.util.List;

public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienService();

    public void addSinhVien(SinhVien sinhVien) {
        readFromFile();
        sinhVienService.addSinhVien(sinhVien);
        saveToFile();
    }

    public List<SinhVien> getList() {
        return sinhVienService.getListSV();
    }

    public void readFromFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\DataSV.txt";
        sinhVienService.readFromFile(path);
    }

    public void editSinhVien(String name, SinhVien sinhVien) {
        readFromFile();
        if (name == null) {
            return;
        }
        int index = sinhVienService.findByIndex(name);
        sinhVienService.editSinhVien(index, sinhVien);
        saveToFile();
    }

    public void deleteSinhVien(String name) {
        readFromFile();
        if (name == null) {
            return;
        }
        int index = sinhVienService.findByIndex(name);
        sinhVienService.deleteSinhVien(index);
        saveToFile();
    }

    public void saveToFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\DataSV.txt";
        sinhVienService.saveToFile(path);
    }
}
