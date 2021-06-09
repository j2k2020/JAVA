package ch07.sec10;

public class InstanceOfEx {

	//원래 Child 객체가 Parent 타입으로 자동 타입 변환된 경우
	//다시 Child 타입으로 강제 타입 변환
	//수행하기 전에 객체 타입을 확인해서 예외가 발생하지 않게 하는 매소드
	public static void method1(Parent parent) {
		// 왼쪽의 객체가 오른쪽의 인스턴스이면 true
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("매소드1-Child변환 성공");
		} else {
			System.out.println("매소드1-Child변환되지 않음");
		}
	}

	//원래 Child 객체가 Parent 타입으로 자동 타입 변환된 경우
	//다시 Child 타입으로 강제 타입 변환
	//수행하기 전에 객체 타입을 확인하지 않음
	//Parent 객체 가 오더라도 그냥 강제 타입 변환을 수행하다고 오류 발생
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("매소드2-Child변환 성공");

	}

	public static void main(String[] args) {
		//강제 타입 변환이 가능한 parentA
		Parent parentA = new Child();
		method1(parentA); //객체 타입 확인 후 수행
		method2(parentA); //객체 타입 확인하지 않고 수행
		
		//강제 타입 변환이 가능한 parentB
		Parent parentB = new Parent();
		method1(parentB); //객체 타입 확인 후 수행 - 대상이 아님(변환되지 않음)
		method2(parentB); //예외발생 Parant가 변환 할 수 없다  //객체 타입 확인하지 않고 수행 - 대상이 아니니까 그대로 오류 발생

	}

}
