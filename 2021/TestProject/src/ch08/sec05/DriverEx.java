package ch08.sec05;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus =new Bus();
		Taxi taxi = new Taxi();
		
		//�Ű������� ������
		driver.drive(bus); //�ڵ� Ÿ�� ��ȯ: Vehicle vehicleŸ�Կ� = bus; ������ �� ����
		driver.drive(taxi); //�ڵ� Ÿ�� ��ȯ Vehicle vehicleŸ�Կ� = taxi; ������ �� ����
		//driver.drive(vehicle); //�Ұ���!
	}

}
