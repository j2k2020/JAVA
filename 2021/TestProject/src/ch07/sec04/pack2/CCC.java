package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

//�ٸ� ��Ű��
//�ٸ� ��Ű�������� public�� ���� ����

public class CCC {
	public CCC() {
		AAA a = new AAA();
		//�ʵ� ����
		a.field1=1; //public (o)
		//a.field2=1; //default (x):���� ��Ű�� �������� ���� ����
		//a.field3=3; //private(x)
		a.field4=1; //�ٸ� ��Ű�������� ���� �Ұ� (����� �� ���� ���) protected(x)
		
		//�żҵ� ����
		a.method1(); //public
		//a.method2();//default (x):���� ��Ű�� �������� ���� ����
		//a.method2();//private(x)
		a.method4(); //protected(x)
	}

}
