package jdbc.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();

	private StudentDAO() {
	}

	public static StudentDAO getInstance() {
		return instance;
	}

	StudentTest stdTest = StudentTest.getInstance();
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement pstmt = null;

	public void insertStudent(StudentDTO studentDTO) throws Exception {
		// 실습 1번 테이블에 레코드가 insert 되도록 적당한 JDBC 코드로 채우세요.
		try {
			con = StudentTest.getConnection();
			if (con != null) {
				System.out.println("insert DB연결 성공");
			} // DB연결 과정 종료

			// 입력된 값으로 insert 작업 수행
			// 쿼리 전송을 위한 Statement 객체 생성
			Statement stmt = con.createStatement();

			// insert 쿼리문 작성
			String sql = String.format(
					"insert into student(" + "stdNo,stdName,stdDet,stdAddr,stdTel) values("
							+ "'%d','%s','%s','%s','%s')",
					studentDTO.stdNo, studentDTO.stdName, studentDTO.stdDet, studentDTO.stdAddr, studentDTO.stdTel);

			int result = stmt.executeUpdate(sql);

			// 쿼리문 실행(영향을 받은 행의 수 반환)
			if (result > 0) {
				System.out.println("학생 정보 등록 성공");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printAllStudents() {
		// 실습 1번 테이블의 모든 레코드가 조회되고 출력되도록 적당한 JDBC 코드로 채우세요.

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = StudentTest.getConnection();

			String sql = "select*from student";// sql문 작성
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // select구문에서는 executeQuery()메소드 사용

			System.out.println("**************studentDAO 학생 정보**************");
			System.out.println("학번 \t 성명\t 학과\t 주소\t 전화번호");

			// ResultSet의 next() 메소드 사용해서 한 행씩 데이터 추출하고 출력
			// 반복문 사용 / next(): 다음 행이 있으면 true, 없으면 false반환->반환은 void객체라서 생략
			while (rs.next()) {
				int stdNo = rs.getInt(1);
				String stdName = rs.getString(2);
				String stdDet = rs.getString(3);
				String stdAddr = rs.getString(4);
				String stdTel = rs.getString(5);

				// 한 행씩 출력
				System.out.format("%d\t %s\t %s\t %s\t %s", stdNo, stdName, stdDet, stdAddr, stdTel);
				System.out.println();
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류발생");
			e.printStackTrace();
		}

	}
}
