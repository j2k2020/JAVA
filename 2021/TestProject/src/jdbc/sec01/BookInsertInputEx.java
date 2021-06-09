package jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class BookInsertInputEx {

	public static void main(String[] args) {
		//등록할 도서 정보 입력 
		Scanner sc = new Scanner(System.in);
		//도서번호~출판사번호까지 입력 받기
		
		System.out.println("도서 정보를 등록하시요>>");
		
		System.out.print("도서번호 입력:");
		//String bookNo= sc.next();
		String bookNo= sc.nextLine();
		
		System.out.print("도서명 입력:");
		//String bookName= sc.next();
		String bookName= sc.nextLine();
		
		System.out.print("저자 입력:");
		//String bookAuthor= sc.next();
		String bookAuthor= sc.nextLine();
		
		System.out.print("도서가격 입력:");
		//int bookPrice= sc.nextInt();
		int bookPrice= sc.nextInt();
		
		sc.nextLine();
		System.out.print("도서 발행일 입력:");
		//Date bookDate = sc.next();
		String bookDate = sc.nextLine();
		
		System.out.print("도서재고 입력:");
		//int bookStock = sc.nextInt();
		int bookStock = sc.nextInt();
		
		sc.nextLine();
		System.out.print("출판사번호 입력:");
		//String pubNo = sc.next();
		String pubNo = sc.nextLine();
		
		// DB연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "JJEUSER2";
			String pwd = "1234";
			Connection con = DriverManager.getConnection(url, user, pwd);			
			if (con != null) {
				System.out.println("DB연결 성공");
			} // DB연결 과정 종료
			
			//입력된 값으로 insert 작업 수행
			//쿼리 전송을 위한 Statement 객체 생성
			Statement stmt=con.createStatement();
			
			//String sql=String.format(insert in book(열 리스트) values(서식 지정자)", 변수 리스트);
			
			
			//insert 쿼리문 작성
			String sql = String.format("insert into book(bookNo,bookName,bookAuthor,"
					+ "bookPrice, bookDate,bookStock, pubNo) "
					+ "values('%s','%s','%s','%d','%s','%d','%s')"
					,bookNo,bookName,bookAuthor,bookPrice, bookDate,bookStock, pubNo);
			
			int result=stmt.executeUpdate(sql);
			
			
			//쿼리문 실행(영향을 받은 행의 수 반환)
			if(result > 0) {
				System.out.println("도서 정보 등록 성공");
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}

	}

}
