package fatalvirus.note;

public class Text5_11 {

	public static void main(String[] args) {

		// # 5 - 11
		int[] numArr = new int[10];
		int[] counter = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 0 ~ 9 의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();

		for (int i = 0; i < numArr.length; i++) {
			counter[numArr[i]]++;
		}

		for (int i = 0; i < numArr.length; i++) {
			System.out.println(i + "의 갯수 : " + counter[i]);
		}
		// 4636845197
		// 0의 갯수 : 0
		// 1의 갯수 : 1
		// 2의 갯수 : 0
		// 3의 갯수 : 1
		// 4의 갯수 : 2
		// 5의 갯수 : 1
		// 6의 갯수 : 2
		// 7의 갯수 : 1
		// 8의 갯수 : 1
		// 9의 갯수 : 1
	}

}
