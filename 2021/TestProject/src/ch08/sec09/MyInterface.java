package ch08.sec09;

public interface MyInterface {
	public void method1(); //추상 메소드
	//새로운 메소드 추가 필요
	//cntkd apthemfh cnrkgkaus rlqhsdp 이 인터페이스를 구현한 클래스에서
	//새로 추가된 모든 추상 메소드를 재정의해야 함(안 하면 오류)
	//public void method2(); //추상 메소드를 추가하지 않고
	
	//디폴트 메소드 추가
	//디폴트 메소드는 바디가 있음
	public default void method2() {
		System.out.println("MyInferface-method2()실행");
	}

}
