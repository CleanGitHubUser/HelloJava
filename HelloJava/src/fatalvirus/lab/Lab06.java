package fatalvirus.lab;

public class Lab06 {

	public static void main(String[] args) {
		// 자바정석 연습문제 3-1, 3-2, 3-3, 4-1

		// 3-1
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		// 6
		// true
		// 13
		// 5
		// false
		// 2
		// 5
		// 66
		// B
		// B
		// C

		// 3-2
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기 (바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = (numOfApples / sizeOfBucket + 1); // 모든 사과를 담는데 필요한 바구니의 수

		System.out.println("필요한 바구니의 수 :" + numOfBucket);
		// 필요한 바구니의 수 :13

		// 3-3
		int num = 10;
		System.out.println((num > 0) ? "양수" : (num < 0) ? "음수" : "0");
		// 양수

		// 4-1
		// 1
		// x > 10 && x < 20

		// 2
		// !(ch == ' ' || ch == ' ')

		// 3
		// (ch == 'x' || ch == 'X')

		// 4
		// ch >= '0' && ch <= '9'

		// 5
		// (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')

		// 6
		// (year % 400 = 0) || ((year % 4 = 0) && (year % 100 != 0))

		// 7
		// powerOn == false

		// 8
		// str == "yes"

	}

}
