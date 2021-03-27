package src.baekjoon.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의_개수_1152_StringTokenizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
        System.out.println(stringTokenizer.countTokens());
    }
}
