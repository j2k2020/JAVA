package ch07.sec08;

public class Taxi extends Vehicle {

	@Override
	public void run() {
		System.out.println("택시가 달립니다.(택시라는 자식 클래스에서 재정의)");
	}

}
