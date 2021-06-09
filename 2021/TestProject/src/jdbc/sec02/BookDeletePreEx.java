package jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookDeletePreEx {

	public static void main(String[] args) {
		//DB����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//������ ���� ��ȣ �Է�
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ���� �����ϼ���>>");
		System.out.print("������ ������ȣ �Է�:");
		// String bookNo= sc.next();
		String bookNo = sc.nextLine();
		
		
		//sql�� �ۼ�-���� ����
		try {
			con = DBConnect.getConnection();

			// sql�� �ۼ�: update����
			// update ���̺� set ���̸�= ��;
			String sql = "delete from book where bookNo=?";
			
			pstmt = con.prepareStatement(sql);

			// ���� �� �ڸ��� ?�� ó���ϰ� setXXX() �޼ҵ� ����ؼ� ������� �� ����
			pstmt.setString(1, bookNo);
	
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
