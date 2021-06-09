package ch08.sec09;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB속에) MyClassB에서 재정의-method1(1) 실행");
	}

	//MyInerface의 메소드 재정의
	//추상 메소드는 필수로 재정의 해야 함(안 하면 오류)
	//디폴트 메소드는 선택적으로 재정의 할 수 있음(안 해도 오류 없음)
	
	//default 메소드 재정의
	@Override
	public void method2() {
		System.out.println("MyClassB속에) MyClassB에서 재정의 (디폴트 메소드)-method2()실행");
	}
	
	

}
