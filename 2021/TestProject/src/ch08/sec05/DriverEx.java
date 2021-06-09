package ch08.sec05;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus =new Bus();
		Taxi taxi = new Taxi();
		
		//매개변수의 다형성
		driver.drive(bus); //자동 타입 변환: Vehicle vehicle타입에 = bus; 버스가 들어가 있음
		driver.drive(taxi); //자동 타입 변환 Vehicle vehicle타입에 = taxi; 버스가 들어가 있음
		//driver.drive(vehicle); //불가능!
	}

}
