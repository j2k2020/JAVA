package ch06.sec02;

public class Calculator {
	// �ʵ� x
	
	//�޼ҵ�
	
	
	//void: ��ȯ�� ����
	public void powerOn() {
		System.out.println("������ �Ŵϴ�.");
	}
	
	//��ȯ��: int(return�� ������ �������� �;� �Ѵ�)
	//�ް����� 2�� ���� �޾Ƽ� �޼ҵ� ���ο��� ���� ������ ���
	public int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	
	//��ȯ��: double (return�� ������ �Ǽ���(double)�� �;� �Ѵ�)
	//�Ű����� 2��(������)
	public double divide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}

}
