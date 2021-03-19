package src.baekjoon.string;

import java.util.Scanner;

public class 문자열_반복_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        String[] str = new String[testCase];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < testCase; i++) {
            str[i] = sc.nextLine();
            String[] token = str[i].split(" ");
            for (int j = 0; j < token[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(token[0]); k++) {
                    stringBuilder.append(token[1].charAt(j));
                }
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
