package jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;


public class BookSelectEx {

	public static void main(String[] args) {	
		// DB연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//db로딩
			//연결주소
			/*String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "JJEUSER2";
			String pwd = "1234";*/
			//드라이버 메니저의 getConnection메소드 호출
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JJEUSER2", "1234");			
			if (con != null) {
				System.out.println("DB연결 성공");
			}
			/*DB연결 과정 종료*/
			
			
			/*쿼리 진행*/
			//Select문 사용해서 도서 정보 조회
			//쿼리문 전송을 위한 Statement객체 생성
			//Connection 인터페이스의 createStatement() 메소드를 사용해서 객체 생성
			Statement stmt = con.createStatement(); //쿼리문을 전송할 객체
			
			//select 쿼리문 작성
			String sql = "select*from Book order by bookNo";
			/*쿼리문 실행된 후 겨러과 받아옴
			 * select 구문이므로 executeQuery()메소드 사용
			 * 결과는 ResultSet객체로 반환
			 */
			ResultSet rs = stmt.executeQuery(sql);
			
			//executeQuery() 실행 결과로 받아온 ResultSet에서 데이터 추출
			//ResultSet의 next()메소드를 이용해서 논리적 커서를 다음으로 이동해가며 각 열의 데이터를 바이팅해 옴
			//next() 메소드: 커서를 이동하면서 다음 행 지정
			//다음 행에 있으면 true반환하고, 없으면 false반환
			//모든 행을 가져오려면 반복문을 사용
			//데이터 추출: 데이터 타입에 맞춰 getXXX() 메소드 사용
			//문자열: getString()
			//정수: getInt()
			//날짜: getDate()
			
			System.out.println("**********sec1.BookSelectEx 도서 정보**********");
			System.out.println("도서번호 \t\t도서명 \t\t\t저자 \t가격 \t발행일 \t\t재고 \t출판사");
			
			while(rs.next()) { //다음 행이 존재한다면
				//bookNo,bookName,bookAuthor,bookPrice, bookDate,bookStock, pubNo
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7);
				
				
				//한 행씩 출력
				System.out.format("%-10s\t %-25s\t %-10s %6d %13s\t %3d %10s",
						bookNo,bookName,bookAuthor,bookPrice,bookDate,bookStock,pubNo);
				
				
				System.out.println();
			}

		
		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}//try구문 End

	}

}
