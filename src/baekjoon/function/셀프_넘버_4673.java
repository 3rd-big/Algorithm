package src.baekjoon.function;

public class 셀프_넘버_4673 {

    // 10000개의 int형 배열 선언
    static int[] selfNumber = new int[10000];
    // 처음 시작 숫자 제외
    static int excludeNumber = 0;
    static{
        // 배열의 값에 1 ~ 10000 초기화
        for (int i = 0; i < 10000; i++) {
            selfNumber[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            if (selfNumber[i] != -1) {
                excludeNumber = i + 1;
                recursive(selfNumber[i]);
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (selfNumber[i] != -1) {
                System.out.println(selfNumber[i]);
            }
        }
    }

    static void recursive(int num){
        String rawData = Integer.toString(num);
        int size = rawData.length();
        int notSelfNumber = num;

        for (int i = 0; i < size; i++) {
            notSelfNumber += (rawData.charAt(i) - '0');
        }

        if (notSelfNumber < 10001) {
            recursive(notSelfNumber);
        }
        
        // 처음 시작숫자 제외
        if (excludeNumber == num) {
            return;
        }

        // num 을 제거
        selfNumber[num - 1] = -1;
    }
}
