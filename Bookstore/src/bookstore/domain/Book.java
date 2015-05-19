package bookstore.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="book")
public class Book  {

	@Id
	@GeneratedValue
	private int bookId;
	private String bookname;
	private double price;
	
	public int getBookId() {
		return bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public double getPrice() {
		return price;
	}
	public void setBookId(int bookId) {	
		this.bookId = bookId;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
