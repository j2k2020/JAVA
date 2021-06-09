package ch08.sec07;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("bus가 굴러갑니다.");
	}
	
	
	//이 메소드를 사용하려면 강제 타입 변환을 해야지 사용이 가능!
	public void checkFare() {
		System.out.println("승차요금을 체크!");
	}

}