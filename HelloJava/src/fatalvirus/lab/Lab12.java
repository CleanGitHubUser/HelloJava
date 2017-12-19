package fatalvirus.lab;

public class Lab12 {

	public static void main(String[] args) {

		// 고객, 도서, 주문
		// 학생, 학과, 과목, 교수

		Customer c1 = new Customer();
		c1.cno = "1";
		c1.name = "박지성";
		c1.jumin = "810101-1xxxxx";
		c1.addr = "영국 런던";
		c1.mphone = "000-5000-0001";

		Customer c2 = new Customer();
		c2.cno = "2";
		c2.name = "김연아";
		c2.jumin = "900101-2xxxxx";
		c2.addr = "한국 서울";
		c2.mphone = "000-6000-0001";

		Customer c3 = new Customer();
		c3.cno = "3";
		c3.name = "장미란";
		c3.jumin = "830101-3xxxxx";
		c3.addr = "한국 강원도";
		c3.mphone = "000-7000-0001";

		Customer c4 = new Customer();
		c4.cno = "4";
		c4.name = "추신수";
		c4.jumin = "720101-4xxxxx";
		c4.addr = "미국 뉴욕";
		c4.mphone = "000-8000-0001";

		Book b1 = new Book();
		b1.bno = "1";
		b1.name = "축구의 역사";
		b1.publ = "굿스포츠";
		b1.price = 7000;

		Book b2 = new Book();
		b2.bno = "2";
		b2.name = "축구아는 여자";
		b2.publ = "나무수";
		b2.price = 13000;

		Book b3 = new Book();
		b3.bno = "3";
		b3.name = "축구의 이해";
		b3.publ = "대한미디어";
		b3.price = 22000;

		Book b4 = new Book();
		b4.bno = "4";
		b4.name = "골프 바이블";
		b4.publ = "대한미디어";
		b4.price = 35000;

		Book b5 = new Book();
		b5.bno = "5";
		b5.name = "피겨 교본";
		b5.publ = "굿스포츠";
		b5.price = 8000;

		Order o1 = new Order();
		o1.cno = "1";
		o1.bno = "1";
		o1.price = 7000;
		o1.odate = "2014-07-01";

		Order o2 = new Order();
		o2.cno = "1";
		o2.bno = "2";
		o2.price = 13000;
		o2.odate = "2014-07-03";

		Order o3 = new Order();
		o3.cno = "2";
		o3.bno = "5";
		o3.price = 8000;
		o3.odate = "2014-07-03";

		Order o4 = new Order();
		o4.cno = "3";
		o4.bno = "2";
		o4.price = 13000;
		o4.odate = "2014-07-04";

		Order o5 = new Order();
		o5.cno = "4";
		o5.bno = "4";
		o5.price = 35000;
		o5.odate = "2014-07-05";

		Order o6 = new Order();
		o6.cno = "1";
		o6.bno = "3";
		o6.price = 22000;
		o6.odate = "2014-07-07";

		Order o7 = new Order();
		o7.cno = "4";
		o7.bno = "3";
		o7.price = 22000;
		o7.odate = "2014-07-07";

		Student s1 = new Student();
		s1.sno = 201350050;
		s1.name = "김태희";
		s1.addr = "경기도 고양시";
		s1.age = 25;
		s1.birthd = "1985.3.22";
		s1.major = "컴퓨터공학";
		s1.tutor = 504;
		s1.intviewt = "목 2교시";

		Student s2 = new Student();
		s2.sno = 201250006;
		s2.name = "송혜교";
		s2.addr = "서울 영등포구";
		s2.age = 22;
		s2.birthd = "1988.9.17";
		s2.major = "컴퓨터공학";
		s2.tutor = 301;
		s2.intviewt = "월 3교시";

		Student s3 = new Student();
		s3.sno = 201252110;
		s3.name = "전지현";
		s3.addr = "경기도 의정부시";
		s3.age = 24;
		s3.birthd = "1986.4.30";
		s3.major = "의상디자인";
		s3.tutor = 445;
		s3.intviewt = "화 4교시";

		Student s4 = new Student();
		s4.sno = 201351010;
		s4.name = "수지";
		s4.addr = "서울 성북구";
		s4.age = 20;
		s4.birthd = "1988.7.13";
		s4.major = "식품영양";
		s4.tutor = 556;
		s4.intviewt = "금 7교시";

		Student s5 = new Student();
		s5.sno = 201353011;
		s5.name = "아이유";
		s5.addr = "경기도 천안시";
		s5.age = 21;
		s5.birthd = "1987.2.25";
		s5.major = "철학";
		s5.tutor = 504;
		s5.intviewt = "수 6교시";

		Major m1 = new Major();
		m1.major = "컴퓨터공학";
		m1.phono = "123-4567-8901";
		m1.loca = "E동 2층";
		m1.dean = 504;
		m1.appod = "2007년";

		Major m2 = new Major();
		m2.major = "의상디자인";
		m2.phono = "234-5678-9012";
		m2.loca = "A동 1층";
		m2.dean = 301;
		m2.appod = "2009년";

		Major m3 = new Major();
		m3.major = "식품영양";
		m3.phono = "345-6789-0123";
		m3.loca = "F동 8층";
		m3.dean = 556;
		m3.appod = "2006년";

		Major m4 = new Major();
		m4.major = "철학";
		m4.phono = "456-7890-1234";
		m4.loca = "Z동 25층";
		m4.dean = 504;
		m4.appod = "2000년";

		Subject sj1 = new Subject();
		Subject sj2 = new Subject();
		Subject sj3 = new Subject();
		Subject sj4 = new Subject();

		sj1.sjno = 0205;
		sj2.sjno = 0211;
		sj3.sjno = 5029;
		sj4.sjno = 4111;

		sj1.sjname = "프로그래밍";
		sj2.sjname = "드레스 코드";
		sj3.sjname = "생활의 참견";
		sj4.sjname = "악마의사도";

		sj1.outline = "자바 프로그래밍";
		sj2.outline = "옷 입기의 기초";
		sj3.outline = "음식의 영양";
		sj4.outline = "종교와 철학. 과학의 얽힘";

		sj1.tutor = 301;
		sj2.tutor = 445;
		sj3.tutor = 556;
		sj4.tutor = 504;

		Professor p1 = new Professor();
		Professor p2 = new Professor();
		Professor p3 = new Professor();
		Professor p4 = new Professor();

		p1.pno = 301;
		p2.pno = 445;
		p3.pno = 556;
		p4.pno = 504;

		p1.pname = "이순신";
		p2.pname = "정약용";
		p3.pname = "김유신";
		p4.pname = "이성계";

		p1.pmajor = "프로그래밍";
		p2.pmajor = "의상디자인";
		p3.pmajor = "식품영양";
		p4.pmajor = "철학";

		c1 = new Customer("1", "박지성", "810101-1xxxxx", "영국 런던", "000-5000-0001");
		c2 = new Customer("2", "김연아", "900101-2xxxxx", "한국 서울", "000-6000-0001");
		c3 = new Customer("3", "장미란", "830101-3xxxxx", "한국 강원도", "000-7000-0001");
		c4 = new Customer("4", "추신수", "720101-4xxxxx", "미국 뉴욕", "000-8000-0001");

		b1 = new Book("1", "축구의 역사", "굿스포츠", 7000);
		b2 = new Book("2", "축구아는 여자", "나무수", 13000);
		b3 = new Book("3", "축구의 이해", "대한미디어", 220000);
		b4 = new Book("4", "골프 바이블", "대한미디어", 35000);
		b5 = new Book("5", "피겨 교본", "굿스포츠", 8000);

		o1 = new Order("1", "1", 7000, "2014-07-01");
		o2 = new Order("1", "2", 13000, "2014-07-03");
		o3 = new Order("2", "5", 8000, "2014-07-03");
		o4 = new Order("3", "2", 13000, "2014-07-04");
		o5 = new Order("4", "4", 35000, "2014-07-05");
		o6 = new Order("1", "3", 22000, "2014-07-07");
		o7 = new Order("4", "3", 22000, "2014-07-07");

		s1 = new Student(201350050, "김태희", "경기도 고양시", 25, "1985.3.22", "컴퓨터공학", 504, "목 2교시");
		s2 = new Student(201250006, "송혜교", "서울 영등포구", 22, "1988.9.17", "컴퓨터공학", 301, "월 3교시");
		s3 = new Student(201252110, "전지현", "경기도 의정부시", 24, "1986.4.30", "의상디자인", 445, "화 4교시");
		s4 = new Student(201351010, "수지", "서울 성북구", 20, "1988.7.13", "식품영양", 556, "금 7교시");
		s5 = new Student(201353011, "아이유", "경기도 천안시", 21, "1987.2.25", "철학", 504, "수 6교시");

		m1 = new Major("컴퓨터공학", "123-4567-8901", "E동 2층", 504, "2007년");
		m2 = new Major("의상디자인", "234-5678-9012", "A동 1층", 301, "2009년");
		m3 = new Major("식품영양", "345-6789-0123", "F동 8층", 556, "2006년");
		m4 = new Major("철학", "456-7890-1234", "Z동 25층", 504, "2000년");

		sj1 = new Subject(0205, "프로그래밍", "자바 프로그래밍", 301);
		sj2 = new Subject(0211, "드레스 코드", "옷 입기의 기초", 445);
		sj3 = new Subject(5029, "생활의 참견", "음식의 영양", 556);
		sj4 = new Subject(4111, "악마의 사도", "종교와 철학. 과학의 얽힘", 504);

		p1 = new Professor(301, "이순신", "프로그래밍");
		p2 = new Professor(445, "정약용", "의상디자인");
		p3 = new Professor(556, "김유신", "식품영양");
		p4 = new Professor(504, "이성계", "철학");

	}

}

