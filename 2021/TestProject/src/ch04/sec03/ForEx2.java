package ch04.sec03;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력하세요: ");
		int dan = sc.nextInt(); //출력을 원하는 구구단을 입력
		
		for( int i=1; i<=9; i++) {
			System.out.println(dan+ " x " + i + " = " +(dan*i));
		}
		sc.close();
	}

}
