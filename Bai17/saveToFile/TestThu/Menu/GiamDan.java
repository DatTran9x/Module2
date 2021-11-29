package Bai17.saveToFile.TestThu.Menu;

import Bai17.saveToFile.TestThu.SanPham.SanPham;

import java.util.Comparator;

public class GiamDan implements Comparator<SanPham> {
    @Override
    public int compare(SanPham o1, SanPham o2) {
        return Integer.compare(o2.getGia(), o1.getGia());
    }
}
