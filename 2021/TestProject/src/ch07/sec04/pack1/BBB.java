package ch07.sec04.pack1;

//AAA와 동일 패키지
//동일 패키지 내에서는 private필드와 매소드를 제외하면 
//다른 모든 필드와 매소드에 접근 가능

public class BBB {
	public BBB() {
		AAA a = new AAA();
		a.field1=1; //public이니까 접근이 가능
		a.field2=1; //default는 동일 패키지 내에서는 접근이 가능
		//a.field3=1; //The field AAA.field3 is not visible -> 아예 접근 조차 불가능
		//private는 외부에서 존재조차 모른다!!
		a.field4=1; //동일 패키지 내에서 protected 접근 가능 (o)
		
		
		
		//매소드 접근
		a.method1(); //public
		a.method2(); //default
		//method3()은 private이라서 접근 불가
		a.method4(); //동일 패키지 내에서는 protected 접근 가능
		
	}

}
