package ch15.sec03;

public class ProductEx {

	public static void main(String[] args) {
		// Product:(TV) :kind: ����ƮTV
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("����ƮTv");
		String tvModel = product1.getModel();
		System.out.println(tvModel);

		
		// Product:(Car) :kind: ����
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("������");
		String carModel = product2.getModel();
		System.out.println(carModel);

	}

}
