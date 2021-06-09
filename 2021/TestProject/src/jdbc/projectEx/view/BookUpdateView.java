package jdbc.projectEx.view;

import java.sql.Connection;
import java.util.Scanner;

import jdbc.projectEx.controller.Controller;
import jdbc.projectEx.model.BookDTO;

public class BookUpdateView {
	Controller controller = Controller.getInstance();
	Scanner sc = new Scanner(System.in);
	
	public void updateBook() {
		System.out.println("���� ���� ����");
		
		// ��ü ���� ���
		BookListView bls = new BookListView();
		bls.getAllBook();
		
		
		System.out.print("������ ������ ������ȣ �Է� : ");
		String bookNo = sc.nextLine();
		
		System.out.print("������ �Է� : ");
		String bookName = sc.nextLine();
		
		System.out.print("���� �Է� : ");
		String bookAuthor = sc.nextLine();
		
		System.out.print("�������� �Է� : ");
		int bookPrice = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ �Է� : ");
		String bookDate = sc.nextLine();
		
		System.out.print("��� �Է� : ");
		int bookStock = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("���ǻ� ��ȣ �Է� : ");
		String pubNo = sc.nextLine();	
		
		// ��Ʈ�ѷ����� �Է¹��� ������ ����
		controller.update(new BookDTO(bookNo, bookName, bookAuthor,
				bookPrice, bookDate, bookStock, pubNo));
		
		sc.close();
	}
}







