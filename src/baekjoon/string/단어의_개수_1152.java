package src.baekjoon.string;

import java.util.Scanner;

public class 단어의_개수_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rawData = sc.nextLine();
        String[] stringToken = rawData.split(" ");
        System.out.println(stringToken.length);
    }
}
