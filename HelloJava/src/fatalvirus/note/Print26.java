package fatalvirus.note;

import java.util.Scanner;

public class Print26 {

	public static void main(String[] args) {

		// # 26 - 숫자 맞추기
		int num2 = (int) (Math.random() * 100) + 1;

		Scanner sc = new Scanner(System.in);
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
			String title = "숫자 맞추기 프로그램";
			System.out.println(title);

			num1 = 0;
			num2 = 1;
			num2 = (int) (Math.random() * 100 + 1);

			while (num1 != num2) {
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
				} // if
			} // while

		} // while
	} // main
}
