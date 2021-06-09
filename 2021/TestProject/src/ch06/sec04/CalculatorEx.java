package ch06.sec04;

public class CalculatorEx {

	public static void main(String[] args) {
		//static 필드 사용: 클래스이름.필드
		double result1 = 10*10*Calculator.pi;
		
		//static 메소드 호출: 클래스이름.메소드()
		int result2 = Calculator.plus(10, 50);
		int result3 = Calculator.plus(10, 5);
		
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);

	}

}
