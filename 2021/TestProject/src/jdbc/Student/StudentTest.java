package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class StudentTest {

	private static StudentTest instance = new StudentTest(); // Singleton클래스

	private StudentTest() { // 싱글톤 (Singleton) 클래스 : 단 하나의 객체만 생성
	}

	// 외부에서 호출해서 객체 생성할 수 있도록
	// 자신의 객체 (instance) 반환
	public static StudentTest getInstance() {
		return instance;
	}

	private static Connection con;
	Scanner sc = new Scanner(System.in);
	// Connection 객체 생성해서 반환하는 메소드

	public static Connection getConnection() { // Connection 생성
		try {
			// OracleDriver 클래스의 객체 새성: 런타임시 로드
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// JDBC 4.0부터 자동 로드

			// 연결 주소,사용자 계정,페스워드 문자열로 설정
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JJEUSER2", "1234");
		} catch (SQLException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
		return con;
	}

// StudentTest 클래스의 main 메소드 실행을 통해 다음과 같은 결과가 출력되어야 함.
// 1 홍길동 국문학과 서울 010-1111-1111
// 2 고길동 수학과 인천 010-2222-2222
// 3 나길동 영문학과 제주 010-3333-3333

	public static void main(String[] args) throws Exception {
		StudentDAO dao = StudentDAO.getInstance();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		try {
			con = StudentTest.getConnection();

			System.out.println("학생 정보 등록>>");

			System.out.print("학번 입력:");
			int strNo = sc.nextInt();
			sc.nextLine(); // 앞에서 입력하고 엔터 친 결과, 엔터 값이 다음 값을 자동 저장되는 경우 발생
			System.out.print("학생명 입력: ");
			String strName = sc.next();
			System.out.print("학과 입력: ");
			String strDet = sc.next();
			System.out.print("주소 입력: ");
			String strAddr = sc.next();
			System.out.print("전화번호 입력: ");
			String strTel = sc.next();
			dao.insertStudent(new StudentDTO(strNo, strName, strDet, strAddr, strTel));

			System.out.println("**************studentTest 학생 정보**************");
			dao.printAllStudents();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
