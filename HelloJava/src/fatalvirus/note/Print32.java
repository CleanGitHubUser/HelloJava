package fatalvirus.note;

import java.util.Scanner;

public class Print32 {

	public static void main(String[] args) {

		// # 32 - 주민번호 검증하기
		String jumin = "9202271251222";

		// a. 가중치 적용 및 합산
		int sum = 0;
		// sum += (jumin.charAt(0) - 48) * 2;
		// sum += (jumin.charAt(1) - 48) * 3;
		// sum += (jumin.charAt(2) - 48) * 4;
		// sum += (jumin.charAt(3) - 48) * 5;
		// sum += (jumin.charAt(4) - 48) * 6;
		// sum += (jumin.charAt(5) - 48) * 7;
		// sum += (jumin.charAt(6) - 48) * 8;
		// sum += (jumin.charAt(7) - 48) * 9;
		// sum += (jumin.charAt(8) - 48) * 2;
		// sum += (jumin.charAt(9) - 48) * 3;
		// sum += (jumin.charAt(10) - 48) * 4;
		// sum += (jumin.charAt(11) - 48) * 5;

		int jcode = 0;
		for (int i = 0, j = 2; i <= 11; ++i, ++j) {
			if (i == 8)
				j = 2;
			jcode = jumin.charAt(i) - 48;
			sum += jcode * j;
		}

		// 나머지 계산
		// int check = sum % 11;

		// 마지막 자릿수와 비교
		String msg = "주민번호 검증 실패!";

		// if (check > 9) { // 나머지가 2자리수 라면
		// if (check % 10 == jumin.charAt(12) - 48)
		// msg = "주민번호 검증 성공!";
		// } else if (11 - check == jumin.charAt(12) - 48)
		// msg = "주민번호 검증 성공!";

		// 11로 나눈 나머지 구한 후
		// 11에서 이것을 빼고, 맨 마지막 자리 빼냄
		int check = (11 - sum % 11) % 10;

		if (check == jcode)
			msg = "주민번호 검증 성공!";

		System.out.println(msg);

		// # 32
		System.out.print("확인할 주민등록번호를 입력하세요. >");
		Scanner sc = new Scanner(System.in);
		String resiNum = sc.nextLine();
		String multiNum = "234567892345";
		sum = 0;

		for (int i = 0; i < resiNum.length() - 1; ++i) {
			sum += (resiNum.charAt(i) - 48) * (multiNum.charAt(i) - 48);
		}
		int lastNum = resiNum.charAt(resiNum.length() - 1) - 48;

		int confirm = 11 - sum % 11;
		String isOK = "비정상";
		if ((lastNum == confirm) || (lastNum == confirm - 10))
			isOK = "정상";
		System.out.println(isOK);

	}

}
