package src.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상수_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String rawData = bufferedReader.readLine();
        String[] strArr = rawData.split(" ");
        char[] num1 = strArr[0].toCharArray();
        char[] num2 = strArr[1].toCharArray();

        for (int i = 2; i > -1; i--) {
            if (num1[i] == num2[i]) {
                continue;
            } else if (num1[i] < num2[i]) {
                System.out.println(Integer.parseInt("" + num2[2] + num2[1] + num2[0]));
                break;
            } else {
                System.out.println(Integer.parseInt("" + num1[2] + num1[1] + num1[0]));
                break;
            }
        }

    }
}
