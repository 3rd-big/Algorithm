/*
 * Baekjoon Online Judg 14888
 * https://www.acmicpc.net/problem/14888
 */

package repeat;

import java.util.*;

public class Sequence {
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 입력할 N의 갯수
		int[] numbers = new int[input.nextInt()];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();

		/*
		 * 사칙연산 갯수를 담을 배열 operCount 선언 operCount[0]은 +의 갯수, operCount[1]: -의 갯수,
		 * operCount[2]: *의 갯수 , operCount[3]: /의 갯수
		 */
		int[] operCount = new int[4];
		int count = 0;
		for (int i = 0; i < operCount.length; i++) {
			operCount[i] = input.nextInt();
			// 사칙연산 갯수를 모두 더한 값을 count변수에 대입
			count += operCount[i];
		}
		input.close();

		/*
		 * 사칙연산의 모든 갯수만큼 operList 배열 선언 사칙연산 리스트로 나열 ex) operCount[] = {2, 1, 1, 2}일 경우,
		 * operList[] = {0, 0, 1, 2, 3, 3} 배열값 대입
		 */
		int[] operList = new int[count];
		int index = 0;
		for (int i = 0; i < operCount.length; i++) { // ex) i = 0 ~ 3
			for (int j = 0; j < operCount[i]; j++) { // ex) j = 0 두번, 1한번, 2한번, 3두번
				switch (i) {
				case 0:
					operList[index++] = 0;
					break;
				case 1:
					operList[index++] = 1;
					break;
				case 2:
					operList[index++] = 2;
					break;
				case 3:
					operList[index++] = 3;
					break;
				}
			}
		}
		// arrPrint(operList); // operList 대입값 확인

		permutation(operList, numbers, 0);
		System.out.println(max);
		System.out.println(min);
	}

	/*
	 * 연산 함수 첫번째 매개변수: 연산자 두번째 매개변수: 피연산자
	 */
	public static void calculator(int[] operList, int[] numbers) {
		int result = numbers[0];
		for (int i = 0; i < operList.length; i++) {
			switch (operList[i]) {
			/*
			 * 연산자 갯수 = 피연산자 갯수 - 1 인덱스를 맞추기 위해 i+1 로 표현
			 */
			case 0:
				result += numbers[i + 1];
				break;
			case 1:
				result -= numbers[i + 1];
				break;
			case 2:
				result *= numbers[i + 1];
				break;
			case 3:
				result /= numbers[i + 1];
				break;
			}
		}
		/*
		 * 전역변수 max[min] 에는 int가 가질 수 있는 가장 작은[큰] 값이 있으므로 첫 번째 호출 시 나온 결과값을 대입 이후, 비교연산
		 * 후 참일 경우에만 대입
		 */
		if (result > max)
			max = result;
		if (result < min)
			min = result;
	}

	/*
	 * 순열(permutation) 재귀함수 첫번째 매개변수: 모든 경우의 수 확인 ex) operList[] 연산자리스트의 모든 경우의 수 확인
	 * 두번째 매개변수: 순열 재귀함수에서는 필요 없음. 피연산자(numbers[])를 전역변수로 처리 가능하나 해당 코드는 지역변수로 사용하므로
	 * 매개변수 필요 세번째 매개변수: 모든 경우의 수를 찾을 때 [고정된 수|고정이 필요 한 수] 를 구분 할 위치
	 */
	public static void permutation(int[] operList, int[] numbers, int k) {
		// 모든 수가 고정(끝까지 탐색)되었을 경우, 연산함수(calculator) 호출 후 자신을 부른 permutation으로 리턴
		if (k == operList.length) {
			calculator(operList, numbers);
			// arrPrint(operList);
			return;
		}
		/*
		 * 재귀영역 모든 수가 고정(끝까지 탐색)될 때까지 +1하여 고정위치를 배열의 끝으로 보냄 순차적으로 고정 된 위치를 갖기 위해 함수 호출
		 * 이후 다시 swap하는 과정
		 */
		for (int i = k; i < operList.length; i++) {
			swap(operList, k, i);
			permutation(operList, numbers, k + 1);
			swap(operList, k, i);
		}
	}

//	// 배열 출력
//	public static void arrPrint(int[] arr) {
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//	}

	// 배열의 요소값을 매개변수로 삼아 배열의 값 바꿔줌
	public static void swap(int[] arr, int k, int i) {
		int tmp = arr[k];
		arr[k] = arr[i];
		arr[i] = tmp;
	}
}