class Customer {
	String cno; // int
	String name;
	String jumin;
	String addr;
	String mphone;

	public Customer(String cno, String name, String jumin, String addr, String mphone) {
		super();
		this.cno = cno;
		this.name = name;
		this.jumin = jumin;
		this.addr = addr;
		this.mphone = mphone;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

}

class Book {
	String bno;
	String name;
	String publ;
	int price;

	public Book(String bno, String name, String publ, int price) {
		super();
		this.bno = bno;
		this.name = name;
		this.publ = publ;
		this.price = price;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

}

class Order {
	String cno;
	String bno;
	int price;
	String odate;

	public Order(String cno, String bno, int price, String odate) {
		super();
		this.cno = cno;
		this.bno = bno;
		this.price = price;
		this.odate = odate;
	}

	public Order() {
		// TODO Auto-generated constructor stub
	}

}

class Student {
	int sno;
	String name;
	String addr;
	int age;
	String birthd;
	String major;
	int tutor;
	String intviewt;

	public Student(int sno, String name, String addr, int age, String birthd, String major, int tutor,
			String intviewt) {
		super();
		this.sno = sno;
		this.name = name;
		this.addr = addr;
		this.age = age;
		this.birthd = birthd;
		this.major = major;
		this.tutor = tutor;
		this.intviewt = intviewt;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}

class Major {
	String major;
	String phono;
	String loca;
	int dean;
	String appod;

	public Major(String major, String phono, String loca, int dean, String appod) {
		super();
		this.major = major;
		this.phono = phono;
		this.loca = loca;
		this.dean = dean;
		this.appod = appod;
	}

	public Major() {
		// TODO Auto-generated constructor stub
	}

}

class Subject {
	int sjno;
	String sjname;
	String outline;
	int tutor;

	public Subject(int sjno, String sjname, String outline, int tutor) {
		super();
		this.sjno = sjno;
		this.sjname = sjname;
		this.outline = outline;
		this.tutor = tutor;
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}

}

class Professor {
	int pno;
	String pname;
	String pmajor;

	public Professor(int pno, String pname, String pmajor) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pmajor = pmajor;
	}

	public Professor() {
		// TODO Auto-generated constructor stub
	}

}