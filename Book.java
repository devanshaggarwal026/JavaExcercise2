package co.robomq.BookAssignment;

public class Book {
	private int id , quantity;
	private String name , author ,publisher;
	public Book(int id, int quantity, String name, String author, String publisher) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", quantity=" + quantity + ", name=" + name + ", author=" + author + ", publisher="
				+ publisher + "]";
	}

	
}
