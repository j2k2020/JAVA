package ch08.sec08;

public class implementationC implements C {
//Interface C는 인터페이스 A와 B를 상속 받았으므로 인터페이스A,B의 추상 메소드를 재정의해서 메소드로 구현해야 함
	//구현하지 않으면 오류
	@Override
	public void methodA() {
		System.out.println("지금 implementationC 속에 메소드A입니다.");

	}

	@Override
	public void methodB() {
		System.out.println("지금 implementationC 속에 메소드B입니다.");

	}

	@Override
	public void methodC() {
		System.out.println("지금 implementationC 속에 메소드C입니다.");

	}

}
