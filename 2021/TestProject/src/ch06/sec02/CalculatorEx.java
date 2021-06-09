package ch06.sec02;

public class CalculatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		
		//plus() 매소드 호출
		//매개변수 값으로 정수값 2개 전달
		//결과값을 받아서 정수형 변수에 저장
		//매소드를 호출한 결과값은 매소드 이름이 적힌 위치로 반환
		//myCal.plus(5, 6); //5,6값을 받아서 Calculator에서 값을 리턴한다
		//그래서 값을 받을 변수를 선언해줘야 된다.
		int result1 = myCal.plus(5, 6);
		System.out.println("result1: "+result1);
		
		byte x=10;
		byte y=4;
		double result2 = myCal.divide(x, y); //10,4가 대입되어 divide매소드로 넘어간다
		System.out.println("result2: "+result2);
		
		myCal.powerOff();
		

	}

}
