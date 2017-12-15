package fatalvirus.note;

import java.util.Scanner;

public class Print36 {

	public static void main(String[] args) {

		// # 36
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요. >");
		long sec = sc.nextLong();
		int day = 24 * 60 * 60;
		int[] optime = { 365 * day, 30 * day, 7 * day, day, 60 * 60, 60, 1 };
		String[] sttime = { " %d년 ", " %d달 ", " %d주 ", " %d일 ", " %d시간 ", " %d분 ", " %d" + "초 " };
		long q = 0;
		long r = sec;

		int i = 0;
		while (i < optime.length) {
			q = r / optime[i];
			System.out.printf(sttime[i], q);
			r = r % optime[i];
			++i;
		}
		// 초를 입력하세요. >8979456132167984132
		// 284736686078년 4달 2주 6일 22시간 15분 32초
	}

}
