package Bai9.TDD;

public class TriangleClassifier {
    public static String testTDD(int side1, int side2, int side3) {
        if (kiemTraCanhTamGiac(side1, side2, side3)) {
            return "Khong phai tam giac";
        }
        if (kiemTraTamGiac(side1, side2, side3)) {
            return "Khong phai tam giac";
        }
        if (kiemTraTamGiacDeu(side1, side2, side3)) {
            return "Tam giac deu";
        }
        if (kiemTraTamGiacCan(side1, side2, side3)) {
            return "Tam giac can";
        }
        return "Tam giac thuong";
    }

    private static boolean kiemTraCanhTamGiac(int side1, int side2, int side3) {
        return side1 < 1 || side2 < 1 || side3 < 1;
    }

    private static boolean kiemTraTamGiacCan(int side1, int side2, int side3) {
        return side1 == side2 || side2 == side3 || side3 == side1;
    }

    private static boolean kiemTraTamGiacDeu(int side1, int side2, int side3) {
        return side1 == side2 && side1 == side3;
    }

    private static boolean kiemTraTamGiac(int side1, int side2, int side3) {
        return side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2;
    }
}
