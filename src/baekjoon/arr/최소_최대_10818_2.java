package src.baekjoon.arr;

import java.util.Scanner;

/**
 *
 */
public class 최소_최대_10818_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCount = sc.nextInt();
        sc.nextLine();
        int[] numList = new int[numCount];
        sc = new Scanner(sc.nextLine()).useDelimiter(" ");

        for (int i = 0; i < numCount; i++) {
            numList[i] = sc.nextInt();
        }

        int max = numList[0];
        int min = numList[0];

        for (int i = 0; i < numCount; i++) {
            if (numList[i] > max) {
                max = numList[i];
            } else if (numList[i] < min) {
                min = numList[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
