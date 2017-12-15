package fatalvirus.note;

import java.util.Scanner;

public class Print34 {

	public static void main(String[] args) {

		// # 34
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨(F)를 입력하세요. >");
		double f = sc.nextDouble();

		double c = ((100.0 / 180.0) * (f - 32.0));
		System.out.printf("%fF = %fC", f, c);
	}

}
