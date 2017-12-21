package project.v1b;

public interface BookService {

	public void addBook(BookVO b);

	public String getBook();

	public String getBook(String title);

	public void modifyBook(String title);

	public void removeBook(String title);

}
