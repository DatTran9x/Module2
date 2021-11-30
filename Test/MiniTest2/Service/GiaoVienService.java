package Test.MiniTest2.Service;

import Test.MiniTest2.Model.GiaoVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GiaoVienService implements iGiaoVienService {
    List<GiaoVien> giaoViens = new ArrayList<>();

    @Override
    public void readFromFileGiaoVien(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            giaoViens = (List<GiaoVien>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void saveToFileGiaoVien(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(giaoViens);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void addGiaoVien(GiaoVien giaoVien) {
        giaoViens.add(giaoVien);
    }

    @Override
    public void editGiaoVien(int index, GiaoVien giaoVien) {
        giaoViens.set(index, giaoVien);
    }

    @Override
    public void deleteGiaoVien(int index) {
        giaoViens.remove(index);
    }

    public int findByIndex(String name) {
        for (int i = 0; i < giaoViens.size(); i++) {
            if (Objects.equals(name, giaoViens.get(i).getName()))
                return i;
        }
        return -1;
    }


    public String checkName(String name) {
        for (GiaoVien sv : giaoViens) {
            if(sv.getName()==name){
                return name;
            }
        }
        System.out.println("Khong tim thay sinh vien");
        return null;
    }

    public List<GiaoVien> getListGV() {
        return giaoViens;
    }
}
