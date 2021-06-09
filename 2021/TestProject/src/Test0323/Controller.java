package Test0323;

import java.util.Vector;

public class Controller {
	//싱글톤(Singleton)클래스: 단 하나의 객체만 생성
	private static Controller instance = new Controller();
	
	//new 연산자로 생성자 호출할 수 없도록 막음
	private Controller() {}
	
	//외부에서 호출해서 객체 생성할 수 있도록
	//자신의 객체 (instance)반환
	public static Controller getInstance() {
		return instance;
	}
	
	
	//도서 정보 입력 받는 BookInsert 클래스에서 호출 하고
	//입력된 데이터 전달
	//전달받은 데이터를 BookDTO에 담아서 BookDAO에게 전달
	//(그러면 BookDATO가 db에 저장하든지, 파일로 저장)
	public void insert(Vector<String> v) {
		BookDTO dto = new BookDTO();
		BookDAO dao = new BookDAO();
		
		//전달받은 Vector 값을 BookDTO에 저장
		dto.setIsbn(v.get(0));
		dto.setTitle(v.get(1));
		dto.setAuthor(v.get(2));
		dto.setPrice(Integer.parseInt(v.get(3)));
		dto.setPublish_date(v.get(4));
		dto.setStock(Integer.parseInt(v.get(5)));
		
		//BookDAO 클래스의 insert() 호출: dto 전달
		dao.insertBook(dto);
		
	}
	

}
