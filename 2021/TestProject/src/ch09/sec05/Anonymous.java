package ch09.sec05;
//익명 자식 객체 생성

//인터페이스 타입으로 필드나 변수를 선언하고 구현객체를 초기값으로 대입
public class Anonymous {
	//부모 클래스 타입의 필드에 초기값으로 대입
	Person field = new Person() { //익명 자식 객체 생성: 부모 타입(Person) -> 부모 멤버만 사용
		void work() { //외부에서 호출하지 못하고, 재정의된 부모 타입의 work()에서 호출 가능
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	//로컬 변수 선언하고 익명 자식 객체로 초기화
	void method1() {
		//로컬 변수 값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
			System.out.println("5시에 일어납니다.");
			walk();
			}
		};
		localVar.wake();
	}
	
	
	
	//매개변수를 이용해서 익명 자식 객체 대입
	void method2(Person person) {
		person.wake();
	}
	
}
