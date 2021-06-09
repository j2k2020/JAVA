package jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class BookInsertEx {

	public static void main(String[] args) {
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
			
			//insert 작업 수행
			//쿼리 전송을 위한 Statement 객체 생성
			Statement stmt=con.createStatement();
			
			//insert 쿼리문 작성
			String sql = "insert into book values('202','자바','김자바','%d','%s',5,'2')";
			
			//쿼리문 실행(영향을 받은 행의 수 반환)
			int result=stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("도서 정보 등록 성공");
			}

		} catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		}

	}

}
