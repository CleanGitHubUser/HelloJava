package fatalvirus.note;

public class Print27 {

	public static void main(String[] args) {

		// # 27
		int sum = 0, number = 0;

		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;

		}
		String fmt = "num : %d, sum : %d \n";
		System.out.printf(fmt, number, sum);
		// num : 14, sum : 105

	}

}
