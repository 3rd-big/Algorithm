package src.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        boolean isPrimeNumber = true;
        int result = 0;

        while (stringTokenizer.hasMoreTokens()) {
            isPrimeNumber = true;
            int number = Integer.parseInt(stringTokenizer.nextToken());
            int range = number / 2;
            for (int i = 2; i <= range; i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber && (number != 1)) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
