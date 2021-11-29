package Bai17.saveToFile.TestThu.SanPham;

import java.io.Serializable;

public class SanPham implements Serializable {
    private final int maSanPham;
    private final String ten;
    private final String hangSanXuat;
    private final int gia;
    private final String moTa;

    public SanPham(int maSanPham, String ten, String hangSanXuat, int gia, String moTa) {
        this.maSanPham = maSanPham;
        this.ten = ten;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTa = moTa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public int getGia() {
        return gia;
    }

    @Override
    public String toString() {
        return  "MaSanPham=" + maSanPham +
                ", ten='" + ten + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", gia=" + gia +
                ", moTa='" + moTa + '\'';
    }
}
