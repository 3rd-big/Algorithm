package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 큰_수_A_plus_B_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        char[][] rawData = new char[2][];
        rawData[1] = bufferedReader.readLine().toCharArray();


        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
//            rawData[][] = stringTokenizer.nextToken().toCharArray();
        }
//        System.out.println(result);
    }
}
