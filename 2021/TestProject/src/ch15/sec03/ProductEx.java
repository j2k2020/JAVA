package ch15.sec03;

public class ProductEx {

	public static void main(String[] args) {
		// Product:(TV) :kind: ½º¸¶Æ®TV
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("½º¸¶Æ®Tv");
		String tvModel = product1.getModel();
		System.out.println(tvModel);

		
		// Product:(Car) :kind: µðÁ©
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("¤§¤ÓÁ©");
		String carModel = product2.getModel();
		System.out.println(carModel);

	}

}
