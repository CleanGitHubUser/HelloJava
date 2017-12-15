package fatalvirus.note;

import java.util.Scanner;

public class Print23 {

	public static void main(String[] args) {

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
		Scanner sc = new Scanner(System.in);
		System.out.print("lotto 숫자 입력 (100 ~ 999) >");
		String lucky = sc.nextLine();

		// 문자 하나씩 추출
		char lucky1 = lucky.charAt(0);
		char lucky2 = lucky.charAt(1);
		char lucky3 = lucky.charAt(2);

		char lotto1 = ("" + lotto).charAt(0);
		char lotto2 = ("" + lotto).charAt(1);
		char lotto3 = ("" + lotto).charAt(2);

		// 비교
		int match = 0;
		// if (lotto1 == lucky1 || lotto1 == lucky2 || lotto1 == lucky3)
		// ++match;
		// if (lotto2 == lucky1 || lotto2 == lucky2 || lotto2 == lucky3)
		// ++match;
		// if (lotto3 == lucky1 || lotto3 == lucky2 || lotto3 == lucky3)
		// ++match;

		String lotto4 = "" + lotto;
		int size = lotto4.length();
		// for(int i = 0; i <= 2; ++i)
		for (int i = 0; i < size; ++i)
			for (int j = 0; j < size; ++j)
				if (lucky.charAt(i) == lotto4.charAt(j))
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
		sc = new Scanner(System.in);
		System.out.print("lotto 숫자 입력 (100 ~ 999, 중복 불가) >");
		lotto = sc.nextInt();

		String again = "다시 입력해 주세요 (100 ~ 999, 중복 불가) >";
		String slotto = "" + lotto;

		boolean issame = true;
		do {
			System.out.print(again);
			lotto = sc.nextInt();
			size = slotto.length();
			for (int i = 0; i < size; ++i) {
				for (int j = 0; j < size; ++j) {
					if (slotto.charAt(i) != slotto.charAt(j) && i != j) {
						issame = false;
					}
				}
			}
		} while (issame || !(lotto >= 100 && lotto <= 999));

		ilucky = (int) (Math.random() * 900) + 100;
		String slucky = "" + ilucky;
		issame = true;
		do {
			ilucky = (int) (Math.random() * 900) + 100;
			slucky = "" + ilucky;
			size = slucky.length();
			for (int i = 0; i < size; ++i) {
				for (int j = 0; j < size; ++j) {
					if (slucky.charAt(i) != slucky.charAt(j) && i != j) {
						issame = false;
					}
				}
			}
		} while (issame);

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
		String fmt1 = "선택한 번호: %d %d %d\n";
		System.out.printf(fmt1, userNum1, userNum2, userNum3);
		String fmt2 = "당첨 번호: %d %d %d\n";
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
	}
}
