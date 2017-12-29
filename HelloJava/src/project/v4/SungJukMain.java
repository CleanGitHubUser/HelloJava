package project.v4;

import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {

		SungJukVO sj = new SungJukVO();
		SungJukDAOimpl sji = new SungJukDAOimpl();

		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		sb.append("1. 추가").append("2. 조회").append("3. 상세조회").append("4. 수정").append("5. 삭제").append("0. 종료")
				.append("입력 >>");
		String wrongType = "잘못 입력하셨습니다.";
		int tsjno = 0;

		while (true) {

			System.out.print(sb.toString());

			int no = sc.nextInt();

			switch (no) {
			case 1:
				sji.insertSungJuk(sj);
				break;
			case 2:
				sji.selectSungJuk();
				break;
			case 3:
				sji.selectSungJuk(tsjno);
				break;
			case 4:
				sji.updateSungJuk(sj, tsjno);
				break;
			case 5:
				sji.deleteSUngJuk(tsjno);
				break;
			case 0:
				System.exit(0);
			}
			System.out.println(wrongType);
		}
	}

}
