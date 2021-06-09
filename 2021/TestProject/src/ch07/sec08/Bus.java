package ch07.sec08;

public class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.(자식 클래스에서 재정의)");
	}
	
	

}
