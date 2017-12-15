package fatalvirus.note;

import java.util.Scanner;

public class Print35 {

	public static void main(String[] args) {

		// # 35
		System.out.println("잔돈 계산 프로그램");
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력해 주세요. >");
		int change = sc.nextInt();

		int[] bill = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] billc = new int[8];

		for (int i = 0; i < 8; ++i) {
			billc[i] = change / bill[i];
			change = change % bill[i];
			System.out.printf("%5d원: %" + "d개 \n", bill[i], billc[i]);
		}
	}

}
