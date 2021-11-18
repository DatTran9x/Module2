package Bai11.DaoNguocMang;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            stack.push(a);
        }
        int[] arr1 = new int[arr.length];
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            arr1[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr1));
        Stack<Character> stack1 = new Stack<>();
        char[] input = "ABCD".toCharArray();
        for (char c : input) {
            stack1.pushWord(c);
        }
        char[] output = new char[input.length];
        int size1 = stack1.size();
        for (int i = 0; i < size1; i++) {
            output[i] = stack1.pop();
        }
        System.out.println(output);
    }
}
