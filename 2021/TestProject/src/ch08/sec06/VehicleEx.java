package ch08.sec06;

public class VehicleEx {

	public static void main(String[] args) {
		
		//�������̽� ������ Bus ��ü ����
		//Vehicle Ÿ������ �ڵ� Ÿ�� ��ȯ �߻�
		Vehicle vehicle = new Bus();
		
		//VehicleŸ���̹Ƿ� Vehicle����� ��� ����
		System.out.print("�ڵ�Ÿ�Ժ�ȯ: ");
		vehicle.run();
		
		//Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ��� ������
		//Bus ��� ��� �Ұ�
		//vehicle.checkFare() ���Ұ�(x)
		
		//Bus����� ����Ϸ��� �ٽ� Ÿ�� ��ȯ - ���� Ÿ�� ��ȯ
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
		
		//��� �θ� ��ü�� ���� Ÿ�� ��ȯ���� ����� �� ���� �ʴ�. ���� �ڵ���ȯ �Ǿ��� �͸� ���� Ÿ�� ��ȯ���� ��� �����ϴ�.	
	}
}
