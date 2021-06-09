package ch16.sec02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	private static void printTime(List<String> list) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			list.add(0, String.valueOf(i));
		}

		long endTime = System.nanoTime();

		System.out.println(endTime - startTime);

	}

	public static void main(String[] args) {
		List<String> listArrayList = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();

		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		
		System.out.print("List-ArrayList: ");
		printTime(listArrayList);
		
		System.out.print("list-LinkedList: ");
		printTime(listLinkedList);
		
		System.out.print("ArrayList: ");
		printTime(arrayList);
		
		System.out.print("linkedList: ");
		printTime(linkedList);
		
		
		

	}

}
