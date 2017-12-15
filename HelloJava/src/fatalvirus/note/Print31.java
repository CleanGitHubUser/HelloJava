package fatalvirus.note;

import java.util.Scanner;

public class Print31 {

	public static void main(String[] args) {

		// # 31
		Scanner sc = new Scanner(System.in);
		System.out.print("6자리 카드번호를 숫자를 입력하세요. >");
		String card = sc.nextLine();

		// 카드정보 판별
		char ctype = card.charAt(0);
		String ctmsg = "카드정보 없음";

		if (ctype == '3' && card.charAt(1) == '5')
			ctmsg = "JCB 카드";
		else if (ctype == '4')
			ctmsg = "Visa 카드";
		else if (ctype == '5')
			ctmsg = "Master 카드";

		System.out.println(ctmsg);

		// 은행정보 판별
		String bank = "은행정보 없음";
		switch (card) {
		case "356317":
			bank = "NH농협카드";
			break;
		case "356901":
			bank = "신한카드";
			break;
		case "356912":
			bank = "KB국민카드";
			break;
		case "404825":
			bank = "비씨카드";
			break;
		case "438676":
			bank = "신한카드";
			break;
		case "457973":
			bank = "국민은행";
			break;
		case "515594":
			bank = "신한카드";
			break;
		case "524353":
			bank = "외환카드";
			break;
		case "540926":
			bank = "국민은행";
			break;
		}

		System.out.printf("%s %s \n", ctmsg, bank);

		// # 31
		sc = new Scanner(System.in);
		System.out.print("여섯자리 숫자를 입력하세요. >");
		int num = sc.nextInt();
		String ctypem = "카드정보 없음";
		String cinfom = "은행정보 없음";

		if ((num + "").charAt(0) == 3 && (num + "").charAt(1) == 5) {
			ctypem = "JCB카드";

			switch (num) {
			case 356317:
				cinfom = "NH농협카드";
				break;
			case 356901:
				cinfom = "신한카드";
				break;
			case 356912:
				cinfom = "KB국민카드";
				break;
			}
		} else if ((num + "").charAt(0) == 4) {
			ctypem = "비자카드";

			switch (num) {
			case 404825:
				cinfom = "비씨카드";
				break;
			case 438676:
				cinfom = "신한카드";
				break;
			case 457973:
				cinfom = "국민은행";
				break;
			}
		}

		else if ((num + "").charAt(0) == 5) {
			ctypem = "마스터카드, Maestro";

			switch (num) {
			case 515594:
				cinfom = "신한카드";
				break;
			case 524353:
				cinfom = "외환카드";
				break;
			case 540926:
				cinfom = "국민은행";
				break;
			}
		}
		System.out.println(ctypem);
		System.out.println(cinfom);

	}

}
