package jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class BookEx {

	public static void main(String[] args) {
		// 2021�� ���� ����� ������ ���
		//���� �̸��� '�浿'�� ���� ���� �˻�
		//������ 30000�̻��� ���� �˻�
		//�� ���� �Ǽ� ���
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DBConnect.getConnection();
			
			System.out.println("�������� ��ȸ");
			
			//sql�� �ۼ�
			String sql="select*from book where extract(YEAR FROM bookdate)='2021'";
			//String sql="select*from book WHERE bookAuthor like '%�浿%' order by bookNo";
			//String sql="select*from book WHERE bookPrice >=30000 order by bookNo";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery(); //select����������  executeQuery()�޼ҵ� ���
			
			System.out.println("\t**********���� ����**********\t");
			System.out.println("������ȣ \t\t������ \t\t\t���� \t���� \t������ \t\t��� \t���ǻ�");
			
			
			//ResultSet�� next() �޼ҵ� ����ؼ� �� �྿ ������ �����ϰ� ���
			//�ݺ��� ���
			//next(): ���� ���� ������ true, ������ false��ȯ
			while(rs.next()) {
				String bookNo = rs.getNString(1);
				String bookName = rs.getNString(2);
				String bookAuthor = rs.getNString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getNString(7);
				//�� �྿ ���
				System.out.format("%-10s\t %-25s\t %-10s %6d %13s\t %3d %10s",
						bookNo,bookName,bookAuthor,bookPrice,bookDate,bookStock,pubNo);
				
				
				
				
				/*String sql="select sum(bookStock) from book";
				pstmt = con.prepareStatement(sql);
				rs=pstmt.executeQuery(); //select����������  executeQuery()�޼ҵ� ���
				
				System.out.println("�� ���� ����");

				while(rs.next()) {
					int bookStock = rs.getInt(1);
					//�� �྿ ���
					System.out.format("%3d",bookStock);
				*/
				System.out.println();
			}
			
			
			
			
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			DBConnect.close(con, pstmt);
		}

	}

}
