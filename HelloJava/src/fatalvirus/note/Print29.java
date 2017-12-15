package fatalvirus.note;

import java.util.Scanner;

public class Print29 {

	public static void main(String[] args) {

		// # 29
		String title = "숫자 맞추기 프로그램";
		System.out.println(title);

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2 = (int) (Math.random() * 100 + 1);

		while (true) {
			String insert = "1 ~ 100 사이의 숫자를 입력하세요.>";
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
				break;
			}
		}
	}

}
