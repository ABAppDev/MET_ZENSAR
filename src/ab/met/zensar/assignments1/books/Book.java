package ab.met.zensar.assignments1.books;

public class Book {

    private static int book_counter = 0;
    private int bookid;
    private float price;
    private String name;
    private Author details;

    public Book(String name, float price, String authorname) {
	this.bookid = ++book_counter;
	this.price = price;
	this.name = name;
	this.details = new Author(authorname);
    }

    public float getPrice() {
	return price;
    }

    public void setPrice(float price) {
	this.price = price;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String toString() {
	return "\n\nBook Name: " + name + "\nBook ID: " + bookid + "\nPrice: " + price + details.toString();
    }

}
