package ch08.sec08;

public class Example {

	public static void main(String[] args) {
		implementationC impl = new implementationC();
		
		A interA = impl; //자동 타입 변환
		//A타입이므로 멤버만 사용 가능
		System.out.println("******인터페이스 A*******");
		interA.methodA(); //A의 멤버 methodA()만 호출 가능
		//B,C사용불가
		
		System.out.println("******인터페이스 B*******");
		B interB = impl;
		interB.methodB();
		interA.methodA();
		
		System.out.println("******인터페이스 C*******");
		C interC = impl;
		interC.methodA();
		interC.methodB();
		interC.methodC();
		interA.methodA();
		interB.methodB();

	}

}
