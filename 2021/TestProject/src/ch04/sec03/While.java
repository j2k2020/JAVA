package ch04.sec03;

//while��
/*
 * ���ǿ� ���� �ݺ����� ������� ������ �� ���
 * ���ǽ��� true�� ��� ����ؼ� �ݺ�
 * ����: �ʱⰪ�� �������� �ݵ�� ���´�
 * */

public class While {
	public static void main(String[] args) {
		//1~100 �� �߿� ¦���� ���� ���϶�
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
				sum += i;
				i += 2;
		}
		System.out.println("1~100¦���� ��:"+sum);
		
		
	}

}
