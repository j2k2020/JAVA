package ch07.sec08;

public class DriverEx {

	public static void main(String[] args) {
	Driver dr = new Driver();
	
	Bus bus =new Bus();
	Taxi taxi =new Taxi();
	
	//dr.drive(veh);  //veh cannot be resolved to a variable
	dr.drive(bus);
	dr.drive(taxi);

	}

}
