package ch16.sec02;

import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("jdbc");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBaTis");
		
		int size = set.size();
		System.out.println("�� ��ü ��: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String elememt= iterator.next(); // ��Ҹ� ������
			System.out.println("\t"+elememt);
			/*
			 * �� ��ü ��: 4 //java�� ���� ���̶� 1���θ� ����
	java
	jdbc
	Servlet/JSP
	iBaTis
	*/
			
		}
		set.remove("jdbc");
		System.out.println("remove �� �� ��ü ��: "+size);
		
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		set.clear(); //��� ��ü�� �����ϰ� ���
		if(set.isEmpty()) {
			System.out.println("set.clear()�� �� ���������~");
		}
		
	}

}
