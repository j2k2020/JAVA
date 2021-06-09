package ch07.sec08;

public class Driver {
//매개변수 다형성
	// 매개값을 다양화하기 우해
	// 매개변수에 자식 타입 객체 허용
	// 자동타입 변환
	// bus 객체가 vehicle 타입으로
	// taxi 객체가 vehicle 타입으로
	public void drive(Vehicle veh) {
		veh.run();
		System.out.println(veh.toString());

		/*
		 * 버스가 달립니다.(자식 클래스에서 재정의) 
		 * ch07.sec08.Bus@15db9742 
		 * 택시가 달립니다.(택시라는 자식 클래스에서 재정의)
		 * ch07.sec08.Taxi@6d06d69c
		 */
	}

}
