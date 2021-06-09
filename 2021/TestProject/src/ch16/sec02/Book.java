package ch16.sec02;

public class Book {
	String bookNum;
	String bookName;
	String other;
	String price;
    String publish_date;
	String company;
	
	
	
	public Book(String bookNum, String bookName, String other, String price, String publish_date, String company) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.other = other;
		this.price = price;
		this.publish_date = publish_date;
		this.company = company;
	}
	@Override
	public String toString() {
		return "["+bookNum+"||"+bookName+"||"+other+"||"+
	price+"||"+publish_date+"||"+company+"]";
	}
	
	

}
