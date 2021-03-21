package src.baekjoon.string;

import java.util.Scanner;

public class 단어_공부_1157_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rawData = sc.nextLine();
        int size = rawData.length();
        int[] arr = new int[26];
        int max = 1;
        char result = '?';

        for (int i = 0; i < size; i++) {
            if ('A' <= rawData.charAt(i) && rawData.charAt(i) <= 'Z') {
                arr[rawData.charAt(i) - 65]++;
            } else if ('a' <= rawData.charAt(i) && rawData.charAt(i) <= 'z') {
                arr[rawData.charAt(i) - 97]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = (char) (i + 65);
            } else if (arr[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
