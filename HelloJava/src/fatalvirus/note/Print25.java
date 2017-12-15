package fatalvirus.note;

import java.io.IOException;
import java.util.Scanner;

public class Print25 {

	public static void main(String[] args) throws IOException {

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
		String title = "소문자 -> 대문자 변환 프로그램\n";
		System.out.println(title);

		Scanner sc = new Scanner(System.in);
		String insert = "알파벳 소문자를 입력하세요. >";
		System.out.print(insert);
		int small = System.in.read();

		System.out.println((char) (small - 32));

	}

}
