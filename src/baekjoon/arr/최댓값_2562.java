package src.baekjoon.arr;

import java.util.Scanner;

public class 최댓값_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 9;
        int[] numList = new int[size];

        for (int i = 0; i < size; i++) {
            numList[i] = sc.nextInt();
        }

        int max = numList[0];
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if (numList[i] > max) {
                max = numList[i];
                maxIndex = i;
            }
        }

        System.out.println(numList[maxIndex] + "\n" + (maxIndex+1));
    }
}
