public class CartItem {
	//변수

	
	private Book itemBook;
	private String bookID;
	private int quantity;
	private int  totalPrice;
	
	public CartItem() {}
	public CartItem(Book booklist) { // 9장
		this.itemBook = booklist;
		this.bookID = booklist.getBookId();
		this.quantity = 1; 
		updateTotalPrice();
	}
	/*public CartItem(String[] book) {
		this.itemBook = book;
		this.bookID = book[0];
		this.quantity = 1;	
		updateTotalPrice();
	} */

	//Getter 메서드
	
	public Book getItemBook() {return itemBook;} //9장

	//public void setItemBook(String[] itemBook) {this.itemBook = itemBook;}

	public String getBookID() {return bookID;}

	public void setBookID(String bookID) {this.bookID = bookID;this.updateTotalPrice();}

	public int getQuantity() {return quantity;}
	
	public void setQuantity(int quantity) {this.quantity = quantity;this.updateTotalPrice();}
	
	public int getTotalPrice() {return totalPrice;}

	public void updateTotalPrice() {
		//totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
		totalPrice = this.itemBook.getUnitPrice() * this.quantity;
	}	
}
