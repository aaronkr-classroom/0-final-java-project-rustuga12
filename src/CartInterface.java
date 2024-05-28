import com.market.bookitem.Book;

public interface CartInterface {
	void printBookLIST(Book[] p);
	boolean isBookInCart(String id); //책의 함수 이름은 isCartInBook()

	void insertBook(Book p);
	void removeCart(int numId);
	void deleteBook();
	
}
