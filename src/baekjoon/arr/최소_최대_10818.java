package src.baekjoon.arr;

import java.util.Arrays;
import java.util.Scanner;

public class 최소_최대_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCount = sc.nextInt();
        sc.nextLine();
        int[] numList = new int[numCount];
        sc = new Scanner(sc.nextLine()).useDelimiter(" ");

        for (int i = 0; i < numCount; i++) {
            numList[i] = sc.nextInt();
        }

        Arrays.sort(numList);

        System.out.println(numList[0] + " " + numList[numCount-1]);

    }
}
