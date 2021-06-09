package Test0323;

import java.util.Scanner;
import java.util.Vector;

//도서 정보를 입력 받아서 Vector에 담아서 Controller에게 전달한느 역할

public class BookInsert {
	//Controller 클래스가 싱글톤이므로 getInstance() 호출해서 인스턴스 생성
	Controller controller = Controller.getInstance();
	Scanner sc = new Scanner(System.in);
	
	//데이터 입력
	public void insert() {
		String isbn, title, author, publish_date, price, stock;
		
		System.out.println("\n******************************");
		System.out.println("도서 정보 등록");
		System.out.println("******************************");
		
		System.out.println("도서번호 입력: ");
		isbn = sc.next();
		//앞에서 입력하고 엔터 친 결과, 엔터 값이 다음 값을 자동 저장되는 경우 발생
		
		sc.nextLine();
		
		System.out.println("도서명 입력: ");
		title = sc.next();
		
		System.out.println("저자 입력: ");
		author = sc.next();
		
		System.out.println("날짜 입력: ");
		publish_date = sc.next();
		
		System.out.println("가격 입력: ");
		price = sc.next();
		
		System.out.println("재고 입력: ");
		stock = sc.next();
		
		System.out.println("******************************");
		
		//Vector에 저장
		Vector<String> v = new Vector<String>();
		v.add(isbn);
		v.add(title);
		v.add(author);
		v.add(price);
		v.add(publish_date);
		v.add(stock);
		
		//Controller에게 입력 받은 데이터 전달
		controller.insert(v);
		sc.close();
	}

}
