package jdbc.projectEx.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Vector;

import jdbc.sec02.DBConnect;

public class BookDAO implements IBookDAO {

	@Override
	public Vector<BookDTO> getAllBook() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Vector<BookDTO> dataSet =null;
		
		try {
			con = DBConnect.getConnection();
			
			String sql = "select * from book order by bookNo";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); 
			
			dataSet  = new Vector<BookDTO>();
			
			// select ��� ResulSet���� �� �྿ �����ؼ�
			//BookDTO�� ��� Vector�� �߰�
			while(rs.next()) {
				dataSet.add(new BookDTO(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),  
						rs.getInt(4), 
						rs.getDate(5).toString(), // YYYY-MM-DD�� ��� (���� �ð� ����)
						rs.getInt(6),
						rs.getString(7)));
			}
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally {
			DBConnect.close(con, pstmt, rs);
		}		
				
		return dataSet;
	}

	@Override
	public boolean insert(BookDTO dto) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DBConnect.getConnection();
			
			String sql = "insert into book values (?, ?, ?, ?, ?, ?, ?)";
			
			// ������ ������ ���� PreparedStatement ��ü ����
			pstmt = con.prepareStatement(sql);
			
			// ���ε� ������ ������ ?�� ������ ��ġ�ؾ� ��
			// ������ Ÿ�Կ� ���� ����Ǿ�� �ϱ� ����
			// ���۹�ȣ�� 1����
			// ���ε� ������ ���� �����ϱ� ���ؼ��� setXXX() �޼ҵ� ���
			pstmt.setString(1, dto.getBookNo());
			pstmt.setString(2, dto.getBookName());
			pstmt.setNString(3, dto.getBookAuthor());
			pstmt.setInt(4, dto.getBookPrice());
			pstmt.setString(5, dto.getBookDate());
			pstmt.setInt(6, dto.getBookStock());
			pstmt.setString(7, dto.getPubNo());			
			
			// insert, update, delete �������� executeUpdate() �޼ҵ� ���
			int result = pstmt.executeUpdate();
			
			if(result == 0) {
				return false;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
			// ȣ���� �ʿ��� ���ܸ� ó���϶�� ���ܸ� ���������� �߻���Ŵ
			// ��Ʈ�ѷ����� ���ܸ� ó���ؼ� ����ڿ��� ������ �޽��� ����
		} finally {
			DBConnect.close(con, pstmt);
		}
		
		
		return true;
	}

	@Override
	public boolean update(BookDTO dto) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;		
		
		try {
			con = DBConnect.getConnection();
						
			String sql = "update book set bookName=?, bookAuthor=?, "
		 			 + "bookPrice=?, bookDate=?, bookStock=?, pubNo=? "
		 			 + "where bookNo=?";

			pstmt = con.prepareStatement(sql);

			// ���� �� �ڸ��� ?�� ó���ϰ� setXXX() �޼ҵ� ����ؼ� ������� �� ����
			pstmt.setString(1, dto.getBookName());
			pstmt.setString(2, dto.bookAuthor);
			pstmt.setInt(3, dto.getBookPrice());
			pstmt.setString(4, dto.getBookDate());
			pstmt.setInt(5, dto.getBookStock());
			pstmt.setString(6, dto.getPubNo());
			pstmt.setString(7, dto.getBookNo());
			
			int result = pstmt.executeUpdate(); //insert, update, delete 
						
			if (result == 0) {
				return false;
			}			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally {
			DBConnect.close(con, pstmt);
		}
		
		
		return true;
	}

	@Override
	public boolean delet(BookDTO dto) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;		
		
		try {
			con = DBConnect.getConnection();
			
			String sql = "delete book where bookNo=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBookNo());
			
			int result = pstmt.executeUpdate();
			
			if(result == 0) {
				return false;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		} finally {
			DBConnect.close(con, pstmt);
		}
		
		return true;
	}

}



