package jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class BookInsertEx {

	public static void main(String[] args) {
		// DB����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "JJEUSER2";
			String pwd = "1234";
			Connection con = DriverManager.getConnection(url, user, pwd);			
			if (con != null) {
				System.out.println("DB���� ����");
			} // DB���� ���� ����
			
			//insert �۾� ����
			//���� ������ ���� Statement ��ü ����
			Statement stmt=con.createStatement();
			
			//insert ������ �ۼ�
			String sql = "insert into book values('202','�ڹ�','���ڹ�','%d','%s',5,'2')";
			
			//������ ����(������ ���� ���� �� ��ȯ)
			int result=stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("���� ���� ��� ����");
			}

		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}

	}

}
