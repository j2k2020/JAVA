package ch15.sec02;

//제네릭을 사용하지 않은 경우
//결제 타입 변환이 발생하는 것을 확인

public class BoxEx {
	public static void main(String[] args) {
		//구체적 타입 지정: String
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		
	}

	
}
