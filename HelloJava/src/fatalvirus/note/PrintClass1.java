package fatalvirus.note;

public class PrintClass1 {

}

class Book {
	private String bookNum;
	private String title;
	private String publish;
	private String author;
	private String genre;
	private int price;
	private String isLended;
	private String regDate;

	public Book() {
	}

	public Book(String bookNum, String title, String publish, String author, String genre, int price, String isLended,
			String regDate) {
		this.bookNum = bookNum;
		this.title = title;
		this.publish = publish;
		this.author = author;
		this.genre = genre;
		this.price = price;
		this.isLended = isLended;
		this.regDate = regDate;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsLended() {
		return isLended;
	}

	public void setIsLended(String isLended) {
		this.isLended = isLended;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", title=" + title + ", publish=" + publish + ", author=" + author
				+ ", genre=" + genre + ", price=" + price + ", isLended=" + isLended + ", regDate=" + regDate + "]";
	}
}

class Member {
	private String num;
	private String name;
	private String phoneNum;
	private String lentBook;
	private String mileage;

	public Member() {
	}

	public Member(String num, String name, String phoneNum, String lentBook, String mileage) {
		this.num = num;
		this.name = name;
		this.phoneNum = phoneNum;
		this.lentBook = lentBook;
		this.mileage = mileage;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getLentBook() {
		return lentBook;
	}

	public void setLentBook(String lentBook) {
		this.lentBook = lentBook;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", phoneNum=" + phoneNum + ", lentBook=" + lentBook
				+ ", mileage=" + mileage + "]";
	}

}

class Staff {
	private String sNum;
	private String sName;
	private String sAdrr;
	private String sPhoneNum;
	private String spasswd;
	private String sLogInTime;
	private String sLogOutTime;

	public Staff() {
	}

	public Staff(String sNum, String sName, String sAdrr, String sPhoneNum, String spasswd, String sLogInTime,
			String sLogOutTime) {
		this.sNum = sNum;
		this.sName = sName;
		this.sAdrr = sAdrr;
		this.sPhoneNum = sPhoneNum;
		this.spasswd = spasswd;
		this.sLogInTime = sLogInTime;
		this.sLogOutTime = sLogOutTime;
	}

	public String getsNum() {
		return sNum;
	}

	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAdrr() {
		return sAdrr;
	}

	public void setsAdrr(String sAdrr) {
		this.sAdrr = sAdrr;
	}

	public String getsPhoneNum() {
		return sPhoneNum;
	}

	public void setsPhoneNum(String sPhoneNum) {
		this.sPhoneNum = sPhoneNum;
	}

	public String getSpasswd() {
		return spasswd;
	}

	public void setSpasswd(String spasswd) {
		this.spasswd = spasswd;
	}

	public String getsLogInTime() {
		return sLogInTime;
	}

	public void setsLogInTime(String sLogInTime) {
		this.sLogInTime = sLogInTime;
	}

	public String getsLogOutTime() {
		return sLogOutTime;
	}

	public void setsLogOutTime(String sLogOutTime) {
		this.sLogOutTime = sLogOutTime;
	}

	@Override
	public String toString() {
		return "Staff [sNum=" + sNum + ", sName=" + sName + ", sAdrr=" + sAdrr + ", sPhoneNum=" + sPhoneNum
				+ ", spasswd=" + spasswd + ", sLogInTime=" + sLogInTime + ", sLogOutTime=" + sLogOutTime + "]";
	}

}