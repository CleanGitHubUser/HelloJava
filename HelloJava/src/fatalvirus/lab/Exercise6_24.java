package fatalvirus.lab;

public class Exercise6_24 {

	public static int abs(int v) {
		if (v >= 0)
			return v;
		return -v;
	}

	public static void main(String[] args) {

		int value = 5;
		System.out.println(value + "의 절대값:" + abs(value));
		value = -10;
		System.out.println(value + "의 절대값:" + abs(value));

	}

}
