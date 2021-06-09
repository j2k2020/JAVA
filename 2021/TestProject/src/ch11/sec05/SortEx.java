package ch11.sec05;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		
		//정수형 배열 정렬
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"] = "+scores[i]);
		}
		System.out.println();
		
		//문자열 배열 정렬
		String[] names = {"홍길동","이몽롱","성춘향"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"] = "+names[i]);
		}
		System.out.println();
		
		//사용자 정의 클래스 배열 정ㄹ렬
		//(Comparable 인터페이스를 구현해야만 하는 정렬 가능)
		Member m1 = new Member("홍길동");
		Member m2 = new Member("이몽롱");
		Member m3 = new Member("성춘향");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("members["+i+"].name = "+members[i].name);
		}

	}

}


















