package Test1;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("********************************* ���� ��� *********************************");
		
		Book book1 = new Book("21424", "Java Pro", "���ϳ�", "Jaen.kr", 15000, "�⺻����");
		//System.out.println(book1.toString());
		System.out.println(book1);
		
		Book book2 = new Book("35355", "OOAD �м�,����", "�ҳ���", "Jaen.kr", 30000, " ");
		System.out.println(book2);
		
		Magazine Maga = new Magazine("35535", "Java World", "������", "androidjava.com", 7000, 2013, 2, "");
		System.out.println(Maga);
		
		
	}

}
