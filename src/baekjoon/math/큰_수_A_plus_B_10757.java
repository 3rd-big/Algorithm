package src.baekjoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 큰_수_A_plus_B_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int temp = 0;
        int sum = 0;

        int readCh = 0;
        // 공백 나올때까지 stack1 push
        while ((readCh = bufferedReader.read()) != 32) {
            stack1.push(readCh - '0');
        }

        // Enter 나올때까지 stack2 push
        while ((readCh = bufferedReader.read()) != 10) {
            stack2.push(readCh - '0');
        }

        // NAND -> 두 스택 모두 비었으면 멈춤
        while (!(stack1.empty() && stack2.empty())) {
            sum = 0;
            if (!stack1.empty()) {
                sum += stack1.peek();
                stack1.pop();
            }

            if (!stack2.empty()) {
                sum += stack2.peek();
                stack2.pop();
            }

            sum += temp;

            // 각 자릿수 합이 10 이상이면, 다음 합 계산에 +1 해주고 현재 자릿수 합에는 한자릿수만
            if (sum >= 10) {
                stringBuilder.insert(0, sum - 10);
                temp = 1;
            } else {
                stringBuilder.insert(0, sum);
                temp = 0;
            }
        }

        if (temp == 1) {
            stringBuilder.insert(0, 1);
        }

        System.out.println(stringBuilder.toString());

    }
}
