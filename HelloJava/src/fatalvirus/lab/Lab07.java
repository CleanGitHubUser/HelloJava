package fatalvirus.lab;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) throws IOException {

		// (23), 25, (26), 27, 28, (29), 30

		// # 22 - 윤년 여부 확인
		// 현재 연도가 400으로 나눠 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만
		// 100으로는 나눠 떨어지지 않음
		GregorianCalendar gc = new GregorianCalendar();
		// int year = 2000;

		String welcome = "윤년을 확인할 연도를 입력하세요.>";
		String fmt1 = "%d년은 윤년입니다.\n";
		String fmt2 = "%d년은 윤년이 아닙입니다.\n";

		Scanner sc = new Scanner(System.in);
		System.out.print(welcome);
		int year = sc.nextInt();

		if (gc.isLeapYear(year))
			System.out.printf(fmt1, year);
		else
			System.out.printf(fmt2, year);

		//
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.printf(fmt1, year);
		else
			System.out.printf(fmt2, year);

		// # 23
		// 특정범위를 포함하는 난수 생성
		// 정수난수값 % ((마지막값 - 시작값) + 1) + 시작값
		// 복권 숫자 범위 : 100 - 999
		// lotto : 657, lucky : 452 = 1개 일치
		// lotto : 657, lucky : 524 = 1개 일치
		// lotto : 657, lucky : 123 = 0개 일치
		// lotto : 657, lucky : 726 = 2개 일치
		// lotto : 656, lucky : 626 = 1/2개 일치 ??!!

		int rand = (int) (Math.random() * 100000);
		int lotto = rand % ((999 - 100) + 1) + 100;
		sc = new Scanner(System.in);
		System.out.print("lotto 숫자 입력 (100 ~ 999) >");
		String lucky = sc.nextLine();

		char lucky1 = lucky.charAt(0);
		char lucky2 = lucky.charAt(1);
		char lucky3 = lucky.charAt(2);

		char lotto1 = ("" + lotto).charAt(0);
		char lotto2 = ("" + lotto).charAt(1);
		char lotto3 = ("" + lotto).charAt(2);

		// 비교
		int match = 0;
		if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3)
			++match;
		if (lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3)
			++match;
		if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3)
			++match;

		String msg = "꽝이군요! 다음 기회에!";
		switch (match) {
		case 3:
			System.out.println("모두 일치! 상금 1백만원!");
			break;
		case 2:
			System.out.println("2개 일치! 상금 1만원!");
			break;
		case 1:
			System.out.println("1개 일치! 상금 1천원!");
			break;
		}
		System.out.println(msg);

		int ilucky;

		System.out.print("lotto 숫자 입력 (100 ~ 999) >");
		lotto = sc.nextInt();
		while (!(lotto >= 100 && lotto <= 999)) {
			System.out.print("다시 입력해 주세요 (100 ~ 999) >");
			lotto = sc.nextInt();
		}

		ilucky = (int) (Math.random() * 900) + 100;
		String slotto = "" + lotto;
		String slucky = "" + ilucky;

		int count = 0;
		for (int i = 0; i <= 2; ++i) {
			for (int j = 0; j <= 2; ++j) {
				if (slotto.charAt(i) == slucky.charAt(j))
					++count;
			}
		}

		System.out.printf("입력 변호: %d\n", lotto);
		System.out.printf("당첨 변호: %d\n", ilucky);

		switch (count) {
		case 3:
			System.out.println("상금 1백만");
			break;
		case 2:
			System.out.println("상금 1만");
			break;
		case 1:
			System.out.println("상금 1천");
			break;
		default:
			System.out.println("꽝");
			break;
		}

		// # 23
		String title = "복권 프로그램\n";
		title += "서로 다른 1 ~ 45 사이의 숫자를 세 개 골라 주세요\n";
		title += "세 개 모두 일치 -> 상금 1백만 지급\n";
		title += "두 개 일치 -> 상금 1만 지급\n";
		title += "한 개 일치 -> 상금 1천 지\n";
		System.out.println(title);
		sc = new Scanner(System.in);

		// userNum1 입력
		String insert1 = "숫자를 입력하세요.(1 ~ 45)>";
		System.out.print(insert1);
		int userNum1 = sc.nextInt();
		String anotherInsert = "다른 숫자를 입력하세요.(1 ~ 45)>";
		while (!((userNum1 >= 1) && (userNum1 <= 45))) {
			System.out.print(anotherInsert);
			userNum1 = sc.nextInt();
		}

		// userNum2 입력
		String insert2 = "숫자를 하나 더 입력하세요.(1 ~ 45)>";
		System.out.print(insert2);
		int userNum2 = sc.nextInt();

		while ((!((userNum2 >= 1) && (userNum2 <= 45))) || (userNum2 == userNum1)) {
			System.out.print(anotherInsert);
			userNum2 = sc.nextInt();
		}

		// userNum3 입력
		String insert3 = "마지막 숫자를 입력하세요.(1 ~ 45)>";
		System.out.print(insert3);
		int userNum3 = sc.nextInt();
		while ((!((userNum3 >= 1) && (userNum3 <= 45))) || (userNum3 == userNum1) || (userNum3 == userNum2)) {
			System.out.print(anotherInsert);
			userNum3 = sc.nextInt();
		}

		// 당첨 번호 생성
		int luckyNum1;
		int luckyNum2;
		int luckyNum3;
		do {
			luckyNum1 = (int) (Math.random() * 45) + 1;
			luckyNum2 = (int) (Math.random() * 45) + 1;
			luckyNum3 = (int) (Math.random() * 45) + 1;
		} while ((luckyNum2 == luckyNum1) || (luckyNum3 == luckyNum2) || (luckyNum3 == luckyNum1));

		count = 0;

		// 일치하는 숫자 갯수 확인
		if ((userNum1 == luckyNum1) || (userNum1 == luckyNum2) || (userNum1 == luckyNum3))
			++count;
		if ((userNum2 == luckyNum1) || (userNum2 == luckyNum2) || (userNum2 == luckyNum3))
			++count;
		if ((userNum3 == luckyNum1) || (userNum3 == luckyNum2) || (userNum3 == luckyNum3))
			++count;

		// 선택한 번호와 당첨 번호 표시
		fmt1 = "선택한 번호: %d %d %d\n";
		System.out.printf(fmt1, userNum1, userNum2, userNum3);
		fmt2 = "당첨 번호: %d %d %d\n";
		System.out.printf(fmt2, luckyNum1, luckyNum2, luckyNum3);

		String match3 = "상금 1백만 지급";
		String match2 = "상금 1만 지급";
		String match1 = "상금 1천 지급";
		String match0 = "꽝";

		// 결과 표시
		switch (count) {
		case 3:
			System.out.println(match3);
			break;
		case 2:
			System.out.println(match2);
			break;
		case 1:
			System.out.println(match1);
			break;
		default:
			System.out.println(match0);
			break;
		}

		// # 24
		String fmt242 = "%2d x %2d = %3d\n";
		String welcome24 = "출력할 구구단의 단을 입력하세요 (1 - 19) >";
		Scanner sc24 = new Scanner(System.in);
		System.out.print(welcome24);

		int dan = sc24.nextInt(); // 숫자 이외의 것을 입력하면 오류 발생 -> 어떻게 해결?

		// String error = "잘못 입력하셨습니다!!";
		// do {
		// System.out.println(error);
		// System.out.println("");
		// System.out.print(inserNum);
		// num = sc.nextInt();
		// System.out.println("");
		// } while (!((num > 0) && (num < 10))); // 홀수를 넣었을 때 잘못 입력하셨습니다 출력 -> 왜?

		String fmt241 = "구구단 %d단\n";
		System.out.printf(fmt241, dan);
		for (int i = 1, j = dan; i <= 19; ++i) {
			System.out.printf(fmt242, j, i, j * i);
		}

		System.out.printf(fmt241, dan);
		String fmt243 = "%2d x %2d = %3d \t";
		for (int i = 1, j = dan; i <= 9; ++i) {
			System.out.printf(fmt243, j, i, j * i);
		}

		// # 25 - 문자와 숫자 변환
		// 소문자 a : 97, 대문자 A : 65
		System.out.println("소문자 알파벳을 대문자로 바꿔드립니다!");
		System.out.print("소문자 알파벳을 하나 입력하세요");
		int ch = System.in.read();
		// 오류가 발생할 수 있음
		// 오류가 발생하면 main method에 떠넘긴다.

		// 소문자(a: 97, z:122) 이외의 문자가 입력되면
		// 경고메세지 출력
		// if (ch <= 97 && ch >= 122)
		if (!(ch >= 97 && ch <= 122))
			System.out.println("잘못 입력하셨습니다!");
		else {
			// 소문자를 대문자로 변환하기 위해
			// 입력한 문자에서 32만큼 빼고 처리
			ch = ch - 32;

			System.out.println((char) ch);
		}

		// # 25
		title = "소문자 -> 대문자 변환 프로그램\n";
		System.out.println(title);

		sc = new Scanner(System.in);
		String insert = "알파벳 소문자를 입력하세요. >";
		System.out.print(insert);
		int small = System.in.read();

		System.out.println((char) (small - 32));

		// # 26 - 숫자 맞추기
		int num2 = (int) (Math.random() * 100) + 1;

		sc = new Scanner(System.in);
		// 키보드로부터 데이터를 입력받을 준비를 함
		while (true) {
			int num1 = sc.nextInt(); // 정수 입력받음

			if (num1 > num2)
				System.out.println("추측한 숫자가 큽니다.");
			else if (num1 < num2)
				System.out.println("추측한 숫자가 작습니다.");
			else if (num1 == num2) {
				System.out.println("빙고! 숫자를 맞췄습니다.");
				break;
			}

			// # 26
			title = "숫자 맞추기 프로그램";
			System.out.println(title);

			num1 = 0;
			num2 = 1;
			num2 = (int) (Math.random() * 100 + 1);

			while (num1 != num2) {
				insert = "1 ~ 100 사이의 숫자를 입력하세요.>";
				System.out.print(insert);
				num1 = sc.nextInt();

				if (num1 > num2) {
					String bigger = "추측한 숫자가 큽니다.";
					System.out.println(bigger);
				} else if (num1 < num2) {
					String smaller = "추측한 숫자가 작습니다.";
					System.err.println(smaller);
				} else {
					String same = "빙고! 숫자를 맞췄습니다.";
					System.out.println(same);
				} // if
			} // while

		} // while

		// # 27
		int sum = 0, number = 0;

		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;

		}
		String fmt = "num : %d, sum : %d \n";
		System.out.printf(fmt, number, sum);
		// num : 14, sum : 105

		// # 28
		sum = 0;
		number = 0;
		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
		}
		System.out.printf(fmt, number, sum);
		// num : 20, sum : 189

		// # 30 - 구구단 차트
		fmt = "           Mutiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";
		fmt += "1 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "2 |    2   4   6   8  10  12  14  16  18 \n";
		fmt += "3 |    3   6   9  12  15  18  21  24  27 \n";
		fmt += "4 |    4   8  12  16  20  24  28  32  36 \n";
		fmt += "6 |    6  12  18  24  30  36  42  48  54 \n";
		fmt += "7 |    7  14  21  28  35  42  49  56  63 \n";
		fmt += "8 |    8  16  24  32  40  48  56  64  72 \n";
		fmt += "9 |    9  18  27  36  45  54  63  72  81 \n\n";

		System.out.printf(fmt);

		fmt = "           Mutiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";

		System.out.printf(fmt);
		for (int i = 1; i <= 9; ++i) {
			fmt = "%d |  %3d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
			System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
		}

		fmt = "           Mutiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";
		System.out.printf(fmt);
		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d |  %3d", i, i);
			for (int j = 2; j <= 9; ++j) {
				System.out.printf("  %2d", i * j);
			}
			System.out.println();

		}

		// # 30
		System.out.println("           Multiplication Table");
		int i, j, k = 1;
		System.out.print("      ");
		fmt = "%2d  ";
		for (i = 1; i <= 9; ++i) {
			System.out.printf(fmt, i);
		}
		System.out.println("");
		while (k <= 40) {
			System.out.print("-");
			++k;
		}
		System.out.println("");
		for (i = 1; i <= 9; ++i) {
			System.out.printf("%d |   ", i);
			for (j = 1; j <= 9; ++j) {
				System.out.printf(fmt, i * j);
			}
			System.out.println("");
		}

	}

}
