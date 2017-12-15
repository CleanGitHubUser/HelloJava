package fatalvirus.lab;

public class Lab10 {

	public static void main(String[] args) {

		// 교재연습문제 5-1, 5-4, 5-5, 5-10

		// # 5 - 1
		// a
		// int[] arr[];

		// b
		// int[] arr = {1,2,3,};
		// 쉽표를 지우거나 쉼표 뒤에 정수를 입력해야한다.

		// c
		// int[] arr = new int[5];

		// d
		// int[] arr = new int[5] {1,2,3,4,5};
		// new int[5]나 {1,2,3,4,5} 둘 중 하나만 넣어야 한다.

		// e
		// int arr[5];
		// 5를 지워야한다.

		// f
		// int[] arr[] = new int[3][];

		// # 5 - 4
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0;
		int count = 0;
		for (int[] row : arr) {
			for (int col : row) {
				total += col;
				++count;
			}
		}
		average = total / count;
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		// total=325
		// average=16.0

		// # 5 - 5
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;

			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = ballArr[tmp];
		}

		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다
		for (int i = 0; i < 3; ++i)
			ball3[i] = ballArr[i];

		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		// 423

		// # 5 - 10
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = "";

		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (ch >= 48 && ch < 97)
				result += numCode[(int) ch - 48];
			if (ch >= 97 && ch <= 122)
				result += abcCode[(int) ch - 97];
		}

		System.out.println("src:" + src);
		System.out.println("result:" + result);
		// src:abc123
		// result:`~!wer
	}

}
