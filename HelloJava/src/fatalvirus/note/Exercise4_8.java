package fatalvirus.note;

public class Exercise4_8 {

	public static void main(String[] args) {

		// # 4 - 8
		String fmt = "x = %2d, y = %2d\n";
		for (int x = 0; x <= 10; ++x) {
			for (int y = 0; y <= 10; ++y) {
				if (2 * x + 4 * y == 10)
					System.out.printf(fmt, x, y);
			}
		}
	}

}
