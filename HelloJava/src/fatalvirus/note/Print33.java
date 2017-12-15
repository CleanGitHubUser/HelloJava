package fatalvirus.note;

public class Print33 {

	public static void main(String[] args) {

		// # 33
		char pattern = '+';
		for (int i = 1; i <= 7; ++i) {
			for (int j = 1; j <= 7; ++j) {
				if (j % 4 < 2 * j - 1)
					System.out.print(pattern);

			}
		}
	}

}
