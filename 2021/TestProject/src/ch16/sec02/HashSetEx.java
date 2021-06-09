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
		System.out.println("총 객체 수: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String elememt= iterator.next(); // 요소를 가져옴
			System.out.println("\t"+elememt);
			/*
			 * 총 객체 수: 4 //java는 같은 글이라서 1개로만 계산됨
	java
	jdbc
	Servlet/JSP
	iBaTis
	*/
			
		}
		set.remove("jdbc");
		System.out.println("remove 후 총 객체 수: "+size);
		
		for(String element : set) {
			System.out.println("\t"+element);
		}
		
		set.clear(); //모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("set.clear()로 다 비워버려라~");
		}
		
	}

}
