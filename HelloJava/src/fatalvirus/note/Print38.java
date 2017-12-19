package fatalvirus.note;

public class Print38 {

}

class BookNote {
	private String title;
	private int page;
	private String author;

	public BookNote() {
	}

	public BookNote(String title, int page, String author) {
		this.title = title;
		this.page = page;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", page=" + page + ", author=" + author + "]";
	}
}

class Magazine {
	private String title;
	private int page;
	String author;
	String released;

	public Magazine() {
	}

	public Magazine(String title, int page, String author, String released) {
		this.title = title;
		this.page = page;
		this.author = author;
		this.released = released;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getReleased() {
		return released;
	}

	public void setReleased(String released) {
		this.released = released;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", page=" + page + ", author=" + author + ", released=" + released + "]";
	}
}