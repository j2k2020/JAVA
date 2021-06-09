package ch04.sec03;

import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("start 입력: ");
		int fst = sc.nextInt(); //출력을 원하는 구구단을 입력
		
		System.out.println("end 입력: ");
		int las = sc.nextInt();
		
		int sum =0;
		
		for(int i=fst; i<=las; i++) {
			
			sum += i;	
		}
		System.out.println(fst+ "~" + las + "합: " + sum);
		
		
		sc.close();
	}

}
