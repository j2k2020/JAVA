package ch06.sec01;

public class CarEx2 {
	public static void main(String[] args) {
		//Car 클래스의 객체 생성
		Car2 c1 = new Car2();
		Car2 c2 = new Car2();
		Car2 c3 = new Car2();
		
		//인스턴스(객체): 필드의 값 저장
		//객체.필드
		//c1.carNo="11가 1234";
		//메소드를 호출: 필드 값을 추러력
		//객체.메소드()
		//c1.showCarInfo(11가 1234);
		System.out.println("-----------c1.----------");
		c1.setCarNo("1234");
		c1.setMyCar("리무진", "현대", 2018, 3000);
		c1.showCarInfo();
		
		System.out.println("-----------c2.----------");
		c2.setCarNo("1234");
		c2.setMyCar("리무진", "현대", 0,0 );
		c2.setCarYear(2011);
		c2.setCarCC(3400);
		c2.showCarInfo();
		
		System.out.println("-----------c3.----------");
		c3.setCarNo("234");
		c3.setCarName("리무진");
		c3.setCarMaker("현대");
		c3.setCarYear(2020);
		c3.setCarCC(3000);
		c3.showCarInfo();
		
		
	
		
		
		
		
		
	}

}
