package project.v1b;

public class BookSeviceMain {

	public static void main(String[] args) {

		BookService bs = new BookServiceImpl();

		BookVO b = new BookVO(1, "축구의 역사", "굿스포츠", 7000);

		bs.addBook(b);
		System.out.println(b);

		bs.getBook();

		bs.getBook("축구의 역사");

		bs.modifyBook("축구의 역사");

		bs.removeBook("축구의 역사");
	}

}
