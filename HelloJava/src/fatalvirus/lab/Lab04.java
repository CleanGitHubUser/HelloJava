package fatalvirus.lab;

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {

		// 프린트 문제 # 16 ~ # 20

		// # 16 - if 문
		// a
		int na = 1;
		int ka = 2;
		int ra = na; // ra = 1
		if (ka < na) // ka > na
			ra = ka;
		System.out.printf("na = %d, ka = %d, ra = %d \n", na, ka, ra);
		// na = 1, ka = 2, ra = 1

		// b
		int nb = 1;
		int kb = 2;
		int rb;
		if (nb < kb) // nb < kb
			rb = kb; // rb = 2
		else
			rb = kb + nb;
		System.out.printf("nb = %d, kb = %d, rb = %d \n", nb, kb, rb);
		// nb = 1, kb = 2, rb = 2

		// c
		int nc = 1;
		int kc = 2;
		int rc = kc; // rc = 2
		if (rc < kc) // 2 = rc = kc = 2
			nc = rc;
		else
			kc = nc; // kc = 1
		System.out.printf("nc = %d, kc = %d, rc = %d \n", nc, kc, rc);
		// nc = 1, kc = 1, rc = 2

		// d
		int nd = 1;
		int kd = 2;
		int rd = 3;
		if (rd < nd + kd) // rd = 3 = 1 + 2 = md + kd
			rd = 2 * nd;
		else
			kd = 2; // kd = 2
		System.out.printf("nd = %d, kd = %d, rd = %d \n", nd, kd, rd);
		// nd = 1, kd = 2, rd = 3

		// # 17
		// a
		// if (x && y == 0) {x = 1; y = 1}; // x == 0 && y == 0
		// 조건문에서 x 부분의 참 거짓을 판단할 수 없어 &&의 값이 나오지 않는다.

		// b
		// if ( 1 <= x <= 10) // x >= 1 && x <= 10
		// System.out.println(x);

		// # 18

		// a
		int number;
		number = 30;
		if (number % 2 == 0)
			System.out.println(number + " is even. "); // "는 짝수."
		System.out.println(number + " is odd."); // "는 홀수."
		// 30 is even.
		// 30 is odd.

		number = 35;
		if (number % 2 == 0)
			System.out.println(number + " is even.");
		System.out.println(number + " is odd.");
		// 30 is odd.

		// b
		number = 30;
		if (number % 2 == 0)
			System.out.println(number + " is even.");
		else
			System.out.println(number + " is odd.");
		// 30 is even.

		number = 35;
		if (number % 2 == 0)
			System.out.println(number + " is even.");
		else
			System.out.println(number + " is odd.");
		// 35 is odd.

		// # 19
		// a
		int x, y, z;
		x = 3;
		y = 2;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);

		// b
		x = 3;
		y = 4;

		if (x > 2) {
			if (y > 2) {
				z = x + y; // 3 + 4
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);
		// z is 7

		// c
		x = 2;
		y = 2;

		if (x > 2) {
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
		} else
			System.out.println("x is " + x);
		// x is 2

		// # 20
		// (a)
		int a = 3;
		if (a++ == 3)
			System.out.println("Three");
		else
			System.out.println("Four");
		// Three

		// (b)
		a = 3;
		if (++a == 3)
			System.out.println("Three");
		else
			System.out.println("Four");
		// Four

		// (c)
		a = 3;
		a = a++; // 수식에 사용
		if (a == 3)
			System.out.println("Three");
		else
			System.out.println("Four");
		// Three

		a = 3;
		++a; // a++;
		if (a == 3)
			System.out.println("Three");
		else
			System.out.println("Four");

		// # 21
		// 결혼여부 isMarried = "Y", "N"
		// 결혼여부 isMarried = true, false
		// 결혼여부 isMarried = 1, 0
		Scanner sc = new Scanner(System.in);
		System.out.print("결혼 여부를 입력하세요. (미혼 : 0, 기혼 : 1)>");
		int isMarried = sc.nextInt();
		System.out.print("연봉을 입력하세요. (단위 : 만)>");
		int salary = sc.nextInt();
		int tax = 0;

		if (isMarried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		} else if (isMarried == 1) {
			if (salary < 6000)
				tax = (int) (salary * 0.1);
			else
				tax = (int) (salary * 0.25);
		}
		System.out.println(tax + "만 원");
	}

}
