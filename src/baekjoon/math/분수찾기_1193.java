package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기_1193 {
    static int numerator = 1, denominator = 1, checkNumber = 1;  // numerator: 분자, denominator: 분모
    static boolean flag = false;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());

        while (checkNumber != num) {
            if (numerator == 1) {   // 꼭대기 닿음
                denominator++;
                checkNumber++;
                flag = true;
                if (checkNumber == num) {
                    System.out.println(numerator + "/" + denominator);
                    return;
                }
            }

            if (denominator == 1) { //좌측 닿음
                numerator++;
                checkNumber++;
                flag = false;
                if (checkNumber == num) {
                    System.out.println(numerator + "/" + denominator);
                    return;
                }
            }

            if (flag) {
                leftDown();
            } else {
                rightUp();
            }
        }
        System.out.println(numerator + "/" + denominator);
    }

    static void leftDown () {
        numerator++;
        denominator--;
        checkNumber++;
    }

    static void rightUp () {
        numerator--;
        denominator++;
        checkNumber++;
    }
}
