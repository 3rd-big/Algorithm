package src.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bufferedReader.readLine());
        int N = Integer.parseInt(bufferedReader.readLine());
        boolean isPrimeNumber = false;
        int min = -1;
        int sum = 0;
        int range = 0;

        for (int i = M; i <= N; i++) {
            // 1은 소수가 아니므로 continue
            if (i == 1) {
                continue;
            }
            isPrimeNumber = true;
            // 어떤 수가 소수인지 확인하기 위해선 2부터 해당 수의 절반(소수점 버림) 까지 나눠보면 확인 가능
            range = i / 2;
            for (int j = 2; j <= range; j++) {
                // 해당 조건문이 참이면 이 뒤의 검증은 필요없으므로 break
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                sum += i;
                // 주어진 범위를 낮은숫자부터 검증하므로 min의 초기값(-1) 과 같을 때는 가장 작은 소수이므로 해당 소수값으로 대체
                // 이후 어떤 소수가 들어와도 min 값이 -1일 수는 없음
                if (min == -1) {
                    min = i;
                }
            }
        }

        // min의 초기값(-1) 그대로라면, 주어진 범위에 소수가 없었으므로 문제에서 주어진대로 -1 출력
        if (min == -1) {
            System.out.println(-1);
        } else {
            System.out.println(sum + "\n" + min);
        }
    }
}
