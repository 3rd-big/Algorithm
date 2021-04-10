package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int endNumber = 1;
        int depth = 0;
        while (true) {
            endNumber += (depth++ * 6);
            if (num <= endNumber) {
                System.out.println(depth);
                break;
            }
        }
    }
}