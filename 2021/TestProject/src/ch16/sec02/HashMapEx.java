package ch16.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		//map.put(key, value)
		map.put("홍길동", 100);
		map.put("이묭룡", 85);
		map.put("홍길동", 300);
		
		//키가 같으면 마지막에 저장한 값으로 대체(덮어쓰기)
		map.put("홍길동", 87);
		map.put("장녹수", 90);
		
		System.out.println("총 Entry수: "+map.size());
		System.out.println("총 hashCode: "+map.hashCode());
		System.out.println();
		
		
		//객체 찾기: 키(이름)로 값(점수)를 검색
		System.out.println("홍길동: "+ map.get("홍길동"));
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //Key set반환
		//반복해서 키를 얻고 값을 얻어오기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //key를 알아내서
			Integer value = map.get(key); //key로 value 얻어오기
		}
		System.out.println();
		
		//객체 삭제
		map.remove("홍길동"); //remove(key)
		System.out.println("remove후, 총 Entry수: "+map.size());
		
		//객체 전체 삭제
		map.clear();
		System.out.println("clear후, 총Entry수: "+map.size());
		

	}

}
