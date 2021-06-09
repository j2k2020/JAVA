package jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookDeletePreEx {

	public static void main(String[] args) {
		//DB연결
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//삭제할 도서 번호 입력
		Scanner sc = new Scanner(System.in);

		System.out.println("도서 정보 삭제하세요>>");
		System.out.print("삭제할 도서번호 입력:");
		// String bookNo= sc.next();
		String bookNo = sc.nextLine();
		
		
		//sql문 작성-쿼리 수행
		try {
			con = DBConnect.getConnection();

			// sql문 작성: update구문
			// update 테이블 set 열이름= 값;
			String sql = "delete from book where bookNo=?";
			
			pstmt = con.prepareStatement(sql);

			// 열의 값 자리에 ?로 처리하고 setXXX() 메소드 사용해서 순서대로 값 설정
			pstmt.setString(1, bookNo);
	
			// insert,update,delete 문에서는 executeUpdate() 메소드 사용
						pstmt.executeUpdate();

						System.out.println("도서 정보 삭제 성공...");

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					} finally {
						DBConnect.close(con, pstmt);
					}
				}

			}
