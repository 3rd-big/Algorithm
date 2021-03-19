package src.baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class 단어_공부_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rawData = new String[] {sc.nextLine().toUpperCase()};
        Arrays.sort(rawData);
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : rawData) {
            stringBuilder.append(str);
        }

        System.out.println(stringBuilder.toString());

    }
}
