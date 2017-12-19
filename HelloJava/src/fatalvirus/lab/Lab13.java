package fatalvirus.lab;

public class Lab13 {

	public static void main(String[] args) {

		Person 혜교 = new Person();
		System.out.println(혜교);

		// String name = "혜교";
		// String addr = "서울";
		// String telno = "123-4567";
		// System.out.printf("%s %s %s", name, addr, telno);

		Person 지현 = new Person("지현", "인천", "987-6543");
		System.out.println(지현);

	}

}

// # 37, 38, 39
// # 37
// Person : 이름, 주소, 전화번호 - VO

class Person {
	// 멤버변수 - 반드시 private
	private String name;
	private String addr;
	private String telno;

	// 생성자
	public Person() {
		this("혜교", "서울", "123-4567");
	}

	public Person(String name, String addr, String telno) {
		this.name = name;
		this.addr = addr;
		this.telno = telno;
	}

	// setter/getter
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

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", telno=" + telno + "]";
	}

}

class Customer37 {
	private int custno;
	private String name;
	private String addr;
	private String telno;
	private int mileage;

	public Customer37() {
		this(1, "혜교", "서울", "123-4567", 1000);
	}

	public Customer37(int custno, String name, String addr, String telno, int mileage) {
		this.custno = custno;
		this.name = name;
		this.addr = addr;
		this.telno = telno;
		this.mileage = mileage;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
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

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Customer37 [custno=" + custno + ", name=" + name + ", addr=" + addr + ", telno=" + telno + ", mileage="
				+ mileage + "]";
	}

}

// # 38
class Book38 {
	private String title;
	private int pages;
	private String author;

	public Book38() {
		this("자바정석", 500, "남궁 성");
	}

	public Book38(String title, int pages, String author) {
		this.title = title;
		this.pages = pages;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book38 [title=" + title + ", pages=" + pages + ", author=" + author + "]";
	}

}

class Magazine {
	private String title;
	private int pages;
	private String author;
	private String pubDate;

	public Magazine() {
		this("자바정석", 500, "남궁 성", "2017-12");
	}

	public Magazine(String title, int pages, String author, String pubDate) {
		this.title = title;
		this.pages = pages;
		this.author = author;
		this.pubDate = pubDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubDate(String pubDate) {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		return "Book38 [title=" + title + ", pages=" + pages + ", author=" + author + ", pubDate=" + pubDate + "]";
	}
}

// # 39
class Phone {
	private String maker;
	private int price;
	private String type;

	public Phone() {
		this("엘지", 500000, "4G");
	}

	public Phone(String maker, int price, String type) {
		this.maker = maker;
		this.price = price;
		this.type = type;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", price=" + price + ", type=" + type + "]";
	}

}

class SmartPhone {
	private String maker;
	private int price;
	private String type;
	private String osVer;
	private String memSize;
	private boolean isCamera;
	private boolean isBluetooth;

	public SmartPhone() {
		this("엘지", 500000, "4G", "1v", "4GB", true, true);
	}

	public SmartPhone(String maker, int price, String type, String osVer, String memSize, boolean isCamera,
			boolean isBluetooth) {
		this.maker = maker;
		this.price = price;
		this.type = type;
		this.osVer = osVer;
		this.memSize = memSize;
		this.isCamera = isCamera;
		this.isBluetooth = isBluetooth;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOsVer() {
		return osVer;
	}

	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}

	public String getMemSize() {
		return memSize;
	}

	public void setMemSize(String memSize) {
		this.memSize = memSize;
	}

	public boolean isCamera() {
		return isCamera;
	}

	public void setCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public boolean isBluetooth() {
		return isBluetooth;
	}

	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}

	@Override
	public String toString() {
		return "SmartPhone [maker=" + maker + ", price=" + price + ", type=" + type + ", osVer=" + osVer + ", memSize="
				+ memSize + ", isCamera=" + isCamera + ", isBluetooth=" + isBluetooth + "]";
	}

}
