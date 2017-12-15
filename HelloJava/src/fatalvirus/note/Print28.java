package fatalvirus.note;

public class Print28 {

	public static void main(String[] args) {

		// # 28
		int sum = 0, number = 0;
		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
		}
		String fmt = "num : %d, sum : %d \n";
		System.out.printf(fmt, number, sum);
		// num : 20, sum : 189
	}

}
