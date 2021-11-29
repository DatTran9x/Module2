package Bai15.IllegalTriangleException;

import java.util.Scanner;

public class TriaangleExample {
    public static class TriangleEdgesCheck {
        public void checkTriangleEdges(double a, double b, double c) throws IllegalRightTriangleException {
            if (a + b <= c || a + c <= b || b + c <= a || a < 0 || b < 0 || c < 0) {
                throw new IllegalRightTriangleException("Loi: Tam giac khong hop le!");
            } else {
                System.out.println("Tam giac hop le!");
            }
        }
    }

    static class IllegalRightTriangleException extends Exception {
        String errorMessage;
        public IllegalRightTriangleException(String inErrorMessage) {
            errorMessage = inErrorMessage;
        }

        @Override
        public String getMessage() {
            return errorMessage;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TriangleEdgesCheck check = new TriangleEdgesCheck();

        try {
            System.out.print("Nhap vao canh thu nhat: ");
            int a = sc.nextInt();
            System.out.print("Nhap vao canh thu hai: ");
            int b = sc.nextInt();
            System.out.print("Nhap vao canh thu ba: ");
            int c = sc.nextInt();

            try {
                check.checkTriangleEdges(a, b, c);
            } catch (IllegalRightTriangleException ex) {
                System.out.println(ex.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Sai: khong dung dinh dang!");
        }

        sc.close();
    }
}
