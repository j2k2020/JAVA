package Test0323;

import java.util.Scanner;
import java.util.Vector;

//���� ������ �Է� �޾Ƽ� Vector�� ��Ƽ� Controller���� �����Ѵ� ����

public class BookInsert {
	//Controller Ŭ������ �̱����̹Ƿ� getInstance() ȣ���ؼ� �ν��Ͻ� ����
	Controller controller = Controller.getInstance();
	Scanner sc = new Scanner(System.in);
	
	//������ �Է�
	public void insert() {
		String isbn, title, author, publish_date, price, stock;
		
		System.out.println("\n******************************");
		System.out.println("���� ���� ���");
		System.out.println("******************************");
		
		System.out.println("������ȣ �Է�: ");
		isbn = sc.next();
		//�տ��� �Է��ϰ� ���� ģ ���, ���� ���� ���� ���� �ڵ� ����Ǵ� ��� �߻�
		
		sc.nextLine();
		
		System.out.println("������ �Է�: ");
		title = sc.next();
		
		System.out.println("���� �Է�: ");
		author = sc.next();
		
		System.out.println("��¥ �Է�: ");
		publish_date = sc.next();
		
		System.out.println("���� �Է�: ");
		price = sc.next();
		
		System.out.println("��� �Է�: ");
		stock = sc.next();
		
		System.out.println("******************************");
		
		//Vector�� ����
		Vector<String> v = new Vector<String>();
		v.add(isbn);
		v.add(title);
		v.add(author);
		v.add(price);
		v.add(publish_date);
		v.add(stock);
		
		//Controller���� �Է� ���� ������ ����
		controller.insert(v);
		sc.close();
	}

}
