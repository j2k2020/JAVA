package ch06.sec03;

public class Book {
	String title;
	String author;
	int price;
	
	//�ٸ� ������
	public Book() {
		//this()�޼ҵ�: �� �����ڿ��� �ٸ� �����ڸ� ȣ���� �� ���
		this("�ڹٽ�ũ��Ʈ","�̸���",34000);
		
	}
	
	//�Ű������� �ִ� ����
	public Book(String t, String au, int p) {
		title = t;
		author = au;
		price = p;
	}
	
	public void show() {
		System.out.println("*******���� ����*******");
		System.out.println("������:"+title);
		System.out.println("����:"+author);
		System.out.println("����:"+price);
		System.out.println();
	}

}
