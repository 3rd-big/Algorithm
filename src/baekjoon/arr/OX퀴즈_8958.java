package src.baekjoon.arr;

import java.util.Scanner;

public class OX퀴즈_8958 {
    static int result;
    static StringBuilder stringBuilder = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            result = 0;
            String quizAnswer = sc.nextLine();
            String[] oString = quizAnswer.split("X");

            for (String hit : oString) {
                result += score(hit);
            }
            stringBuilder.append(result).append("\n");
        }
        System.out.println(stringBuilder.toString());
    }

    static int score(String hit){
        int hitCount = hit.length();
        return hitCount * (1 + hitCount) / 2;
    }
}
