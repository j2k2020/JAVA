package Test0323;

public class BookDTO {
	private String isbn;
	private String title;
	private String author;
	private int price;
	private String publish_date;
	private int stock;
	
	//�Ű������� �ִ� ������
	public BookDTO(String isbn, String title, String author, int price, String publish_date, int stock) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publish_date = publish_date;
		this.stock = stock;
	}
	
	public BookDTO() {} //�⺻ ������ �ʿ�
	
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
		//�Ѳ����� ���ڿ��� �����ؼ� �����ϱ� ���� StringBuilder Ŭ���� �̿� 
		//���� ���ڿ��� ���ϴ� ���(append)
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
		
		return builder.toString(); //������ ���ڿ� ��ȯ
		

	}
	
	

}
