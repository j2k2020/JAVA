package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

public class DDD extends AAA {
	public DDD() {

		field1 = 1; // public
		// field2=1; //default
		// field3=1; //private
		field4 = 1; // protected //다른 패키지여도 상속을 받았기에 접근이 가능!

		AAA a = new AAA();

		// 매소드 접근
		a.method1(); // public
		// a.method2();//default (x):동일 패키지 내에서만 접근 가능
		// a.method2();//private(x)
		a.method4(); // protected(x)
	}

}
