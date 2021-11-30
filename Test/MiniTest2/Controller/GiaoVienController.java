package Test.MiniTest2.Controller;

import Test.MiniTest2.Model.GiaoVien;
import Test.MiniTest2.Service.GiaoVienService;

import java.util.List;

public class GiaoVienController {
    GiaoVienService giaoVienService = new GiaoVienService();

    public void addGiaoVien(GiaoVien giaoVien) {
        readFromFile();
        giaoVienService.addGiaoVien(giaoVien);
        saveToFile();
    }

    public List<GiaoVien> getList() {
        return giaoVienService.getListGV();
    }

    public void readFromFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\DataGV.txt";
        giaoVienService.readFromFileGiaoVien(path);
    }

    public void editSinhVien(String name, GiaoVien giaoVien) {
        readFromFile();
        if (name == null) {
            return;
        }
        int index = giaoVienService.findByIndex(name);
        giaoVienService.editGiaoVien(index, giaoVien);
        saveToFile();
    }

    public void deleteSinhVien(String name) {
        readFromFile();
        if (name == null) {
            return;
        }
        int index = giaoVienService.findByIndex(name);
        giaoVienService.deleteGiaoVien(index);
        saveToFile();
    }

    public void saveToFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\DataGV.txt";
        giaoVienService.saveToFileGiaoVien(path);
    }
}
