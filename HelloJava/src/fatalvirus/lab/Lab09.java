package fatalvirus.lab;

import java.util.Scanner;

public class Lab09 {

	public static void main(String[] args) {

		// 교재소스 5-6, 5-10, 5-11, 5-20, 5-21
		// # 5 - 6
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };

		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다.

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		} // end of for

		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		// 최대값 : 100
		// 최소값 : 33

		// # 5 - 10
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로.
				}
			} // end of for j
			if (!changed)
				break; // 자리바꿈이 없으면 반복문을 벗어난다.

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]); // 정렬된 결과를 출력한다.

			System.out.println();
		} // end for i
			// 9174437720
			// 1744377209
			// 1443772079
			// 1434720779
			// 1344207779
			// 1342047779
			// 1320447779
			// 1203447779
			// 1023447779
			// 0123447779

		// # 5 - 11
		numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 0 ~ 9 의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 갯수 : " + counter[i]);
		}
		// 4636845197
		// 0의 갯수 : 0
		// 1의 갯수 : 1
		// 2의 갯수 : 0
		// 3의 갯수 : 1
		// 4의 갯수 : 2
		// 5의 갯수 : 1
		// 6의 갯수 : 2
		// 7의 갯수 : 1
		// 8의 갯수 : 1
		// 9의 갯수 : 1

		// # 5 - 20
		final int SIZE = 10;
		int x = 0, y = 0;

		char[][] board = new char[SIZE][SIZE];
		for (int i = 0; i < SIZE; ++i) {
			for (int j = 0; j < SIZE; ++j) {
				board[i][j] = ' ';
			}
		}
		byte[][] shipBoard = {
				// 1 2 3 4 5 6 7 8 9
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
				{ 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
				{ 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
				{ 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
				{ 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
		};
		// 1행에 행번호를, 1열에 열번호를 저장한다.
		for (int i = 1; i < SIZE; i++)
			board[0][i] = board[i][0] = (char) (i + '0');

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.printf("좌표를 입력하세요. (종료는 00) >");
			String input = scanner.nextLine(); // 화면입력받은 내용을 input에 저장

			if (input.length() == 2) { // 두 글자를 입력한 경우
				x = input.charAt(0) - '0'; // 문자를 숫자로 변환
				y = input.charAt(1) - '0';
				if (x == 0 && y == 0) // x와 y가 모두 0인 경우 종료
					break;
			}
			if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			// shipBoard[x-1][y-1]의 값이 1이면, 'O'을 board[x][y]에 저장한다.
			board[x][y] = shipBoard[x - 1][y - 1] == 1 ? 'O' : 'X';

			// switch (shipBoard[x - 1][y - 1]) {
			// case 1:
			// board[x][y] = 'O';
			// break;
			// case 0:
			// board[x][y] = 'X';
			// break;
			// }

			// 배열 board의 내용을 화면에 출력한다.
			for (int i = 0; i < SIZE; i++) {
				for (int j = 0; j < SIZE; j++) {
					System.out.print(board[i][j]); // board[i]는 1차원 배열
				}
				System.out.println();
			}
			System.out.println();
		}
		// 좌표를 입력하세요. (종료는 00) >33
		// 123456789
		// 1
		// 2
		// 3 X
		// 4
		// 5
		// 6
		// 7
		// 8
		// 9
		//
		// 좌표를 입력하세요. (종료는 00) >00

		// # 5 - 21
		final int SIZE21 = 5;
		x = 0;
		y = 0;
		int num = 0;

		int[][] bingo = new int[SIZE21][SIZE21];
		scanner = new Scanner(System.in);

		// 배열의 모든 요소를 1부터 SIZE21*SIZE21까지의 숫자로 초기화
		for (int i = 0; i < SIZE21; i++)
			for (int j = 0; j < SIZE21; j++)
				bingo[i][j] = i * SIZE21 + j + 1;

		// 배열에 저장된 값을 뒤섞는다.(shuffle)
		for (int i = 0; i < SIZE21; i++) {
			for (int j = 0; j < SIZE21; j++) {
				x = (int) (Math.random() * SIZE21);
				y = (int) (Math.random() * SIZE21);

				// bingo[i][j]와 임의로 선택된 값(bingo[x][y])을 바꾼다.
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}

		do {
			for (int i = 0; i < SIZE21; i++) {
				for (int j = 0; j < SIZE21; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			System.out.println();

			System.out.printf("1~%d의 숫자를 입력하세요. (종료: 0) >", SIZE21 * SIZE21);
			String tmp = scanner.nextLine(); // 화면에서 입력받는 내용을 tmp에 저장
			num = Integer.parseInt(tmp); // 입력받는 문자열(tmp)를 숫자로 변환

			// 입력받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0을 저장
			outer: for (int i = 0; i < SIZE21; i++) {
				for (int j = 0; j < SIZE21; j++) {
					if (bingo[i][j] == num) {
						bingo[i][j] = 0;
						break outer; // 2중 반복문을 벗어난다.
					}
				}
			}
		} while (num != 0);
		// 18 21 11 2 9
		// 16 25 1 5 7
		// 4 24 12 10 3
		// 14 19 8 22 23
		// 17 13 6 15 20
		//
		// 1~25의 숫자를 입력하세요. (종료: 0) >12
		// 18 21 11 2 9
		// 16 25 1 5 7
		// 4 24 0 10 3
		// 14 19 8 22 23
		// 17 13 6 15 20
		//
		// 1~25의 숫자를 입력하세요. (종료: 0) >0

	}

}
