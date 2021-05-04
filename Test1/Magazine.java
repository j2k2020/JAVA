package Test1;

public class Magazine {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	int year;
	int month;
	String desc;
	
	public Magazine(String isbn, String title, String author, String publisher, int price, int year, int month, 
			String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
		this.month = month;
		this.desc = desc;
	}


	@Override
	public String toString() {
		return isbn + "\t|" + title + "\t|" + author + "\t|" + publisher + "\t|" + price + "\t|"+ year + "." + month + ""
				+ desc;
	}

}
