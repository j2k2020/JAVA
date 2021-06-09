package ch07.sec07;

public class ChildEx {

	public static void main(String[] args) {
		Child ch = new Child();
		
		//부모 클래스 타입 변수에 자식 클래스 객체를 대입
		Parent parent = ch; //자동 타입 변환 발생
		//Parent변수는 child객체를 참조하지만 
		//Parent맴버만 사용 가능
		
		//Parent 매소드 사용 가능
		parent.method1();
		
		//Child 객체를 참조하지만 Child 맴버는 사용할 수 없음 -> 호출 불가능
		//parent.method3();  //The method method3() is undefined for the type Parent 
	    
		//재정의 된 Child 매소드가 호출 됨
		parent.method2();
		//Parent 타입이므로 Parent 클래스의 method2()를 실행하려고 보니까 Child클래스에 재정의 되어 있는 것을 확인
		//그러면 부모 맴버를 호출하지 않고, 자식에 재정의된 맴버 매소드를 호출함.
   		

	}

}
