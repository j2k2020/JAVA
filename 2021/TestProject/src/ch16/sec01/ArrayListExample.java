package ch16.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArrayListExample {

	public static void main(String[] args) {
	String max[];
	String world;
	
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<4; i++) {
		System.out.println("단어를 입력하세요>>");
		world=sc.next();
		max += world;
	}

	
	
	
		List<String> list = new ArrayList<String>();

		list.add("JAVA");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");

	}

}
