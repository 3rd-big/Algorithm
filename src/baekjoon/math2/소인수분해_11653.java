package src.baekjoon.math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @소인수분해
 *  - 1보다 큰 자연수를 소인수(소수인 인수)들만의 곱으로 나타내는 것
 *  - 합성수를 소수의 곱으로 나타내는 방법
 *  => 모든 양의정수는 소수들의 곱으로 표현됨
 */

/**
 * >> 문제 접근방법 <<
 * 1. 어떤 수라도 2부터 나누면서 시작해야함 -> 그럼 언제까지 1씩 증가하면서 나누지?
 * ## 어릴적 풀었던 수학문제 중 동일한 길이의 줄로 만들 수 있는 최대의 넓이를 구하는
 *    문제에서 원을 제외한 사각형이란 조건이라면, 정사각형이 제일 넓다고 배웠던게 갑자기 생각남
 * 2. 일단 제곱근까지 설정
 * 3. 입력받은 값을 2(피연산자)부터 계속 나누면서 나머지가 0일 경우
 *    1) 해당 피연산자를 저장
 *    2) 입력받은 값은 피연산자로 나눈 값 대입
 * 4. 그럼 2, 3, 4, ... 제곱근까지 계속 프로그램이 돌아가면 비효율아닌가?
 *    ex) 18 입력 시 2, 3 까지만 결과가 나오는데 4까지 갈 필요가 없음
 *    -> 입력받은 값을 피연산자로 계속 나눈 결과가 현재 피연산자보다 작을때 break
 * 5. 항상 생각지도 못한 예외가 있는법
 *    1) 입력받은 값의 제곱근보다 작은 소수와, 제곱근보다 큰 소수의 곱으로 이루어진 양의정수는?
 *    2) 작성한 프로그램이 끝났을 때 남아있는 입력받은 값이 제곱근보다 큰 경우라면 -> 해당 수도 소수이므로 출력
 */

public class 소인수분해_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int rawData = Integer.parseInt(bufferedReader.readLine());
        int squareRoot = 2; // 기본 제곱근 2 할당
        while (true) {
            if (squareRoot * squareRoot > rawData) {
                break;
            }
            squareRoot += 1;
        }

        for (int i = 2; i <= squareRoot; i++) {
            while (rawData % i == 0) {
                stringBuilder.append(i).append("\n");
                rawData /= i;
            }
            if (rawData < i) {
                break;
            }
        }

        if (rawData > squareRoot) {
            stringBuilder.append(rawData);
        }

        System.out.println(stringBuilder.toString());
    }
}
