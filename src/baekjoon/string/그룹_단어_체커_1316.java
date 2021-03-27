package src.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹_단어_체커_1316 {
    public static void main(String[] args) throws IOException {
        int[] alphabet;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        int before = 0;
        int after = 0;
        int count = 0;

        for (int i = 0; i < size; i++) {
            alphabet = new int[26];
            String rawData = bufferedReader.readLine();
            int rawDataLength = rawData.length();

            if (rawDataLength == 1) {
                continue;
            }

            before = rawData.charAt(0);
            for (int j = 1; j < rawDataLength; j++) {
                after = rawData.charAt(j);
                // 앞뒤 문자가 같으면 패스
                if (before == after) {
                    continue;
                    // 앞뒤 문자가 다를 경우
                } else {
                    // 앞 문자가 처음 나왔을 경우
                    if (alphabet[before - 'a'] == 0) {
                        alphabet[before - 'a']++;
                        before = after;
                        // 앞 문자가 이미 나왔을 경우
                    } else {
                        count++;
                        alphabet = new int[26];
                        break;
                    }
                }
            }
            // 마지막 문자 체크
            if (alphabet[after - 'a'] != 0) {
                count++;
            }
        }
        bufferedReader.close();
        System.out.println(size - count);
    }
}
