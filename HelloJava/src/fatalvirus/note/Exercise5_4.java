package fatalvirus.note;

public class Exercise5_4 {

	public static void main(String[] args) {

		// # 5 - 4
		int[][] arr = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0;
		int count = 0;
		for (int[] row : arr) {
			for (int col : row) {
				total += col;
				++count;
			}
		}
		average = total / count;
		System.out.println("total=" + total);
		System.out.println("average=" + average);
		// total=325
		// average=16.0
	}

}
