package src.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int rawData = Integer.parseInt(bufferedReader.readLine());
        int squareRoot = 2;
        while (true) {
            if (squareRoot * squareRoot > rawData) {
                break;
            }
            squareRoot += 1;
        }

        for (int i = 2; i <= squareRoot; i++) {
            while (rawData % i == 0) {
                stringBuilder.append(i);
                rawData /= i;
            }
        }

    }
}
