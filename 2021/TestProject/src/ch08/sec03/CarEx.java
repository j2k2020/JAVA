package ch08.sec03;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();
		/*
		 * �ѱ� Ÿ�̾ �������ϴ�. 
		 * �ѱ� Ÿ�̾ �������ϴ�. 
		 * �ѱ� Ÿ�̾ �������ϴ�. 
		 * �ѱ� Ÿ�̾ �������ϴ�.
		 */
		System.out.println("*****�ʵ��� ������*****");

		// �ʵ��� ������
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();

		myCar.run();

	}

}
