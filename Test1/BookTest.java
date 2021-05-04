package Test1;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("********************************* 도서 목록 *********************************");
		
		Book book1 = new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "기본문법");
		//System.out.println(book1.toString());
		System.out.println(book1);
		
		Book book2 = new Book("35355", "OOAD 분석,설계", "소나무", "Jaen.kr", 30000, " ");
		System.out.println(book2);
		
		Magazine Maga = new Magazine("35535", "Java World", "편집부", "androidjava.com", 7000, 2013, 2, "");
		System.out.println(Maga);
		
		
	}

}
