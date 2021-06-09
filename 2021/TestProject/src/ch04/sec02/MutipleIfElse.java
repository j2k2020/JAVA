package ch04.sec02;

import java.util.Scanner;

public class MutipleIfElse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.println("숫자2: ");
		int num2 = sc.nextInt();
		
		System.out.println("숫자3: ");
		int num3 = sc.nextInt();
		
		int max;
		
		//1 2 3
		if((num1 > num2)&&(num1 > num3) ) {
			max = num1;
		}else if((num2 > num3)) {
			max = num2;
		}else {
			max = num3;
		}
		System.out.println(max);
		
		
		sc.close();
		
		

	}

}
