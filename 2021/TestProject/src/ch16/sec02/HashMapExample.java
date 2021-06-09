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
		 * map.put("apple","사과"); map.put("summer","여름"); map.put("candy","사탕");
		 * map.put("school","학교"); map.put("water","물"); map.put("exit","종료");
		 */
		
		HashMap map = new HashMap();
		map.put("apple", new Word("사과"));
		map.put("summer", new Word("여름"));
		map.put("candy", new Word("사탕"));
		map.put("school", new Word("학교"));
		map.put("water", new Word("물"));
		map.put("exit", new Word("종료"));
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String name = sc.next();
			if(name.equals("exit")) {
				System.out.println("종료합니다..");
				break;
			}
			
			String eng = map.get();
			System.out.println(map);
			if(name.equals(""))
			
		}
		
	}

}
