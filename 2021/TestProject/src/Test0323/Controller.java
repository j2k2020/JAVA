package Test0323;

import java.util.Vector;

public class Controller {
	//�̱���(Singleton)Ŭ����: �� �ϳ��� ��ü�� ����
	private static Controller instance = new Controller();
	
	//new �����ڷ� ������ ȣ���� �� ������ ����
	private Controller() {}
	
	//�ܺο��� ȣ���ؼ� ��ü ������ �� �ֵ���
	//�ڽ��� ��ü (instance)��ȯ
	public static Controller getInstance() {
		return instance;
	}
	
	
	//���� ���� �Է� �޴� BookInsert Ŭ�������� ȣ�� �ϰ�
	//�Էµ� ������ ����
	//���޹��� �����͸� BookDTO�� ��Ƽ� BookDAO���� ����
	//(�׷��� BookDATO�� db�� �����ϵ���, ���Ϸ� ����)
	public void insert(Vector<String> v) {
		BookDTO dto = new BookDTO();
		BookDAO dao = new BookDAO();
		
		//���޹��� Vector ���� BookDTO�� ����
		dto.setIsbn(v.get(0));
		dto.setTitle(v.get(1));
		dto.setAuthor(v.get(2));
		dto.setPrice(Integer.parseInt(v.get(3)));
		dto.setPublish_date(v.get(4));
		dto.setStock(Integer.parseInt(v.get(5)));
		
		//BookDAO Ŭ������ insert() ȣ��: dto ����
		dao.insertBook(dto);
		
	}
	

}
