package ch08.sec09;

public class DefaultMethodEx {

	public static void main(String[] args) {
		System.out.println("*****MyClassA*****");
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		System.out.println("*****MyClassB*****");
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();

		

	}

}
