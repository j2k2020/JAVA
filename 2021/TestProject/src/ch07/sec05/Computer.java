package ch07.sec05;

public class Computer extends Calculator {
	
	//재정의: 내용 수정
	//좀 더 정밀한 계산을 위해
	//부모 메소드에서 사용한 3.14159

	//@Override
	double sareaCircle(double r) {
		System.out.println("Computer클래스의 areaCircle()실행");
		return Math.PI*r*r;
	}


}
