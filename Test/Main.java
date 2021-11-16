package Test;

public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanViens = new NhanVien[2];
        nhanViens[0] = new NhanVien("Toan", "097654321", "Quang Ninh");
        nhanViens[1] = new NhanVien("Van", "0976544567", "Binh Duong");
        Controller.Menu(nhanViens);
    }
}
