package ch16.sec01;

import java.util.ArrayList;

//ArraytList
//��׸� Ÿ���� �ƴ� ���

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);
		
		list.add(100); //intŸ�� �����͸� integerŸ������ Ÿ�� �ڵ� ��ȯ
		list.add(new Integer(200));
		list.add(2.5);
		list.add(new Double(3.14));
		list.add("�ڹ����α׷�");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		

	}

}
