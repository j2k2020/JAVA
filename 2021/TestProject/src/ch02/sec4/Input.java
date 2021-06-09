package ch02.sec4;

import java.util.Scanner;

//Scanner클래스를 이용한 키 입력
//자동 import : ctrl+shift +o

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("첫번째 숫자 입력:");
		num1 = sc.nextInt(); //입력한 값을 정수로 변환해서 num1에 저장
		System.out.println(num1);
		
		//두번째 입력
		System.out.println("두번째 숫자 입력:");
		num2 = sc.nextInt(); 
		System.out.println(num2);
		
		// 두 수의 합 출력
		System.out.println("두 수의 곱: "+(num1+num2));
		
		
		//두 수의 곱 출력
		System.out.println("두 수의 곱: "+(num1*num2));
		
		
		sc.close(); //리소스 낭비 막기 위해  닫기

	}

}
