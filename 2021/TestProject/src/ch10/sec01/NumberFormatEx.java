package ch10.sec01;

public class NumberFormatEx {
	public static void main(String[] args) {
		
		//���� 100
		String data1="100";
		//String data2="ab1000"; //���ڰ� ���� ���� �Ұ�
		String data2="1000";
		
		//���ڿ��� ������ ��ȯ
		int value1 = Integer.parseInt(data1); //Integer.parseInt�� ���� Ÿ���� ���ڿ��� ���ڷ� ��ȯ���ִ� ����
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println("���: "+result);
		
	}

}
