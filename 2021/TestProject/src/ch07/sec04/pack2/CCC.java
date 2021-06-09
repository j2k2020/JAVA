package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

//다른 패키지
//다른 패키지에서는 public만 접근 가능

public class CCC {
	public CCC() {
		AAA a = new AAA();
		//필드 접근
		a.field1=1; //public (o)
		//a.field2=1; //default (x):동일 패키지 내에서만 접근 가능
		//a.field3=3; //private(x)
		a.field4=1; //다른 패키지에서는 접근 불가 (상속을 안 받은 경우) protected(x)
		
		//매소드 접근
		a.method1(); //public
		//a.method2();//default (x):동일 패키지 내에서만 접근 가능
		//a.method2();//private(x)
		a.method4(); //protected(x)
	}

}
