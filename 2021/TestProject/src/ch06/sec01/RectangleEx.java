package ch06.sec01;

import java.util.Scanner;

public class RectangleEx {
	public static void main(String[] args) {
		//인스턴스 객체 rec 생성
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		
		//input() 메소드 호출
		r1.input();
		r2.input();
		
		//area() 메소드 호출
		r1.area();
		r2.area();
		
		System.out.println("r1:"+r1);
		System.out.println("r2:"+r2);
	}

}
