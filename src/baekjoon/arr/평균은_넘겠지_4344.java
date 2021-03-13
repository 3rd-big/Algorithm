package src.baekjoon.arr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 평균은_넘겠지_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            String inputLine = sc.nextLine();
            String[] tokens = inputLine.split(" ");
            List<Integer> list = new ArrayList<Integer>();
            int average = 0;
            int sum = 0;
            int  aboveAverage = 0;
            double result = 0;

            for (String token : tokens) {
                list.add(Integer.parseInt(token));
            }

            for (int j = 0; j < list.get(0); j++) {
                sum += list.get(j + 1);
            }
            average = sum / list.get(0);

            for (int j = 0; j < list.get(0); j++) {
                if (list.get(j + 1) > average) {
                    ++aboveAverage;
                }
            }
            result = aboveAverage * 100.0 / list.get(0);
            stringBuilder.append(String.format("%.3f", result)).append("%").append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
