package ch07.sec05;

public class SuperAirplaneEx {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();
		
		sa.takeOff();
		sa.fly();
		
		sa.flyMode=SuperAirplane.SUPERSONIC; //static ����� �տ� Ŭ���� �̸��� �ٿ��� �� -> SuperAirplane.SUPERSONIC 
		sa.fly();
		
		sa.flyMode=SuperAirplane.NORMAL;
		sa.fly();
		
		sa.land();

	}

}
