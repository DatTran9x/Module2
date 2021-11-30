package Test.MiniTest2.Controller;

import Test.MiniTest2.Model.Nguoi;
import Test.MiniTest2.Model.SinhVien;
import Test.MiniTest2.Service.SinhVienService;

import java.util.List;

public class SinhVienController {
    SinhVienService sinhVienService = new SinhVienService();

    public void addSSinhVien(SinhVien sinhVien) {
        readFromFile();
        sinhVienService.addSinhVien(sinhVien);
    }

    public List<SinhVien> getList() {
        return sinhVienService.getListSV();
    }

    public void readFromFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\DataSV.txt";
        sinhVienService.readFromFile(path);
    }

    public void editSinhVien(String name, SinhVien sinhVien) {
        name = sinhVienService.checkName(name);
        if (name == null) {
            return;
        }
        int index = sinhVienService.findByIndex(name);
        sinhVienService.editSinhVien(index, sinhVien);
    }

    public void deleteSinhVien(String name) {
        name = sinhVienService.checkName(name);
        if (name == null) {
            return;
        }
        int index = sinhVienService.findByIndex(name);
        sinhVienService.deleteSinhVien(index);
    }

    public void saveToFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\Data.txt";
        sinhVienService.saveToFile(path);
    }
}
