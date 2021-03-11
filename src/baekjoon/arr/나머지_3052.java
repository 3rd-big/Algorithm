package src.baekjoon.arr;

import java.util.HashSet;
import java.util.Scanner;

public class 나머지_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            hashSet.add(sc.nextInt() % 42);
        }

        System.out.println(hashSet.size());
    }
}
