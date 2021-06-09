package Test0323;

import java.util.ArrayList;
import java.util.List;

class Car {
	public void fuel() {
		System.out.println("자동차");
	};
}

class GasolineCar extends Car {
	public void fuel() {
		System.out.println("휘발유");
	};

}

class DisselCar extends Car {

	public void fuel() {
		System.out.println("경유");
	};

}

class VehicleList{
	
}
public class GenericEx {

}
