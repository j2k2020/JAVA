package ch08.sec04;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();
	
		myCar.tires[0]=new HankookTire();
		myCar.tires[1]=new HankookTire();
		
		myCar.run();
		
		
		

	}

}
