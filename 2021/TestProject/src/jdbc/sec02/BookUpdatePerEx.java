package jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookUpdatePerEx {

	public static void main(String[] args) {
		// DB����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// ������ ���� ���� �Է�
		// ���� ���� �Է�
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ���� �����Ͻÿ�>>");
		System.out.print("������ ������ȣ �Է�:");
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

		try {
			con = DBConnect.getConnection();

			// sql�� �ۼ�: update����
			// update ���̺� set ���̸�= ��;
			String sql = "update book set bookName=?,bookAuthor=?,"
					+ "bookPrice=?,bookDate=?,bookStock=?,pubNo=? "
					+ "where bookNo=?";

			pstmt = con.prepareStatement(sql);

			// ���� �� �ڸ��� ?�� ó���ϰ� setXXX() �޼ҵ� ����ؼ� ������� �� ����
			pstmt.setString(1, bookName);
			pstmt.setString(2, bookAuthor);
			pstmt.setInt(3, bookPrice);
			pstmt.setString(4, bookDate);
			pstmt.setInt(5, bookStock);
			pstmt.setString(6, pubNo);
			pstmt.setString(7, bookNo);

			// insert,update,delete �������� executeUpdate() �޼ҵ� ���
			pstmt.executeUpdate();

			System.out.println("���� ���� ���� ����...");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBConnect.close(con, pstmt);
		}
	}

}