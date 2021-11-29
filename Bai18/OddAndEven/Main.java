package Bai18.OddAndEven;

public class Main {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();
        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        even.start();
    }
}
