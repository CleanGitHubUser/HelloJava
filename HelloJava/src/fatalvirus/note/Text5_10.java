package fatalvirus.note;

public class Text5_10 {

	public static void main(String[] args) {

		// # 5 - 10
		int[] numArr = new int[10];

		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));
		}
		System.out.println();

		for (int i = 0; i < numArr.length - 1; i++) {
			boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.

			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1] = temp;
					changed = true; // 자리바꿈이 발생했으니 changed를 true로.
				}
			} // end of for j
			if (!changed)
				break; // 자리바꿈이 없으면 반복문을 벗어난다.

			for (int k = 0; k < numArr.length; k++)
				System.out.print(numArr[k]); // 정렬된 결과를 출력한다.

			System.out.println();
		} // end for i
		// 9174437720
		// 1744377209
		// 1443772079
		// 1434720779
		// 1344207779
		// 1342047779
		// 1320447779
		// 1203447779
		// 1023447779
		// 0123447779

	} // main의 끝
}
