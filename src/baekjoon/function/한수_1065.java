package src.baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int result = 0;

        for (int i = 1; i <= num; i++) {
            if (hansu(i)) {
                result += 1;
            }
        }
        System.out.println(result);
    }

    static public boolean hansu (int checkNumber) {
        String rawData = Integer.toString(checkNumber);
        char[] chars = rawData.toCharArray();
        int size = chars.length;
        boolean isHansu = true;

        for (int i = 0; i < size - 2; i++) {
            if ((chars[i] - chars[i + 1]) != (chars[i + 1] - chars[i + 2])) {
                isHansu = false;
                break;
            }
        }
        return isHansu;
    }
}
