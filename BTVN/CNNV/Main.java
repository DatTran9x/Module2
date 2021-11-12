package BTVN.CNNV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CongNhan[] congNhans = new CongNhan[2];
        congNhans[0] = new CongNhan("Nam", 15, "Ha Noi", 15, 10);
        congNhans[1] = new KiSu("Tu", 16, "Sai gon", 20, 12, 1.5);
        Method.menu(congNhans);
    }
}
