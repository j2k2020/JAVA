package ch02.sec02;
//데이터 타입
public class DataType {
	public static void main(String[] args) {
		//문자 타입 변수 선언 및 초기화	
		char a = 'A';
		char b = '\u0041';
		char c = 65;
		
		System.out.println("a:"+a +", b:"+b+", c:"+c);
		System.out.println("---------------------------------------");
		
		//정수타입 변수 선언 및 초기화
		int byteValue = 10; // 1byte
		int shortValue = 1000; //2
		int inValue = 2100200200; //4 
		long longValue = 100010001000100L; //8
		
		System.out.println("byteValue:"+byteValue);
		System.out.println("shortValue:"+shortValue);
		System.out.println("inValue:"+inValue);
		System.out.println("longValue:"+longValue);
		System.out.println("---------------------------------------");
		
		//실수 타입 변수 선언 및 초기화
		double doubleValue = 1.234567890123456789; //8바이트 실수 (더 정밀함)
		float floatValue = 0.1234567890123456789f; //4바이트 실수: f를 안 붙이면 오류
		
		System.out.println("doubleValue:"+doubleValue);
		System.out.println("floatValue:"+floatValue);
		System.out.println("---------------------------------------");
		
		//지수 표현: e 사용하기
		int var1 = 3000000;
		double var2 = 3e6;
		float var3 = 3e6f;
	    double var4 = 2e-3;
	    
	    System.out.println("var1:"+var1);
		System.out.println("var2:"+var2);
		System.out.println("var3:"+var3);
		System.out.println("var4:"+var4);
		System.out.println("---------------------------------------");
		
		//논리 타입
		boolean booleanValue = true;
		System.out.println("booleanValue: "+ booleanValue);
		System.out.println("---------------------------------------");
		
		//문자열 Stringtype
		String name = "홍길동";
		System.out.println("이름: "+name);
	}

}








