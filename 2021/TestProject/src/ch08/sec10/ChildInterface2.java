package ch08.sec10;

//부모 인터페이스의 디폴트 메소드를 자식 인터페이스에서 활용하는 방법 
//2.디폴트 메소드를 재정의(Override)해서 실행 내용을 변경해서 사용      ----childInterface2

public interface ChildInterface2 extends ParentInterface {

	@Override
	default void method2() {
		System.out.println("ChildInterface2에서 재정의된 디폴트 메소드 method2() 실행");
	}
	
	public void method3();
	
	

}
