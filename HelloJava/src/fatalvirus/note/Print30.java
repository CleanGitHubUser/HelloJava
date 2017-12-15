package fatalvirus.note;

public class Print30 {

	public static void main(String[] args) {

		// # 30 - 구구단 차트
		String fmt = "           Mutiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";
		fmt += "1 |    1   2   3   4   5   6   7   8   9 \n";
		fmt += "2 |    2   4   6   8  10  12  14  16  18 \n";
		fmt += "3 |    3   6   9  12  15  18  21  24  27 \n";
		fmt += "4 |    4   8  12  16  20  24  28  32  36 \n";
		fmt += "6 |    6  12  18  24  30  36  42  48  54 \n";
		fmt += "7 |    7  14  21  28  35  42  49  56  63 \n";
		fmt += "8 |    8  16  24  32  40  48  56  64  72 \n";
		fmt += "9 |    9  18  27  36  45  54  63  72  81 \n\n";

		System.out.printf(fmt);

		fmt = "           Mutiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";

		System.out.printf(fmt);
		for (int i = 1; i <= 9; ++i) {
			fmt = "%d |  %3d  %2d  %2d  %2d  %2d  %2d  %2d  %2d  %2d \n";
			System.out.printf(fmt, i, i * 1, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9);
		}

		fmt = "           Mutiplication Table \n";
		fmt += "       1   2   3   4   5   6   7   8   9 \n";
		fmt += "---------------------------------------- \n";
		System.out.printf(fmt);
		for (int i = 1; i <= 9; ++i) {
			System.out.printf("%d |  %3d", i, i);
			for (int j = 2; j <= 9; ++j) {
				System.out.printf("  %2d", i * j);
			}
			System.out.println();

		}

		// # 30
		System.out.println("           Multiplication Table");
		int i, j, k = 1;
		System.out.print("      ");
		fmt = "%2d  ";
		for (i = 1; i <= 9; ++i) {
			System.out.printf(fmt, i);
		}
		System.out.println("");
		while (k <= 40) {
			System.out.print("-");
			++k;
		}
		System.out.println("");
		for (i = 1; i <= 9; ++i) {
			System.out.printf("%d |   ", i);
			for (j = 1; j <= 9; ++j) {
				System.out.printf(fmt, i * j);
			}
			System.out.println("");
		}
	}

}
