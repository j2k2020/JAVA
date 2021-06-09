package ch06.sec01;

public class CarEx {
	public static void main(String[] args) {
		//Car 클래스의 객체 생성
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		//인스턴스(객체): 필드의 값 저장
		//객체.필드
		//c1.carNo="11가 1234";
		//메소드를 호출: 필드 값을 추러력
		//객체.메소드()
		//c1.showCarInfo(11가 1234);
		c1.setCarNo("1234");
		c1.showCarInfo();
		
		//c2.carNo="22가 1234";
		//c2.showCarInfo("22가 1234");
		
		//c3.carNo="33가 1234";
		//c3.showCarInfo("33가 1234");
		
		
		
		
		
		
	}

}
