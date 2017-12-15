package fatalvirus.note;

import java.util.Scanner;

public class Print24 {

	public static void main(String[] args) {

		// # 24
		String title = "구구단 프로그램\n";
		System.out.println(title);

		String inserNum = "숫자를 입력하세요. (1 ~ 9) >";
		Scanner sc = new Scanner(System.in);
		System.out.print(inserNum);

		int num = sc.nextInt(); // 숫자 이외의 것을 입력하면 오류 발생 -> 어떻게 해결?

		// String error = "잘못 입력하셨습니다!!";
		// do {
		// System.out.println(error);
		// System.out.println("");
		// System.out.print(inserNum);
		// num = sc.nextInt();
		// System.out.println("");
		// } while (!((num > 0) && (num < 10))); // 홀수를 넣었을 때 잘못 입력하셨습니다 출력 -> 왜?

		String fmt1 = "구구단 %d단\n";
		String fmt2 = "%d x %d = %d\n";
		System.out.printf(fmt1, num);
		for (int i = 1; i <= 9; ++i)
			System.out.printf(fmt2, num, i, num * i);

	}

}
