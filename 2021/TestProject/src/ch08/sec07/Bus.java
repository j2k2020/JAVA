package ch08.sec07;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("bus�� �������ϴ�.");
	}
	
	
	//�� �޼ҵ带 ����Ϸ��� ���� Ÿ�� ��ȯ�� �ؾ��� ����� ����!
	public void checkFare() {
		System.out.println("��������� üũ!");
	}

}