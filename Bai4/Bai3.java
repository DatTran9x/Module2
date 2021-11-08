package Bai4;


import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        StopWatch count = new StopWatch();
        count.start();
        System.out.println(count.startTime);
        Arrays.sort(arr);
        count.stop();
        System.out.println(count.stopTime);
        System.out.println(count.getElapsedTime());
    }

    public static class StopWatch {
        private long startTime;
        private long stopTime;

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
            this.stopTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {
            return (this.stopTime - this.startTime);
        }
    }
}
