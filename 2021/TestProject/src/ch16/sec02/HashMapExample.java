package ch16.sec02;

import java.util.HashMap;
import java.util.Scanner;

class Word {
	private String Korea;
	public Word( String korea) {
		Korea = korea;
	}
	public String getKorea() {
		return Korea;
	}
	
}
public class HashMapExample {
	public static void main(String[] args) {
		/*
		 * Map<String, String> map = new HashMap<String,String>();
		 * 
		 * map.put("apple","���"); map.put("summer","����"); map.put("candy","����");
		 * map.put("school","�б�"); map.put("water","��"); map.put("exit","����");
		 */
		
		HashMap map = new HashMap();
		map.put("apple", new Word("���"));
		map.put("summer", new Word("����"));
		map.put("candy", new Word("����"));
		map.put("school", new Word("�б�"));
		map.put("water", new Word("��"));
		map.put("exit", new Word("����"));
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("�����մϴ�..");
				break;
			}
			
			String eng = map.get();
			System.out.println(map);
			if(name.equals(""))
			
		}
		
	}

}
