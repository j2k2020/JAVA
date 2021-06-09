package Test0323;

public class BookDTO {
	private String isbn;
	private String title;
	private String author;
	private int price;
	private String publish_date;
	private int stock;
	
	//매개변수가 있는 생성자
	public BookDTO(String isbn, String title, String author, int price, String publish_date, int stock) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publish_date = publish_date;
		this.stock = stock;
	}
	
	public BookDTO() {} //기본 생성자 필요
	
	//getter/setter
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublish_date() {
		return publish_date;
	}
	public void setPublish_date(String publish_date) {
		this.publish_date = publish_date;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	@Override
	public String toString() {
		//한꺼번에 문자열을 저장해서 전달하기 위해 StringBuilder 클래스 이용 
		//기존 문자열에 더하는 방식(append)
		StringBuilder builder = new StringBuilder();
		builder.append(isbn);
		builder.append("\t");
		builder.append(title);
		builder.append("\t");
		builder.append(author);
		builder.append("\t");
		builder.append(price);
		builder.append("\t");
		builder.append(publish_date);
		builder.append("\t");
		builder.append(stock);
		builder.append("\t");
		
		return builder.toString(); //더해진 문자열 반환
		

	}
	
	

}
