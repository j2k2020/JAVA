package ch06.sec07;

import java.util.Scanner;

//하나의 java 파일에 여러 클래스 작성

class Add { //더하기
	// 필드
	private int a, b;

	// 메소드 .. 생성자: 필드 값 초기화
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 메소드
	public void calculate() {
		System.out.print("더하기: " + (a + b));
	}
}




class subtract { //빼기
	// 필드
	private int a, b;

	// 메소드 .. 생성자: 필드 값 초기화
	public subtract(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 메소드
	public void calculate() {
		System.out.print("빼기: " + (a - b));
	}
}




class multiply { //곱하기
	// 필드
	private int a, b;

	// 메소드 .. 생성자: 필드 값 초기화
	public multiply(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// 메소드
	public void calculate() {
		System.out.print("곱하기: " + (a * b));
	}
}




class divide { //나누기
	// 필드
	private double a, b;

	// 메소드 .. 생성자: 필드 값 초기화
	public divide(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// 메소드
	public void calculate() {
		System.out.println("나누기: " + (a / b));
	}
}





public class MultiCalass {
	public static void main(String[] args) {
		// 연산할 숫자와 연산자를 입력 받아서 연산 결과를 출력
		// switch문을 사용해서 연산자에 해당하는 클래스의 객체 생성해서 메소드 사용
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;

		// 숫자
		// 정수 1, 2입력
		System.out.print("숫자1 입력:");
		a = sc.nextInt();
		System.out.print("숫자2 입력:");
		b = sc.nextInt();

		// 연산자 입력
		System.out.print("연산자(+, -, *, /) 입력:");
		operator = sc.next().charAt(0); // 연산자 1문자 입력

		// switch문 사용해서 연산자에 해당되는 클래스의 객체를 생성해서 메소드 호출
		// 결과값 출력
		switch (operator) {
		case '+':
			Add add = new Add(a, b);
			add.calculate();
			break;

		case '-':
			subtract sub = new subtract(a, b);
			sub.calculate();
			break;

		case '*':
			multiply multi = new multiply(a, b);
			multi.calculate();
			break;

		case '/':
			divide div = new divide(a, b);
			div.calculate();
			break;
			default:
				System.out.println("잘못된 연산");
		}
		sc.close();

	}

}
