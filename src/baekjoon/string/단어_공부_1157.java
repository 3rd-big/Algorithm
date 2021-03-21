package src.baekjoon.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 단어_공부_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rawData = new String (sc.nextLine().toUpperCase());
        char[] chars = rawData.toCharArray();
        int size = chars.length;
        Map<Character, Integer> map = new HashMap<>();
        char result = '?';
        int tmp = 0;
        int tmp2 = 0;

        for (int i = 0; i < size; i++) {
            if (map.get(chars[i]) == null) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > tmp) {
                tmp = entry.getValue();
                result = entry.getKey();
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == tmp) {
                ++tmp2;
            }
        }

        if (tmp2 == 1) {
            System.out.println(result);
        } else {
            System.out.println("?");
        }
    }
}
