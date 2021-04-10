package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이는_올라가고_싶다_2869 {
    static int A, B, V;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] rawData = bufferedReader.readLine().split(" ");
        A = Integer.parseInt(rawData[0]);
        B = Integer.parseInt(rawData[1]);
        V = Integer.parseInt(rawData[2]);

        if (A == V) {
            System.out.println(1);
        } else {
            System.out.println(((int)Math.ceil((double) (V - A) / (A - B)) + 1));
        }
    }
}
