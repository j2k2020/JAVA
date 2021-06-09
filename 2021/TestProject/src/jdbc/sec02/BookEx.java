package jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class BookEx {

	public static void main(String[] args) {
		// 2021년 이후 발행된 도서만 출력
		//저자 이름에 '길동'이 들어가는 도서 검색
		//가격이 30000이상인 도서 검색
		//총 도서 권수 출력
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBConnect.getConnection();
			
			System.out.println("도서정보 조회");
			
			//sql문 작성
			String sql="select*from book where extract(YEAR FROM bookdate)='2021'";
			//String sql="select*from book WHERE bookAuthor like '%길동%' order by bookNo";
			//String sql="select*from book WHERE bookPrice >=30000 order by bookNo";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery(); //select구문에서는  executeQuery()메소드 사용
			
			System.out.println("\t**********도서 정보**********\t");
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
				
				
				
				
				/*String sql="select sum(bookStock) from book";
				pstmt = con.prepareStatement(sql);
				rs=pstmt.executeQuery(); //select구문에서는  executeQuery()메소드 사용
				
				System.out.println("총 도서 수량");

				while(rs.next()) {
					int bookStock = rs.getInt(1);
					//한 행씩 출력
					System.out.format("%3d",bookStock);
				*/
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
