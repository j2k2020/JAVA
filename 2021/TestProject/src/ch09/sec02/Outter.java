package ch09.sec02;

//���� Ŭ�������� ��� ����
//���� Ŭ����: �޼ҵ� ���ο��� ����� Ŭ����
//�޼ҵ��� �Ű������� ���� ������ final�� �����ؾ� ��
//�ڹ�8 ����

public class Outter {
	public void method(final int arg1, int arg2) { //�Ű����� (final ���� �� / �� ���� �� = ������ ��)
		final int localVariable1 = 1;
		
		//final ������ ���� �Ұ�
		//arg1 = 100; //���� �Ұ�
		//localVariable1 = 100; //����Ұ�
		//arg2 = 200; //final�� �� �پ����Ƿ� �޼ҵ� ������ ���� ������ ���� //���� ����
		            //final Ư���� ����
		            //arg2 = �������� ó�� ��� ��
		//���⼭ arg2�� ������� ������ InnerŬ�������� ��� ����
		
		class Inner{
			//arg2�� ����� ���� �Ǵ� �� (final Ư���� ����)
			public void method() {
				int result = arg1 + localVariable1 + arg2; //Local variable arg2 defined in an enclosing scope must be final or effectively final
				//arg2: ���� Ŭ���� ���η� ����Ǿ� 
				//finalƯ���� ���� //���� ����
				
				System.out.println(result);
			}
		}
		
	}

}
