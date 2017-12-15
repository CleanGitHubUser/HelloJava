package fatalvirus.lab;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) {

		// 교재 소스 4-26, 4-27
		// 연습문제 4-4, 4-8, 4-13, 4-14, 4-15

		// #4 - 26
		int sum426 = 0;
		int i = 0;

		// i를 1씩 증가시켜서 sum426에 계속 더해나간다.
		while ((sum426 += ++i) <= 100) {
			System.out.printf("%2d = %2d\n", i, sum426);
		}

		// # 4 - 27
		int num427;
		int sum427 = 0;
		boolean flag = true; // while문의 조건식으로 사용될 변수

		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");

		while (flag) { // flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num427 = Integer.parseInt(tmp);

			if (num427 != 0) {
				sum427 += num427; // num427이 0이 아니면, sum427에 더한다.
			} else {
				flag = false; // num427이 0이면, flag의 값을 false로 변경.
			}
		} // while문의 끝

		System.out.println("합계: " + sum427);

		// # 4 - 4
		int i44 = 0, sum44 = 0;
		while (sum44 < 100) {
			++i44;
			if (i44 % 2 == 0)
				sum44 -= i44;
			else
				sum44 += i44;
		}
		System.out.printf("i44 = %d\n", i44);

		// # 4 - 8
		String fmt = "x = %2d, y = %2d\n";
		for (int x = 0; x <= 10; ++x) {
			for (int y = 0; y <= 10; ++y) {
				if (2 * x + 4 * y == 10)
					System.out.printf(fmt, x, y);
			}
		}

		// # 4 - 13
		String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for (int i413 = 0; i413 < value.length(); i413++) {
			if ((value.charAt(i413) >= 0) && (value.charAt(i413) <= 9))
				continue;
			else {
				isNumber = false;
				break;
			}
		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

		// # 4 - 14
		// 1~100 answer .
		int answer = (int) (Math.random() * 100 + 1);
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수

		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);

		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.

			if (input < answer)
				System.out.println("더 큰수를 입력하세요.");
			else if (input > answer)
				System.out.println("더 작은 수를 입력하세요.");
			else
				break;
		} while (true); // 무한반복문
		System.out.printf("시도횟수는 %d번입니다.\n", count);

		// # 4 - 15
		int number = 12321;
		int tmp = number;

		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

		while (tmp != 0) {
			result = result * 10 + (tmp - (tmp / 10) * 10);
			tmp /= 10;
		}

		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");

	}

}
