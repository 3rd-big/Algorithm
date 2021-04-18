package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ...
 * 4층   1   6   21  56  126 252 ...
 * 3층   1   5   15  35  70  126 ...
 * 2층   1   4   10  20  35  56  ...
 * 1층   1   3   6   10  15  21  ...
 * 0층   1   2   3   4   5   6   ...     12  13  14
 */

public class 부녀회장이_될테야_2775 {
    static int people;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int testCount = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < testCount; i++) {
            int k = Integer.parseInt(bufferedReader.readLine());
            int n = Integer.parseInt(bufferedReader.readLine());

            stringBuilder.append(lowerFloor(k, n)).append("\n");
            people = 0;
        }

        System.out.println(stringBuilder.toString());
    }

   // 바로 아래층으로 이동
   static public int lowerFloor(int k, int n) {
       k -= 1;
       if (k == 1) {
           for (int i = n; i > 0; i--) {
               people += oneLayerSum(i);
           }
           return people;
       }

       // 버퍼 입력값이 3층이상 => lowerFloor 함수에 들어왔으므로 k값은 최소 2이상
       while (k > 1) {
           for (int i = n; i > 0; i--) {
               lowerFloor(k, i);
           }
           return people;
       }

       // 버퍼 입력값이 1층이므로 oneLayerSum 함수값 리턴
       return oneLayerSum(n);
    }

    // 1층 각 호수의 주민들의 수를 구함
    static public int oneLayerSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
