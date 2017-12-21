package project.v1b;

public class BookServiceImpl implements BookService {

	@Override
	public void addBook(BookVO b) {
		System.out.println("도서가 추가되었습니다.");
	}

	@Override
	public String getBook() {
		return null;
	}

	@Override
	public String getBook(String title) {
		return null;
	}

	@Override
	public void modifyBook(String title) {
		System.out.println("도서가 수정되었습니다.");
	}

	@Override
	public void removeBook(String title) {
		System.out.println("도서가 삭제되었습니다.");
	}

}
