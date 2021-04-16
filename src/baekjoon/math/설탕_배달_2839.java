package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕_배달_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int rawData =  Integer.parseInt(bufferedReader.readLine());
        int _5kgCount = rawData / 5;

        for (int i = _5kgCount; i > 0; i--) {
            if ((rawData - (i * 5)) % 3 == 0) {
                System.out.println(i + ((rawData - (i * 5)) / 3));
                return;
            }
        }

        if (rawData % 3 == 0) {
            System.out.println(rawData / 3);
            return;
        }

        System.out.println(-1);
    }
}
