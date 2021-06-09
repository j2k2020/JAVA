package ch08.sec06;

public class VehicleEx {

	public static void main(String[] args) {
		
		//인터페이스 변수에 Bus 객체 대입
		//Vehicle 타입으로 자동 타입 변환 발생
		Vehicle vehicle = new Bus();
		
		//Vehicle타입이므로 Vehicle멤버만 사용 가능
		System.out.print("자동타입변환: ");
		vehicle.run();
		
		//Vehicle 타입으로 자동 변환되었기 때문에
		//Bus 멤버 사용 불가
		//vehicle.checkFare() 사용불가(x)
		
		//Bus멤버를 사용하려면 다시 타입 변환 - 강제 타입 변환
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		//모든 부모 객체가 강제 타입 변환으로 사용할 수 있지 않다. 먼저 자동변환 되었던 것만 강제 타입 변환으로 사용 가능하다.	
	}
}
