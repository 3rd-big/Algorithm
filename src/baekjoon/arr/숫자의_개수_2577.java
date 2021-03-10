package src.baekjoon.arr;

import java.util.Scanner;

public class 숫자의_개수_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 3;
        int num = 1;
        int[] arr = new int[10];

        for (int i = 0; i < size; i++) {
            num = num * sc.nextInt();
        }

        while (num > 0) {
            ++(arr[num % 10]);
            num = num / 10;
        }

        for (int temp : arr) {
            System.out.println(temp);
        }

    }
}
