package Test0323;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class BookDAO implements IBookDAO {

	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("������ ���� ���� ������ �Է��Ͽ����ϴ�.");
		System.out.println(dto);
		// BookDTO�� �޾Ƽ� DB�� �����ϴ� ����
		// dto�� �޾Ƽ� ���Ͽ� ����
		// dto �� �ʵ��� ���� �����ͼ� ������ �����ϰ�, �������� ���Ϸ� ����

		// dto ������ ���ڿ� ����
		String data = dto.getIsbn() 
				+ "\t" + dto.getTitle() 
				+ "\t" + dto.getAuthor() 
				+ "\t" + dto.getPrice() 
				+ "\t" + dto.getPublish_date() 
				+ "\t" + dto.getStock();

		// ���Ϸ� ����
		File file = new File("C:/test/book.txt");
		FileWriter fw;

		try {
			fw = new FileWriter(file, true); // true//append���(���� �߰�)
			fw.write(data + "\r\n");
			fw.flush();
			fw.close();

		} catch (IOException e) {
		}
	}

	@Override
	public Vector<BookDTO> selectAllBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(BookDTO dto) {
		// TODO Auto-generated method stub

	}

}
