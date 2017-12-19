package fatalvirus.lab;

public class Exercise6_22 {

	public static void main(String[] args) {

		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = "";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		str = null;
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

	public static boolean isNumber(String s) {
		if (s == "" || s == null)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
				return false;
			}
		}
		return true;

	}
}
