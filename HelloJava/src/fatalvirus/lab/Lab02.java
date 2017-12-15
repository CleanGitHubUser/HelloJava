package fatalvirus.lab;

import java.util.Scanner;

public class Lab02 {
	public static void main(String[] args) {
		// #03 ~ #15

		// #03
		/*
		 * int x = 10 int y = 20 int z = 30 int result = 0
		 * 
		 * result = 3 * x; // 3x result = 3 * x + y; // 3x + y result = (x + y) / 7;
		 * result = (3 * x + y) / (z + 2);
		 */
		double x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.print("x값을 입력하세요");
		x = sc.nextDouble();
		System.out.print("y값을 입력하세요");
		y = sc.nextDouble();
		System.out.print("z값을 입력하세요");
		z = sc.nextDouble();
		System.out.printf("3x = %f\n", 3 * x);
		System.out.printf("3x + y = %f\n", 3 * x + y);
		System.out.printf("(x + y) / 7 = %f\n", (x + y) / 7);
		System.out.printf("(3x + y) / (z + 2) = %f\n", (x + y) / (z + 2));

		// #4 : 정수끼리 연산 결과는 언제나 정수!
		System.out.printf("(1 / 3) * 3 = %d \n", (1 / 3) * 3);
		System.out.printf("(1 / 3) * 3 = %f \n", ((double) 1 / 3) * 3);

		// #5
		int quotient, remainder;
		quotient = 7 / 3;
		remainder = 7 % 3;
		System.out.println("7 / 3");
		System.out.printf("quotient = %d\n", quotient);
		System.out.printf("remainder = %d\n", remainder);

		// #6 - 단축 대입 연산자
		int result = 11;
		result /= 2; // r = r / 2;
		System.out.printf("result = 11, result /= 2 -> result = %d\n", result);

		// #7
		double x2 = 2.5;
		double y2 = -1.5;
		int m = 18;
		int n = 4;
		System.out.printf("7 - a. x + n * y - (x + n) * y = %f\n", x2 + n * y2 - (x2 + n) * y2);
		System.out.printf("7 - b. m / n + m %% n = %d\n", m / n + m % n);
		System.out.printf("7 - c. 5 * x - n / 5 = %f\n", 5 * x2 - n / 5);
		System.out.printf("7 - d. 1 - (1 - (1 - (1 - (1 - n)))) = %d\n", 1 - (1 - (1 - (1 - (1 - n)))));

		// #8 - 논리 연산자의 단축평가
		System.out.printf("8 - a. 3 + 4.5 * 2 + 27 / 8 = %f\n", 3 + 4.5 * 2 + 27 / 8);
		System.out.printf("8 - b. true || false && 3 < 4 || !(5 == 7) -> %b\n", true || false && 3 < 4 || !(5 == 7));
		System.out.printf("8 - c. true || (3 < 5 && 6 >= 2) -> %b\n", true || (3 < 5 && 6 >= 2));
		// System.out.println(!true > 'A');
		System.out.printf("8 - e. 7 %% 4 + 3 - 2 / 6 * 'Z' = %d\n", 7 % 4 + 3 - 2 / 6 * 'Z');
		System.out.printf("8 - f. 'D' + 1 + 'M' %% 2 / 3 = %d\n", 'D' + 1 + 'M' % 2 / 3);
		System.out.printf("8 - g. 5.0 / 3 + 3 / 3 = %f\n", 5.0 / 3 + 3 / 3);
		System.out.printf("8 - h. 53 %% 21 < 45 / 18 -> %b\n", 53 % 21 < 45 / 18);
		System.out.printf("8 - i. (4 < 6) || true && false || false && (2 > 3) -> %b\n",
				(4 < 6) || true && false || false && (2 > 3));
		System.out.printf("8 - j. 7 - (3 + 8 * 6 + 3) - ( 2 + 5 * 2) -> %b\n", 7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));

		// #9 - 문자열로 처리
		System.out.println("9 - a. May 13, 1988 fell on day number");
		System.out.printf("9 - b. %d\n",
				((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);
		// 특정일의 요일을 알아내는 수식
		// (Year + (Year / 4) - (Year / 100) + (Year / 400) + (13 * Month + 8) / 5 +
		// Day) % 7;
		System.out.println("9 - c. Check out this line");
		System.out.println("9 - d. //hello there" + '9' + 7);
		System.out.println('H' + 'I' + "is" + 1 + "more example");
		System.out.println('H' + 6.5 + 'I' + "is" + 1 + "more example");
		// System.out.println("Print both of us", "Me too");
		System.out.println("Reverse" + 'I' + 'T');
		System.out.println("No! Here is" + 1 + "more example");

		// j
		// System.out.println ("Here is " + 10 * 10)); // that's 100
		// Here is 100

		// k
		System.out.println("Not x is " + true); // that's true
		// Not x is true

		// l
		// System.out.print();

		// m
		// System.out.println;

		// n
		// System.out.print("How about this one" ++ '?' + 'Huh?');

		// 10

		// a
		System.out.println(true && false && true || true);
		// true

		// b
		System.out.println(true || true && true && false);
		// true

		// c
		System.out.println((true && false) || (true && !false) || (false && !false));
		// true

		// d
		System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);
		// true

		// e
		System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);
		// true

		// 11

		// a
		System.out.printf("%d", 27 / 13 + 4);
		System.out.printf("%f", 27 / 13 + 4.0);
		System.out.printf("%f", 27 / 13.0 + 4);

		// b
		System.out.printf("%f\n", 27 / 13 + 4.0);

		// c
		System.out.printf("%f\n", 42.7 % 3 + 18);

		// d
		// System.out.printf("%b\n", (3 < 4) && 5 / 8);

		// e
		System.out.printf("%f\n", 23 / 5 + 23 / 5.0);

		// f
		System.out.printf("%f\n", 2.0 + 'a');

		// g
		System.out.printf("%d\n", 2 + 'a');

		// h
		System.out.printf("%d\n", 'a' + 'b');

		// i
		System.out.printf("%d\n", 'a' / 'b');

		// j
		// System.out.printf("%d\n", 'a' && ! 'b');

		// k
		System.out.printf("%f\n", (double) 'a' / 'b');

		// 12 - 형변환 : 축소
		int n2 = (int) 3.9;
		System.out.println("n==	" + n2);
		// n2== 3

		// 13
		int n3 = 3;
		n3++;
		System.out.println("n==" + n3);
		n3 = 3;
		System.out.println("n3 == " + n3++);
		// "p == " + p, p = p + 1
		System.out.println("n3 == " + n3);
		n3--;
		System.out.println("n==" + n3);
		// n==4
		// n3 == 3
		// n3 == 4
		// n==3

		// 14
		System.out.println("2 + 2 = " + (2 + 2));
		System.out.println("2 + 2 = " + 2 + 2);
		// 2 + 2 = 4
		// 2 + 2 = 22

		// 15
		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a);
		b = 'c';
		System.out.println(b);
		a = b;
		System.out.println(a);
		// b
		// 98
		// c
		// c

	}

}
