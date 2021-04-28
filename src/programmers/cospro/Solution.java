package src.programmers.cospro;

public class Solution {
    // 다음과 같이 import를 사용할 수 있습니다.

        public int solution(int[][] garden) {
            // 여기에 코드를 작성해주세요.
            int answer = 0;
            int size = garden.length;


            while (isNotAllOne(garden)) {

                answer += 1;

                for ()
            }



            return answer;
        }

        boolean isNotAllOne(int[][] garden) {
            int flag = 1;
            int size = garden.length;

            for (int[] row : garden) {
                for (int column : row) {
                    flag *= column;
                    if (flag == 0) {
                        return true;
                    }
                }
            }

            return false;
        }

        // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
        public static void main(String[] args) {
            Solution sol = new Solution();
            int[][] garden1 = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
            int ret1 = sol.solution(garden1);

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

            int[][] garden2 = {{1, 1}, {1, 1}};
            int ret2 = sol.solution(garden2);

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

        }

}
