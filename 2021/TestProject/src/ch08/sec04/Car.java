package ch08.sec04;

public class Car {
	// �������̽� ������ ���� ��ü ����
	// �������̽� Ÿ������ �ڵ� Ÿ�� ��ȯ �߻�
	/*
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	*/
	
	//�迭�� ����
	Tire[] tires = { new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire() };
	

	public void run() {
		// �������̽��� ����� roll() �޼ҵ� ȣ��
		// HankookTire�� �����ǵ� roll()�޼ҵ� ȣ��
		// ���� ��ü���� ����
		/*
		 * frontLeftTire.roll(); // Tire�������̽��� �߻�޼ҵ常->HankookTire�� �����ǵ� roll�޼ҵ忡�� ���� �Ȱ�
		 * ��� frontRightTire.roll(); 
		 * backLeftTire.roll(); 
		 * backRightTire.roll();
		 */
		
		//�迭���� for�� ���
		for(Tire tire: tires) {
			tire.roll();
			
			
		}

	}

}
