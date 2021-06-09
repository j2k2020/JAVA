package ch15.sec01;

//제네릭을 사용하지 않은 경우
//결제 타입 변환이 발생하는 것을 확인

public class BoxEx {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("홍길동"); //String -> Object로 자동 타입 변환 : object는 상위 저장공간이라서
		String name = (String) box.getObject(); // Object -> String으로 강제 타입 변환
		
		box.setObject(new Apple()); // Apple -> Object 자동 타입 변환
		Apple apple = (Apple)box.getObject(); //Object -> Apple 강제 타입 변환
		
		System.out.println(name);
		System.out.println(apple);
	}

	
}
