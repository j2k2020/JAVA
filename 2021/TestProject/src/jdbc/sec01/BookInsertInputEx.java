package jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class BookInsertInputEx {

	public static void main(String[] args) {
		//����� ���� ���� �Է� 
		Scanner sc = new Scanner(System.in);
		//������ȣ~���ǻ��ȣ���� �Է� �ޱ�
		
		System.out.println("���� ������ ����Ͻÿ�>>");
		
		System.out.print("������ȣ �Է�:");
		//String bookNo= sc.next();
		String bookNo= sc.nextLine();
		
		System.out.print("������ �Է�:");
		//String bookName= sc.next();
		String bookName= sc.nextLine();
		
		System.out.print("���� �Է�:");
		//String bookAuthor= sc.next();
		String bookAuthor= sc.nextLine();
		
		System.out.print("�������� �Է�:");
		//int bookPrice= sc.nextInt();
		int bookPrice= sc.nextInt();
		
		sc.nextLine();
		System.out.print("���� ������ �Է�:");
		//Date bookDate = sc.next();
		String bookDate = sc.nextLine();
		
		System.out.print("������� �Է�:");
		//int bookStock = sc.nextInt();
		int bookStock = sc.nextInt();
		
		sc.nextLine();
		System.out.print("���ǻ��ȣ �Է�:");
		//String pubNo = sc.next();
		String pubNo = sc.nextLine();
		
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
			
			//�Էµ� ������ insert �۾� ����
			//���� ������ ���� Statement ��ü ����
			Statement stmt=con.createStatement();
			
			//String sql=String.format(insert in book(�� ����Ʈ) values(���� ������)", ���� ����Ʈ);
			
			
			//insert ������ �ۼ�
			String sql = String.format("insert into book(bookNo,bookName,bookAuthor,"
					+ "bookPrice, bookDate,bookStock, pubNo) "
					+ "values('%s','%s','%s','%d','%s','%d','%s')"
					,bookNo,bookName,bookAuthor,bookPrice, bookDate,bookStock, pubNo);
			
			int result=stmt.executeUpdate(sql);
			
			
			//������ ����(������ ���� ���� �� ��ȯ)
			if(result > 0) {
				System.out.println("���� ���� ��� ����");
			}
			
			
			
			
		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}

	}

}
