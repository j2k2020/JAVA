package ch16.sec02;

import java.util.*;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		Employee emp1 = new Employee("ȫ�浿");
		Employee emp2 = new Employee("������");
				Employee emp3 = new Employee("�ſ��");
				
				set.add(emp1);
				set.add(emp2);
				set.add(emp3);
				
				int size = set.size();
				System.out.println("�� ��ü: "+size );
				
				Iterator<Employee> iterator = set.iterator();
				while(iterator.hasNext()) {
					Employee elememt= iterator.next(); // ��Ҹ� ������
					System.out.println("\t"+elememt);
				}
		
		
	
		
		
		
		
		
	}

}
