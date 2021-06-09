package ch16.sec03;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		
		phone.put("초등친구", 
				new String[] {"010-1111-1111","02-2222-2222","chodong@naver.com"});
		phone.put("고등친구", 
				new String[] {"010-1234-1234","02-3333-3333","abcd@naver.com"});
		phone.put("회사동기", 
				new String[] {"010-1234-1234","02-4444-4444","abcd@naver.com"});
		phone.put("회사상사", 
				new String[] {"010-1234-1234","02-5555-5555","abcd@naver.com"});
		phone.put("사장님", 
				new String[] {"abcd@naver.com"});


		System.out.println("총 그룹 수 = "+ phone.size());
		
		//내 연락처 모든 정보 조회
		Set<String> keys = phone.keySet();
		for(String key : keys) {
			System.out.println(key + " : ");
			String[] phonelist = phone.get(key);
			for (String one : phonelist) {
				System.out.print(one + " | ");
			}
			System.out.println();
		}
		
		//회사동기 검색해서 출력
		System.out.println("회사동기 검색:");
		if(phone.containsKey("회사동기")) {
			String[] phonelist = phone.get("회사동기");
			for(String one : phonelist) {
				System.out.println(one + " | ");
			}
		}
		
		System.out.println();
		
		//사장님 검색
		System.out.println("사장님 검색:");
		if(phone.containsKey("사장님")) {
			String[] phonelist = phone.get("010");
			for(String one : phonelist) {
				System.out.println(one + " | ");
			}
		}else {
			System.out.println("연락처 없음");
		}
	}

}
