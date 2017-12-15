package fatalvirus.note;

public class Exercise4_4 {

	public static void main(String[] args) {

		// # 4 - 4
		int i = 0, sum = 0;
		while (sum < 100) {
			++i;
			if (i % 2 == 0)
				sum -= i;
			else
				sum += i;
		}
		System.out.printf("i = %d\n", i);
	}

}
