package project.v1b;

public class BookVO {
	private int no;
	private String title;
	private String publi;
	private int price;

	public BookVO() {
	}

	public BookVO(int no, String title, String publi, int price) {
		this.no = no;
		this.title = title;
		this.publi = publi;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubli() {
		return publi;
	}

	public void setPubli(String publi) {
		this.publi = publi;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String fmt = "BookVO [no=%d, title=%s, publi=%s, price=%d]";
		return String.format(fmt, no, title, publi, price);
	}
}
