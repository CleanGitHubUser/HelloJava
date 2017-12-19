package fatalvirus.note;

public class Exercise6_3 {

	public static void main(String[] args) {

	}

}

class Student {
	private String name; // 학생이름
	private int ban; // 반
	private int no; // 번호
	private int kor; // 국어점수
	private int eng; // 영어점수
	private int math; // 수학점수
	private int tot;
	private int avg;

	public Student() {
		name = "홍길동";
		ban = 1;
		no = 1;
		kor = 100;
		eng = 60;
		math = 76;
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = tot;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

	public int getTotal() {
		return getKor() + getEng() + getMath();
	}

	public float getAverage() {
		return (float) (getTotal() / 3.0);
	}

	public String info() {
		return getName() + "," + getNo() + "," + getBan() + "," + getKor() + "," + getEng() + "," + getMath() + ","
				+ getTotal() + "," + getAverage();
	}
}