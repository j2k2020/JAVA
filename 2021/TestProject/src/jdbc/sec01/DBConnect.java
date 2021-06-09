package jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	public static void main(String[] args) {
		try {
			//OracleDriverŬ������ ��ü ����: ��Ÿ�� �� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//���� �ּ�, ����� ����, �н����� ���ڿ��� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user= "JJEUSER2";
			String pwd="1234";
			
			//DB �����ϱ� ���� ��ü
			//DriverManager�� ���� Connection ��ü ����
			//getConnection() �޼ҵ� ȣ���ϰ� ��ü �޾ƿ� �ŰԺ���: url; user; pwd
			 
			Connection con = DriverManager.getConnection(url,user,pwd);
			
			//��ü�� �����Ǹ� DB���� ����
			if(con!=null) {
				System.out.println("sec01 DB���� ����");
			}
		}catch (Exception e) {
			System.out.println("�����߻�");
			 e.printStackTrace();
		}

	}

}