package ch07.sec04.pack1;

//AAA�� ���� ��Ű��
//���� ��Ű�� �������� private�ʵ�� �żҵ带 �����ϸ� 
//�ٸ� ��� �ʵ�� �żҵ忡 ���� ����

public class BBB {
	public BBB() {
		AAA a = new AAA();
		a.field1=1; //public�̴ϱ� ������ ����
		a.field2=1; //default�� ���� ��Ű�� �������� ������ ����
		//a.field3=1; //The field AAA.field3 is not visible -> �ƿ� ���� ���� �Ұ���
		//private�� �ܺο��� �������� �𸥴�!!
		a.field4=1; //���� ��Ű�� ������ protected ���� ���� (o)
		
		
		
		//�żҵ� ����
		a.method1(); //public
		a.method2(); //default
		//method3()�� private�̶� ���� �Ұ�
		a.method4(); //���� ��Ű�� �������� protected ���� ����
		
	}

}
