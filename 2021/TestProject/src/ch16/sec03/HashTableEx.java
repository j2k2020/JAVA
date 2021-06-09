package ch16.sec03;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String String>();
		
		//id와 비밀번호 미리 저장
		map.put("spring","1234");
		map.put("spring","1234");
		map.put("spring","1234");
		map.put("spring","1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요.");
			System.out.println("아이디:");
			String password = sc.nextLine();
			
		}
		
	}

}
