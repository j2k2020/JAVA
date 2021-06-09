package ch07.sec04.pack1;

//필드와 매소드의 접근 제한
//클래스 내부에서는 접근 제한과 상관없이 모든 필드와 매소드 사용 가능

public class AAA {
	// 필드
	public int field1;   // public 접근 제한
	int field2;          // default 접근 제한
	private int field3;  // private
	protected int field4; //protected

//클래스 ㄴㅐ부에서 접근 확인
	public AAA() {
		// 클래스 내부에서 접근 제한 없음
		field1 = 1;
		field2 = 2;
		field3 = 3;
		

		method1();
		method2();
		method3();
		
	}

//매소드
	public void method1() {
	} // public

	void method2() {
	} // default

	private void method3() {
	} // private
	
	protected void method4() {}

}
