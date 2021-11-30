package Test.MiniTest2.Controller;

import Test.MiniTest2.Model.GiaoVien;
import Test.MiniTest2.Service.GiaoVienService;

import java.util.List;

public class GiaoVienController {
    GiaoVienService giaoVienService = new GiaoVienService();

    public void addSSinhVien(GiaoVien giaoVien) {
        readFromFile();
        giaoVienService.addGiaoVien(giaoVien);
    }

    public List<GiaoVien> getList() {
        return giaoVienService.getListGV();
    }

    public void readFromFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\DataGV.txt";
        giaoVienService.readFromFileGiaoVien(path);
    }

    public void editSinhVien(String name, GiaoVien giaoVien) {
        name = giaoVienService.checkName(name);
        if (name == null) {
            return;
        }
        int index = giaoVienService.findByIndex(name);
        giaoVienService.editGiaoVien(index, giaoVien);
    }

    public void deleteSinhVien(String name) {
        name = giaoVienService.checkName(name);
        if (name == null) {
            return;
        }
        int index = giaoVienService.findByIndex(name);
        giaoVienService.deleteGiaoVien(index);
    }

    public void saveToFile() {
        String path = "C:\\Module2.1\\src\\Test\\MiniTest2\\Data\\DataGV.txt";
        giaoVienService.saveToFileGiaoVien(path);
    }
}
