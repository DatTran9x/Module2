package Test.MiniTest2.Service;

import Test.MiniTest2.Model.Nguoi;
import Test.MiniTest2.Model.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SinhVienService implements iSinhVienService {
    List<SinhVien> sinhviens = new ArrayList<>();

    @Override
    public void readFromFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            sinhviens = (List<SinhVien>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void saveToFile(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(sinhviens);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addSinhVien(SinhVien sinhVien) {
        sinhviens.add(sinhVien);
    }

    @Override
    public void editSinhVien(int index, SinhVien sinhVien) {
        sinhviens.set(index, sinhVien);
    }

    @Override
    public void deleteSinhVien(int index) {
        sinhviens.remove(index);
    }

    public int findByIndex(String name) {
        for (int i = 0; i < sinhviens.size(); i++) {
            if (Objects.equals(name, sinhviens.get(i).getName()))
                return i;
        }
        return -1;
    }


    public String checkName(String name) {
        for (SinhVien sv : sinhviens) {
            if(sv.getName()==name){
                return name;
            }
        }
        System.out.println("Khong tim thay sinh vien");
        return null;
    }

    public List<SinhVien> getListSV() {
        return sinhviens;
    }
}
