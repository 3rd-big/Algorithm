package src.baekjoon.string;

import java.util.Scanner;

public class 숫자의_합_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        char[] charArr = sc.nextLine().toCharArray();
        int result = 0;

        for (char numChar : charArr) {
            result += Character.getNumericValue(numChar);
        }

        System.out.println(result);
    }
}
