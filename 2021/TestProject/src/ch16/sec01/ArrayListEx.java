package ch16.sec01;

import java.util.ArrayList;

//ArraytList
//재네릭 타입이 아닌 경우

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		
		list.add(100); //int타입 데이터를 integer타입으로 타입 자동 변환
		list.add(new Integer(200));
		list.add(2.5);
		list.add(new Double(3.14));
		list.add("자바프로그램");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		

	}

}
