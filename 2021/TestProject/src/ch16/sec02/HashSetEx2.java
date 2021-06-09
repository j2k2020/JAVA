package ch16.sec02;

import java.util.*;

public class HashSetEx2 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		Employee emp1 = new Employee("È«±æµ¿");
		Employee emp2 = new Employee("À¯»óÁØ");
				Employee emp3 = new Employee("½Å¿ë±Ç");
				
				set.add(emp1);
				set.add(emp2);
				set.add(emp3);
				
				int size = set.size();
				System.out.println("ÃÑ °´Ã¼: "+size );
				
				Iterator<Employee> iterator = set.iterator();
				while(iterator.hasNext()) {
					Employee elememt= iterator.next(); // ¿ä¼Ò¸¦ °¡Á®¿È
					System.out.println("\t"+elememt);
				}
		
		
	
		
		
		
		
		
	}

}
