package Bai17.saveToFile.TestThu.Menu;

import Bai17.saveToFile.TestThu.SanPham.SanPham;

import java.util.Comparator;

public class TangDan implements Comparator<SanPham> {
    @Override
    public int compare(SanPham o1, SanPham o2) {
        return Integer.compare(o1.getGia(), o2.getGia());
    }
}
