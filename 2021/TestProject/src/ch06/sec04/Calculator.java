package ch06.sec04;

//static(정적) 멤버 (필드와 메소드)
//클래스에 고정된 필드와 메소드
//클래스에 소속
//클래스 당 하나만 생성 가능
//모든 인스턴스 객체에서 공유 가능
/*
 * 프로그램이 시작될 때 이미 생성 *(객체 보다 먼저 생성 )
 * 프로그래밍 종류될 때 사라짐
 * 클래스 이름.필드
 * 클래스 */
public class Calculator {
	//static 필드
	//일반적으로 값을 초기화해서 사용
	static double pi=3.14159;
	
	
	//static 메소드
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
	
	

}
