package jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookInsertPreEx {

	public static void main(String[] args) {
		// DB ���� Ȯ��
		Connection con = DBConnect.getConnection();
		PreparedStatement pstmt = null;
		if (con != null) {
			System.out.println("DB���� ����.");
		}
		/* DB����Ϸ� */

		// ���� ���� �Է�
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ������ ����Ͻÿ�>>");
		System.out.print("������ȣ �Է�:");
		// String bookNo= sc.next();
		String bookNo = sc.nextLine();

		System.out.print("������ �Է�:");
		// String bookName= sc.next();
		String bookName = sc.nextLine();

		System.out.print("���� �Է�:");
		// String bookAuthor= sc.next();
		String bookAuthor = sc.nextLine();

		System.out.print("�������� �Է�:");
		// int bookPrice= sc.nextInt();
		int bookPrice = sc.nextInt();

		sc.nextLine();
		System.out.print("���� ������ �Է�:");
		// Date bookDate = sc.next();
		String bookDate = sc.nextLine();

		System.out.print("������� �Է�:");
		// int bookStock = sc.nextInt();
		int bookStock = sc.nextInt();

		sc.nextLine();
		System.out.print("���ǻ��ȣ �Է�:");
		// String pubNo = sc.next();
		String pubNo = sc.nextLine();

		// insert ������ ����
		// sql�� �ۼ�
		// PreparedStatement���
		// ���� �� �ڸ��� '?'�� ���� - ���ε� ����
		try {
			String sql = "insert into book values(?,?,?,?,?,?,?)";

			// ������ ������ ���� PreparedStatement��ü ����
			pstmt = con.prepareStatement(sql);

			// ���ε� ������ ������ ?�� ������ ��ġ�ؾ� ��
			// ������ Ÿ�Կ� ���� ����Ǿ�� �ϱ� ������ ���۹�ȣ�� 1����
			// ���ε� ������ ���� �����ϱ� ���ؼ��� setXXX()�޼ҵ� ���
			// bookNo,bookName,bookAuthor,bookPrice, bookDate,bookStock, pubNo
			pstmt.setString(1, bookNo);
			pstmt.setString(2, bookName);
			pstmt.setString(3, bookAuthor);
			pstmt.setInt(4, bookPrice);
			pstmt.setString(5, bookDate);
			pstmt.setInt(6, bookStock);
			pstmt.setString(7, pubNo);

			// insert,update,delete �������� executeUpdate() �޼ҵ� ���
			pstmt.executeUpdate();

			System.out.println("���� ���� ��� ����.");

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			DBConnect.close(con, pstmt);
		}

		
	}

}
