package ch06.sec01;

import java.util.Scanner;

//정재은


public class ProductEx {
	public static void main(String[] args) {
		//인스턴스 객체 rec 생성
		Product prd = new Product();
		
		//input() 메소드 호출
		prd.inputPrdInfo(); //입력을 필드로 넘기는 메소드
		
		//area() 메소드 호출
		prd.showPrdInfo(); //저장된 데이터를 출력하는 메소드
		prd.salesAmount();
		prd.stockAmount();
		
	}

}
