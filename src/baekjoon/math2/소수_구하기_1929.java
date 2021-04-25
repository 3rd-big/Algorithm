package src.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 소수_구하기_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] range = bufferedReader.readLine().split(" ");
        int rangeOfBegin = Integer.parseInt(range[0]);
        int rangeOfEnd = Integer.parseInt(range[1]);
        int size = rangeOfEnd - rangeOfBegin + 1;
        int squareRoot = (int)Math.sqrt(rangeOfEnd);
        List primeNumList = primeNum(squareRoot);
        int[] rawData = new int[size];

        // 초기화
        for (int i = 0; i < size; i++) {
            rawData[i] = i + rangeOfBegin;
        }

        for (Object i : primeNumList) {
            int prime = (int) i;
            int end = rangeOfEnd / prime;
            for (int j = 2; j <= end; j++) {
                if (prime * j >= rangeOfBegin) {
                    rawData[prime * j - rangeOfBegin] = -1;
                }
            }
        }

        for (int n : rawData) {
            if (n != -1) {
                System.out.println(n);
            }
        }

    }

    static List primeNum(int num) {
        List<Integer> array = new ArrayList<Integer>();
        boolean isPrimeNum = true;
        for (int i = 2; i <= num; i++) {
            isPrimeNum = true;
            int half = i / 2;
            for (int j = 2; j <= half; j++) {
                if (i % j == 0) {
                    isPrimeNum = false;
                    break;
                }
            }
            if (isPrimeNum) {
                array.add(i);
            }
        }
        return array;
    }


}


