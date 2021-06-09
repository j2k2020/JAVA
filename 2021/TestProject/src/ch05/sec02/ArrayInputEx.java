package ch05.sec02;

import java.util.Scanner;

//배열 초기값: 메모리 할당 받을 때 자료형의 기본값으로 초기화

public class ArrayInputEx {
	public static void main(String[] args) {
		//정수 5개를 입력 받아서 최대값을 구하는 프로그램
		//숫자 입력
		//num[0]: 87
		//..
		//입력된 값: ...
		//최대값:	
		Scanner sc=new Scanner(System.in);
		int[] num= new int[5];
		int max= 0;

		System.out.println("숫자를 입력:");
		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" +i+ "]:");
			num[i] = sc.nextInt();
			
			if(num[i]>max) { max= num[i]; }
		}
		
		System.out.println("\n 입력된 값은:");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.print("\n최대값은? : "+max);
		
		sc.close();
	}
	

}






















