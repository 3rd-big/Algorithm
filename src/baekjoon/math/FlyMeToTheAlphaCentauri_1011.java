package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlyMeToTheAlphaCentauri_1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int testCase = Integer.parseInt(bufferedReader.readLine());

        /**
         * 목표지점에 도착하기 바로 직전의 이동거리는 반드시 1
         * 현재위치가 어떤 곳이든 항상 출발거리는 1
         * 이 두가지 정보에 초점을 맞춰서 양쪽에서 1, 2, 3 .. 씩 두 지점의 거리를 제거하면서 문제풀이 접근
         */
        for (int i = 0; i < testCase; i++) {
            String[] rawData = bufferedReader.readLine().split(" ");

            int distance = Integer.parseInt(rawData[1]) - Integer.parseInt(rawData[0]);
            int count = 0;

            for (int j = 1; j <= Integer.MAX_VALUE; j++) {
                if (distance == 0) {
                    stringBuilder.append(count).append("\n");
                    break;
                }
                if (distance < (j * 2)) {
                    if (distance > j) {
                        count += 2;
                        stringBuilder.append(count).append("\n");
                        break;
                    } else {
                        count += 1;
                        stringBuilder.append(count).append("\n");
                        break;
                    }
                }
                distance -= j * 2;
                count += 2;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
