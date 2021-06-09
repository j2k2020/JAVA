package ch16.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>(5);

		Book b1 = new Book("01", "Java입문편", "신용권", "20,000원", "2021-03-19", "서울출판사");
		Book b2 = new Book("02", "Java입문편", "신용권", "20,000원", "2021-03-19", "서울출판사");
		Book b3 = new Book("03", "Java입문편", "신용권", "20,000원", "2021-03-19", "서울출판사");
		Book b4 = new Book("04", "Java입문편", "신용권", "20,000원", "2021-03-19", "서울출판사");
		Book b5 = new Book("05", "Java입문편", "신용권", "20,000원", "2021-03-19", "서울출판사");

		// 출력형태
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
