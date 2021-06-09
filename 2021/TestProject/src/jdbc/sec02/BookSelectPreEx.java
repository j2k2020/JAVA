package jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class BookSelectPreEx {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		con = DBConnect.getConnection();
		
		System.out.println("도서정보 조회");
		
		//sql문 작성
		String sql="select*from book order by bookNo";
		pstmt = con.prepareStatement(sql);
		rs=pstmt.executeQuery(); //select구문에서는  executeQuery()메소드 사용
		
		
		System.out.println("**********BookSelectPreEx 도서 정보**********");
		System.out.println("도서번호 \t\t도서명 \t\t\t저자 \t가격 \t발행일 \t\t재고 \t출판사");
		
		
		//ResultSet의 next() 메소드 사용해서 한 행씩 데이터 추출하고 출력
		//반복문 사용
		//next(): 다음 행이 있으면 true, 없으면 false반환
		while(rs.next()) {
			String bookNo = rs.getNString(1);
			String bookName = rs.getNString(2);
			String bookAuthor = rs.getNString(3);
			int bookPrice = rs.getInt(4);
			Date bookDate = rs.getDate(5);
			int bookStock = rs.getInt(6);
			String pubNo = rs.getNString(7);
			//한 행씩 출력
			System.out.format("%-10s\t %-25s\t %-10s %6d %13s\t %3d %10s",
					bookNo,bookName,bookAuthor,bookPrice,bookDate,bookStock,pubNo);
			
			
			System.out.println();
		}
		

		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnect.close(con, pstmt);
		}

	}

}
