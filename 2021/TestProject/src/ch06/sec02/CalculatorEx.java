package ch06.sec02;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		
		//plus() �żҵ� ȣ��
		//�Ű����� ������ ������ 2�� ����
		//������� �޾Ƽ� ������ ������ ����
		//�żҵ带 ȣ���� ������� �żҵ� �̸��� ���� ��ġ�� ��ȯ
		//myCal.plus(5, 6); //5,6���� �޾Ƽ� Calculator���� ���� �����Ѵ�
		//�׷��� ���� ���� ������ ��������� �ȴ�.
		int result1 = myCal.plus(5, 6);
		System.out.println("result1: "+result1);
		
		byte x=10;
		byte y=4;
		double result2 = myCal.divide(x, y); //10,4�� ���ԵǾ� divide�żҵ�� �Ѿ��
		System.out.println("result2: "+result2);
		
		myCal.powerOff();
		

	}

}
