package ch05.sec01;

public class StringEquals {

	public static void main(String[] args) {
	    
		String strVar1 ="ȫ�浿";
		String strVar2 ="ȫ�浿";
		
		//������ ��ü�� �����ϴ��� ����
		if(strVar1==strVar2) {
			System.out.println("1�� 2�������� ����");
		}else {
			System.out.println("1�� 2�� ������ �ٸ�");
		}
		//���ڿ��� ������ ��
		if(strVar1.equals(strVar2)) {
			System.out.println("1�� 2�� ���ڿ��� ���̰� ����");
		}
		
		
		String strVar3 =new String("ȫ�浿");
		String strVar4 =new String("ȫ�浿");
		
		//������ ��ü�� �����ϴ��� ����
		if(strVar3==strVar4) {
			System.out.println("3�� 4�������� ����");
		}else {
			System.out.println("3�� 4�� ������ �ٸ�");
		}
		//���ڿ��� ������ ��
		if(strVar3.equals(strVar4)) {
			System.out.println("3�� 4�� ���ڿ��� ���̰� ����");
		}

	}

}
