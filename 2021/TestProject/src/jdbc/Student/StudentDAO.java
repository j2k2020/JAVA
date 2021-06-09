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
		// �ǽ� 1�� ���̺� ���ڵ尡 insert �ǵ��� ������ JDBC �ڵ�� ä�켼��.
		try {
			con = StudentTest.getConnection();
			if (con != null) {
				System.out.println("insert DB���� ����");
			} // DB���� ���� ����

			// �Էµ� ������ insert �۾� ����
			// ���� ������ ���� Statement ��ü ����
			Statement stmt = con.createStatement();

			// insert ������ �ۼ�
			String sql = String.format(
					"insert into student(" + "stdNo,stdName,stdDet,stdAddr,stdTel) values("
							+ "'%d','%s','%s','%s','%s')",
					studentDTO.stdNo, studentDTO.stdName, studentDTO.stdDet, studentDTO.stdAddr, studentDTO.stdTel);

			int result = stmt.executeUpdate(sql);

			// ������ ����(������ ���� ���� �� ��ȯ)
			if (result > 0) {
				System.out.println("�л� ���� ��� ����");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void printAllStudents() {
		// �ǽ� 1�� ���̺��� ��� ���ڵ尡 ��ȸ�ǰ� ��µǵ��� ������ JDBC �ڵ�� ä�켼��.

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = StudentTest.getConnection();

			String sql = "select*from student";// sql�� �ۼ�
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // select���������� executeQuery()�޼ҵ� ���

			System.out.println("**************studentDAO �л� ����**************");
			System.out.println("�й� \t ����\t �а�\t �ּ�\t ��ȭ��ȣ");

			// ResultSet�� next() �޼ҵ� ����ؼ� �� �྿ ������ �����ϰ� ���
			// �ݺ��� ��� / next(): ���� ���� ������ true, ������ false��ȯ->��ȯ�� void��ü�� ����
			while (rs.next()) {
				int stdNo = rs.getInt(1);
				String stdName = rs.getString(2);
				String stdDet = rs.getString(3);
				String stdAddr = rs.getString(4);
				String stdTel = rs.getString(5);

				// �� �྿ ���
				System.out.format("%d\t %s\t %s\t %s\t %s", stdNo, stdName, stdDet, stdAddr, stdTel);
				System.out.println();
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("�����߻�");
			e.printStackTrace();
		}

	}
}
