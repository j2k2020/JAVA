package ch08.sec03;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();
		/*
		 * 한국 타이어가 굴러갑니다. 
		 * 한국 타이어가 굴러갑니다. 
		 * 한국 타이어가 굴러갑니다. 
		 * 한국 타이어가 굴러갑니다.
		 */
		System.out.println("*****필드의 다형성*****");

		// 필드의 다형성
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		myCar.run();

	}

}
