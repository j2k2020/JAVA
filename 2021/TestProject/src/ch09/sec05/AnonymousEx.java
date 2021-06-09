package ch09.sec05;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous ano = new Anonymous();
		
		
		System.out.println("-------익명 객체 필드 사용------");
		ano.field.wake();
		//wake(): 부모 타입의 재정의된 메소드는 field필드 사용해서 외부에서 호출 가능
		
		System.out.println("-------익명 객체 로컬 변수 사용------");
		ano.method1();
		
		
		System.out.println("-------매개값으로 익명 자식 객체 사용------");
		ano.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});

	}

}
