package jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class StudentTest {

	private static StudentTest instance = new StudentTest(); // SingletonŬ����

	private StudentTest() { // �̱��� (Singleton) Ŭ���� : �� �ϳ��� ��ü�� ����
	}

	// �ܺο��� ȣ���ؼ� ��ü ������ �� �ֵ���
	// �ڽ��� ��ü (instance) ��ȯ
	public static StudentTest getInstance() {
		return instance;
	}

	private static Connection con;
	Scanner sc = new Scanner(System.in);
	// Connection ��ü �����ؼ� ��ȯ�ϴ� �޼ҵ�

	public static Connection getConnection() { // Connection ����
		try {
			// OracleDriver Ŭ������ ��ü ����: ��Ÿ�ӽ� �ε�
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// JDBC 4.0���� �ڵ� �ε�

			// ���� �ּ�,����� ����,�佺���� ���ڿ��� ����
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JJEUSER2", "1234");
		} catch (SQLException e) {
			System.out.println("DB���� ����");
			e.printStackTrace();
		}
		return con;
	}

// StudentTest Ŭ������ main �޼ҵ� ������ ���� ������ ���� ����� ��µǾ�� ��.
// 1 ȫ�浿 �����а� ���� 010-1111-1111
// 2 ��浿 ���а� ��õ 010-2222-2222
// 3 ���浿 �����а� ���� 010-3333-3333

	public static void main(String[] args) throws Exception {
		StudentDAO dao = StudentDAO.getInstance();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);

		try {
			con = StudentTest.getConnection();

			System.out.println("�л� ���� ���>>");

			System.out.print("�й� �Է�:");
			int strNo = sc.nextInt();
			sc.nextLine(); // �տ��� �Է��ϰ� ���� ģ ���, ���� ���� ���� ���� �ڵ� ����Ǵ� ��� �߻�
			System.out.print("�л��� �Է�: ");
			String strName = sc.next();
			System.out.print("�а� �Է�: ");
			String strDet = sc.next();
			System.out.print("�ּ� �Է�: ");
			String strAddr = sc.next();
			System.out.print("��ȭ��ȣ �Է�: ");
			String strTel = sc.next();
			dao.insertStudent(new StudentDTO(strNo, strName, strDet, strAddr, strTel));

			System.out.println("**************studentTest �л� ����**************");
			dao.printAllStudents();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
