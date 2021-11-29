package Bai18.SimpleThread;

public class Main {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();
        num2.max();
        num1.min();
        num1.run();
        num2.run();
    }
}
