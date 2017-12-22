package fatalvirus;

public class Strings {

	public static void main(String[] args) {

		// String 클래스 주요 메서드
		// charAt(), contains(),
		// equalsIgnoreCase(), indexOf(),
		// lastIndexOf(), length(),
		// replace(), split(),
		// substring(), valueOf()

		String s = "Hello";
		String n = "123456789";
		int i1 = 1;
		int i2 = 6;
		char c1 = s.charAt(1); // 지정한 위치 문자 추출
		char c2 = n.charAt(6);
		System.out.printf("%s의 %d번째 문자 %c \n", s, i1 + 1, c1);
		System.out.printf("%s의 %d번째 문자 %c \n", n, i2 + 1, c2);

		s = "abcdfg";
		String sc = "bc";
		boolean b = s.contains(sc);
		System.out.printf("%s가 %s를 포함하고 있나요? %b \n", s, sc, b);

		s = "Hello";
		String sn = new String("Hello");
		String st = "hello";
		b = s.equals(s);
		boolean b2 = s.equals(st);
		System.out.printf("%s와 %s가 같나요? %b \n", s, sn, b);
		System.out.printf("%s와 %s가 같나요? %b \n", s, st, b2);

		s = "Hello";
		String ST = "HELLO";
		b = s.equalsIgnoreCase(ST);
		b2 = s.equalsIgnoreCase(st);
		System.out.printf("%s와 %s가 같은 단어인가요? %b \n", s, ST, b);
		System.out.printf("%s와 %s가 같은 단어인가요? %b \n", s, st, b2);

		s = "Hello";
		char it1 = 'o';
		char it2 = 'k';
		int idx1 = s.indexOf(it1);
		int idx2 = s.indexOf(it2);
		System.out.printf("%s에 %c가 몇번째에 존재하나요? %d번째 \n", s, it1, idx1 + 1);
		System.out.printf("%s에 %c가 몇번째에 존재하나요? %d번째 \n", s, it2, idx2 + 1);

		s = "java.lang.Object";
		char slt = '.';
		idx1 = s.lastIndexOf(slt);
		idx2 = s.indexOf(slt);
		System.out.printf("%s에서 오른쪽에 가까운 %c이 몇번째에 있나요? %d \n", s, slt, idx1 + 1);
		System.out.printf("%s에서 왼쪽에 가까운 %c이 몇번째에 있나요? %d \n", s, slt, idx2 + 1);

		s = "Hello";
		int length = s.length();
		System.out.printf("%s의 길이가 얼마인가요? %d \n", s, length);

		s = "Hello";
		char H = 'H';
		char C = 'C';
		String s1 = s.replace(H, C);
		System.out.printf("%s에서 %c를 %c로 바꾸면 무엇이 되나요? %s \n", s, H, C, s1);

		String animals = "dog,cat,bear";
		String w = ",";
		String[] arr = animals.split(w);
		System.out.printf("%s를 %s를 기준으로 나누면 첫번째 단어는 무엇이 되나요? %s \n", animals, w, arr[0]);
		System.out.printf("%s를 %s를 기준으로 나누면 두번째 단어는 무엇이 되나요? %s \n", animals, w, arr[1]);
		System.out.printf("%s를 %s를 기준으로 나누면 세번째 단어는 무엇이 되나요? %s \n", animals, w, arr[2]);

		s = "java.lang.object";
		int ss1 = 10;
		int ssi = 5;
		int ssf = 9;
		String c = s.substring(ss1);
		String p = s.substring(ssi, ssf);
		System.out.printf("%s에서 %d번째 문자 이후의 단어는? %s \n", s, ss1, c);
		System.out.printf("%s에서 %d번째 문자에서 %d번째 문자 까지의 단어는? %s \n", s, ssi + 1, ssf + 1, c);

		s = "	Hello Wolrd	";
		s1 = s.trim();
		System.out.printf("%s에서 앞뒤 공백을 제거하면? %s \n", s, s1);

		boolean tb = true;
		char tc = 'a';
		int ti = 100;
		long tl = 100L;
		float tf = 10f;
		double td = 10.0;
		s = String.valueOf(tb);
		sc = String.valueOf(tc);
		String si = String.valueOf(ti);
		String sl = String.valueOf(tl);
		String sf = String.valueOf(tf);
		String sd = String.valueOf(td);
		java.util.Date dd = new java.util.Date();
		String data = String.valueOf(dd);
		System.out.println(s);
		System.out.println(sc);
		System.out.println(si);
		System.out.println(sl);
		System.out.println(sf);
		System.out.println(sd);
		System.out.println(data);

		// +StringBuffer
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = sb.append(true);
		sb.append('d').append(10.0f);

		StringBuffer sb3 = sb.append("ABC").append(123);

		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb3);
	}

}
