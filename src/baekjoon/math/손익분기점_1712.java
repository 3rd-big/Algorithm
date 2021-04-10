package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 손익분기점_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] rawData = bufferedReader.readLine().split(" ");
        int profit = Integer.parseInt(rawData[2]) - Integer.parseInt(rawData[1]);

        if (profit <= 0) {
            System.out.println(-1);
        } else {
            System.out.println((int)(Integer.parseInt(rawData[0]) / profit) + 1);
        }
    }
}
