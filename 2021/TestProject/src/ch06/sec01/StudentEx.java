package ch06.sec01;

import java.util.Scanner;

public class StudentEx {
	public static void main(String[] args) {
		//인스턴스 객체 rec 생성
		Student std = new Student();
		
		//input() 메소드 호출
	    std.input(); //입력을 필드로 넘기는 메소드
		
		//area() 메소드 호출
		std.area(); //저장된 데이터를 출력하는 메소드
		
	}

}
