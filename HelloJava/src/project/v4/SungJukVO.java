package project.v4;

public class SungJukVO {

	private int sjno;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avrg;
	private String grd;
	private String regdate;

	public SungJukVO() {
	}

	public SungJukVO(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getTot() {
		return tot;
	}

	public double getAvrg() {
		return avrg;
	}

	public String getGrd() {
		return grd;
	}

	public String getRegdate() {
		return regdate;
	}

	public String toString() {
		String fmt = "sjno = %d, name = %s, kor = %d, eng = %d, mat = %d, tot = %d, avrg = %.1f, grd = %s, regdate = %s";
		return String.format(fmt, sjno, name, kor, eng, mat, tot, avrg, grd, regdate);
	}
}
