package ch16.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>(5);

		Book b1 = new Book("01", "Java�Թ���", "�ſ��", "20,000��", "2021-03-19", "�������ǻ�");
		Book b2 = new Book("02", "Java�Թ���", "�ſ��", "20,000��", "2021-03-19", "�������ǻ�");
		Book b3 = new Book("03", "Java�Թ���", "�ſ��", "20,000��", "2021-03-19", "�������ǻ�");
		Book b4 = new Book("04", "Java�Թ���", "�ſ��", "20,000��", "2021-03-19", "�������ǻ�");
		Book b5 = new Book("05", "Java�Թ���", "�ſ��", "20,000��", "2021-03-19", "�������ǻ�");

		// �������
		// 1001
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book);

		}

	}

}
