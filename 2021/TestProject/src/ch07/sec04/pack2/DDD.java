package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

public class DDD extends AAA {
	public DDD() {

		field1 = 1; // public
		// field2=1; //default
		// field3=1; //private
		field4 = 1; // protected //�ٸ� ��Ű������ ����� �޾ұ⿡ ������ ����!

		AAA a = new AAA();

		// �żҵ� ����
		a.method1(); // public
		// a.method2();//default (x):���� ��Ű�� �������� ���� ����
		// a.method2();//private(x)
		a.method4(); // protected(x)
	}

}
