package fatalvirus.note;

public class Print37 {

	public static void main(String[] args) {

		// # 37

	}

}

class Person {
	private String name;
	private String addr;
	private String phon;

	public Person() {
	}

	public Person(String name, String addr, String phon) {
		this.name = name;
		this.addr = addr;
		this.phon = phon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", phon=" + phon + "]";
	}
}

class Customer {
	private String name;
	private String addr;
	private String phon;
	private int cnum;
	private int mile;

	public Customer() {
	}

	public Customer(String name, String addr, String phon, int cnum, int mile) {
		this.name = name;
		this.addr = addr;
		this.phon = phon;
		this.cnum = cnum;
		this.mile = mile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}

	public int getCnum() {
		return cnum;
	}

	public void setCnum(int cnum) {
		this.cnum = cnum;
	}

	public int getMile() {
		return mile;
	}

	public void setMile(int mile) {
		this.mile = mile;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", addr=" + addr + ", phon=" + phon + ", cnum=" + cnum + ", mile=" + mile
				+ "]";
	}
}