package ch08.sec04;

public class Car {
	// 인터페이스 변수에 구현 객체 대입
	// 인터페이스 타입으로 자동 타입 변환 발생
	/*
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	*/
	
	//배열로 변경
	Tire[] tires = { new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire() };
	

	public void run() {
		// 인터페이스에 선언된 roll() 메소드 호출
		// HankookTire에 재정의된 roll()메소드 호출
		// 구현 객체에서 실행
		/*
		 * frontLeftTire.roll(); // Tire인터페이스는 추상메소드만->HankookTire에 재정의된 roll메소드에서 실행 된걸
		 * 출력 frontRightTire.roll(); 
		 * backLeftTire.roll(); 
		 * backRightTire.roll();
		 */
		
		//배열에서 for문 사용
		for(Tire tire: tires) {
			tire.roll();
			
			
		}

	}

}
