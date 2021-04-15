package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ACM_호텔_10250 {
    static int[] rawDataInteger = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] rawData = bufferedReader.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                rawDataInteger[j] = Integer.parseInt(rawData[j]);
            }

            // 손님수 % 층수 != 0 : 1호, 2호 ... 각 층별로 최단호수를 다 채우고 남는 인원이 있을 경우
            if (rawDataInteger[2] % rawDataInteger[0] != 0) {
                StringBuilder result = new StringBuilder(Integer.toString(rawDataInteger[2] % rawDataInteger[0]));
                // 호수: ((int) (rawDataInteger[2] / rawDataInteger[0]) + 1)
                // 호수가 한자릿 수 일 경우 총 두자리(0 패딩)로 변환
                if (((int) (rawDataInteger[2] / rawDataInteger[0]) + 1) < 10) {
                    result.append("0").append(((int) (rawDataInteger[2] / rawDataInteger[0]) + 1));
                } else {
                    result.append(((int) (rawDataInteger[2] / rawDataInteger[0]) + 1));
                }
                System.out.println(result.toString());
            // 손님수 % 층수 == 0 : 1호, 2호 ... 각 층별로 최단호수를 다 채움
            } else {
                StringBuilder result = new StringBuilder(Integer.toString(rawDataInteger[0]));
                if (rawDataInteger[2] / rawDataInteger[0] < 10) {
                    result.append("0").append(rawDataInteger[2] / rawDataInteger[0]);
                } else {
                    result.append(rawDataInteger[2] / rawDataInteger[0]);
                }
                System.out.println(result.toString());
            }
        }
    }
}
