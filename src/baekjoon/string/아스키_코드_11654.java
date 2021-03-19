package src.baekjoon.string;

import java.util.Scanner;

public class 아스키_코드_11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        System.out.println((byte)data.charAt(0));
    }
}
