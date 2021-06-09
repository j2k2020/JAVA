package ch07.sec05;

public class SuperAirplaneEx {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode=SuperAirplane.SUPERSONIC; //static 상수는 앞에 클래스 이름을 붙여야 됨 -> SuperAirplane.SUPERSONIC 
		sa.fly();
		
		sa.flyMode=SuperAirplane.NORMAL;
		sa.fly();
		
		sa.land();

	}

}
