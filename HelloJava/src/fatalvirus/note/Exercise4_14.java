package fatalvirus.note;

public class Exercise4_14 {

	public static void main(String[] args) {

		// # 4 - 14
		// 1~100 answer .
		int answer = (int) (Math.random() * 100 + 1);
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수

		// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner s = new java.util.Scanner(System.in);

		do {
			count++;
			System.out.print("1과 100 사이의 값을 입력하세요 :");
			input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.

			if (input < answer)
				System.out.println("더 큰수를 입력하세요.");
			else if (input > answer)
				System.out.println("더 작은 수를 입력하세요.");
			else
				break;
		} while (true); // 무한반복문
		System.out.printf("시도횟수는 %d번입니다.\n", count);
	}

}
