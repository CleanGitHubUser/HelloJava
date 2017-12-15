package fatalvirus.note;

import java.util.Scanner;

public class Print33 {

	public static void main(String[] args) {

		// # 33
		Scanner sc = new Scanner(System.in);
		System.out.print("크기를 입력하세요. >" + "");
		int size = sc.nextInt();
		int half = 0;
		int rem = 0;
		switch (size % 2) {
		case 0:
			rem = 0;
			half = size / 2;
			break;
		case 1:
			rem = 1;
			half = (size - 1) / 2;
			break;
		}
		char pattern;
		for (int i = 1; i <= half; ++i) {
			for (int j = 1; j <= half + i; ++j) {
				if (j <= half - i + rem)
					pattern = ' ';
				else
					pattern = '+';
				System.out.print(pattern);
			}
			System.out.println();
		}

		if (rem == 1) {
			for (int i = 1; i <= size; ++i)
				System.out.print('+');
			System.out.println();
		}

		for (int i = 1; i <= half; ++i) {
			for (int j = 1; j <= size + 1 - i - rem; ++j) {
				if (j <= i - 1 + rem)
					pattern = ' ';
				else
					pattern = '+';
				System.out.print(pattern);
			}
			System.out.println();
		}

		for (int i = 1; i <= half; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print('+');
			}
			System.out.println();
		}

		for (int i = 1; i <= half + 1; ++i) {
			System.out.print('+');
		}
		System.out.println();

		for (int i = 1; i <= half; ++i) {
			for (int j = 1; j <= half + 1 - i; ++j) {
				System.out.print('+');
			}
			System.out.println();
		}

		for (int i = 1; i <= half; ++i) {
			for (int j = 1; j <= size + 2 * i - 2 + rem; ++j) {
				if (j <= size) {
					pattern = ' ';
				} else {
					pattern = '+';
				}
				System.out.print(pattern);
			}
			System.out.println();
		}

		for (int i = 1; i <= 2 * size; ++i) {
			System.out.print('+');
		}
		System.out.println();

		for (int i = 1; i <= half; ++i) {
			for (int j = 1; j <= 2 * size - 2 * i; ++j) {
				if (j <= size) {
					pattern = ' ';
				} else {
					pattern = '+';
				}
				System.out.print(pattern);
			}
			System.out.println();
		}

	}

}
