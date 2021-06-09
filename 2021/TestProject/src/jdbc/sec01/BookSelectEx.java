package jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;


public class BookSelectEx {

	public static void main(String[] args) {	
		// DB����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//db�ε�
			//�����ּ�
			/*String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "JJEUSER2";
			String pwd = "1234";*/
			//����̹� �޴����� getConnection�޼ҵ� ȣ��
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "JJEUSER2", "1234");			
			if (con != null) {
				System.out.println("DB���� ����");
			}
			/*DB���� ���� ����*/
			
			
			/*���� ����*/
			//Select�� ����ؼ� ���� ���� ��ȸ
			//������ ������ ���� Statement��ü ����
			//Connection �������̽��� createStatement() �޼ҵ带 ����ؼ� ��ü ����
			Statement stmt = con.createStatement(); //�������� ������ ��ü
			
			//select ������ �ۼ�
			String sql = "select*from Book order by bookNo";
			/*������ ����� �� �ܷ��� �޾ƿ�
			 * select �����̹Ƿ� executeQuery()�޼ҵ� ���
			 * ����� ResultSet��ü�� ��ȯ
			 */
			ResultSet rs = stmt.executeQuery(sql);
			
			//executeQuery() ���� ����� �޾ƿ� ResultSet���� ������ ����
			//ResultSet�� next()�޼ҵ带 �̿��ؼ� ������ Ŀ���� �������� �̵��ذ��� �� ���� �����͸� �������� ��
			//next() �޼ҵ�: Ŀ���� �̵��ϸ鼭 ���� �� ����
			//���� �࿡ ������ true��ȯ�ϰ�, ������ false��ȯ
			//��� ���� ���������� �ݺ����� ���
			//������ ����: ������ Ÿ�Կ� ���� getXXX() �޼ҵ� ���
			//���ڿ�: getString()
			//����: getInt()
			//��¥: getDate()
			
			System.out.println("**********sec1.BookSelectEx ���� ����**********");
			System.out.println("������ȣ \t\t������ \t\t\t���� \t���� \t������ \t\t��� \t���ǻ�");
			
			while(rs.next()) { //���� ���� �����Ѵٸ�
				//bookNo,bookName,bookAuthor,bookPrice, bookDate,bookStock, pubNo
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7);
				
				
				//�� �྿ ���
				System.out.format("%-10s\t %-25s\t %-10s %6d %13s\t %3d %10s",
						bookNo,bookName,bookAuthor,bookPrice,bookDate,bookStock,pubNo);
				
				
				System.out.println();
			}

		
		} catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		}//try���� End

	}

}