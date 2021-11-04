package Bai2;

public class Bai6 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count <= 20) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println(number);
            }
            number++;
        }
    }
}
