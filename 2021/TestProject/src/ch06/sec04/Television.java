package ch06.sec04;

//static 초기화 블록
//클래스가 메소드 영역(static영역)으로 로딩될 때 처음으로 실행하는 블록
//여러개가 선언되면 선언된 순서대로 실행

public class Television {
	static String company = "Samsung";
	static String model ="LED TV";
	static String info;
	
	static {
		info = company+"-"+model;
	}

}
