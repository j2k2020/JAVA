package ch09.sec03;

public class Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-field()");
	}
	
	//��ø Ŭ����
	class Inner{
		String field = "Inner-field";
		
		void method() {
			System.out.println("Inner-field()");
		}
		
		void print() {
			//this: Inner ��ü ����
			System.out.println(this.field);
			this.method();
		
			//Outter.this: Outter ��ü ����
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
		
		
	}

}
