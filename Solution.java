/*
 * kakao Tech 2020 신입 개발자 블라인드 채용 1차 코딩 테스트 
 * 문제 3
 * https://tech.kakao.com/2019/10/02/kakao-blind-recruitment-2020-round1/  
 */

package array;

public class Solution {
	public static void main(String[] args) {
		int[][] key = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
		int[][] lock = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };

		System.out.println(solution(key, lock));
	}

	public static boolean solution(int[][] key, int[][] lock) {
		boolean answer = true;
		int size = lock.length * 3 - 2; // 최악의 경우인 key와 lock의 크기가 같을때, 다음과 같은 크기의 2차배열 크기 설정
		int quadrant2 = key.length - 1; // lock배열이 tmp배열의 정중앙에 위치하기 위한 lock배열의 2사분면 모서리 위치
		int quadrant1 = lock.length + key.length - 2; // lock배열이 tmp배열의 정중앙에 위치하기 위한 lock배열의 1사분면 모서리 위치
														// 3, 4사분면의 모서리 위치는 1, 2사분면 모서리 위치로 대체(key, lock 모두 M*M, N*N 크기의
														// 정사각형)

		int[][] tmp = new int[size][size];

		// tmp배열 중앙에 lock배열값 대입
		for (int i = quadrant2, a = 0; i <= quadrant1; i++, a++) {
			for (int j = quadrant2, b = 0; j <= quadrant1; j++, b++) {
				tmp[i][j] = lock[a][b];
			}
		}

		// key(열쇠)로 lock(자물쇠) 삽입시도.
		for (int i = 0; i < 4; i++) { // turnRight(key) 함수가 4번 실행 시 원래의 배열로 돌아옴. 4번의 회전 후 열리지 않을 경우 false 반환
			for (int row = 0; row <= quadrant1; row++) { // row는 삽입을 시도할 key의 배열 중 2사분면의 모서리 위치의 행(row)
				for (int column = 0; column <= quadrant1; column++) { // column은 삽입을 시도할 key의 배열 중 2사분면의 모서리 위치의
																		// 열(column)
					if (insertKey(tmp, key, lock, row, column, quadrant2, quadrant1)) { // tmp 배열의 (row,column)위치부터 key
																						// 배열 삽입
						return answer; // 자물쇠 오픈
					}
				}
			}
			turnRight(key); // key배열을 오른쪽 방향으로 90도 회전
		}
		return false; // 자물쇠를 오픈하지 못함
	}

	// key를 삽입 후 lock배열요소가 모두 1일 경우 true 리턴
	public static boolean insertKey(int[][] tmp, int[][] key, int[][] lock, int row, int column, int quadrant2,
			int quadrant1) {
		int[][] imsi = new int[tmp.length][tmp.length]; // 2차원배열 깊은복사를 위한 2차원배열 선언
		int isOpen = 1;

		for (int i = 0; i < tmp.length; i++) { // 2차원배열 깊은복사
			imsi[i] = tmp[i].clone();
		}

		// imsi배열 중앙에 있는 lock영역과 key배열의 요소를 XOR(배타적 논리합)연산. 그 외 lock영역을 벗어난 부분의 값은 신경쓰지
		// 않음.
		for (int i = row, a = 0; i <= quadrant1 && a < key.length; i++, a++) {
			for (int j = column, b = 0; j <= quadrant1 && b < key.length; j++, b++) {
				imsi[i][j] |= key[a][b];
			}
		}

		// lock(자물쇠) 영역의 모든 값을 AND비트연산 (단 한개라도 0을가진 요소가 있을 경우 결과는 0)
		for (int i = quadrant2; i <= quadrant1; i++) {
			for (int j = quadrant2; j <= quadrant1; j++) {
				isOpen &= imsi[i][j];
			}
		}
		if (isOpen == 1) {
			return true; // lock(자물쇠)의 모든 요소가 1일 경우 오픈
		} else {
			return false; // lock(자물쇠)요소 중 단 하나라도 0을 가진 값이 있을 경우 오픈되지 않음
		}
	}

	// 매개변수의 배열을 오른쪽 방향으로 90도 회전
	public static void turnRight(int[][] key) {
		int[][] tmp = new int[key.length][key.length];

		// key의 각각의 배열요소를 tmp배열에 다음의 순서를 통해 재배열
		for (int i = 0, a = 0; i < key.length; i++, a++) {
			for (int j = key.length - 1, b = 0; j >= 0; j--, b++) {
				tmp[a][b] = key[j][i];
			}
		}

		// 회전된 tmp의 배열을 다시 key배열로 복사
		for (int i = 0; i < key.length; i++) {
			key[i] = tmp[i].clone();
		}
	}

	// 배열 출력
	public static void arrPrint(int[][] dataSet) {
		for (int i = 0; i < dataSet.length; i++) {
			for (int j = 0; j < dataSet.length; j++) {
				System.out.print(dataSet[i][j] + " ");
			}
			System.out.println();
		}
	}
}
