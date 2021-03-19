package src.baekjoon.string;

import java.util.Arrays;
import java.util.Scanner;

public class 알파벳_찾기_10809 {
    public static void main(String[] args) {
        int[] result = new int[26];
        Arrays.fill(result, -1);
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int size = chars.length;

        for (int i = 0; i < size; i++) {
            if ((result[chars[i] - 'a']) == -1) {
                result[chars[i] - 'a'] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
