package ch04.sec03;

//while문
/*
 * 조건에 따라 반복문을 계속할지 결정할 때 사용
 * 조건식이 true일 경우 계속해서 반복
 * 주의: 초기값과 증감식을 반드시 적는다
 * */

public class While {
	public static void main(String[] args) {
		//1~100 수 중에 짝수의 합을 구하라
		int i = 0;
		int sum = 0;
		
		while(i<=100) {
				sum += i;
				i += 2;
		}
		System.out.println("1~100짝수의 합:"+sum);
		
		
	}

}
