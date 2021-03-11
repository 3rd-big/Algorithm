package src.baekjoon.arr;

import java.util.Scanner;

public class 평균_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjectCount = sc.nextInt();
        sc.nextLine();
        int[] scoreList = new int[subjectCount];
        int sum = 0;

        for (int i = 0; i < subjectCount; i++) {
            scoreList[i] = sc.nextInt();
            sum += scoreList[i];
        }

        int max = 0;
        for (int i = 0; i < subjectCount; i++) {
            if (scoreList[i] > max) {
                max = scoreList[i];
            }
        }

        double average = (double) sum / scoreList.length;
        double newAverage = average * 100 / max;

        System.out.println(newAverage);

    }
}
