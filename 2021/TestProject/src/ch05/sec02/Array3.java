package ch05.sec02;

import java.util.Scanner;

//배열 초기값: 메모리 할당 받을 때 자료형의 기본값으로 초기화

public class Array3 {
	public static void main(String[] args) {
		/*
		 * int[] arr1 = new int[3]; for(int i=0; i<arr1.length; i++) {
		 * System.out.println("arr1["+i+"]= "+arr1[i]); }
		 * 
		 * double[] arr2 = new double[3]; for(int i=0; i<arr2.length; i++) {
		 * System.out.println("arr2["+i+"]= "+arr2[i]); }
		 * 
		 * String[] arr3 = new String[3]; for(int i=0; i<arr3.length; i++) {
		 * System.out.println("arr3["+i+"]= "+arr3[i]); }
		 */

		
		
		
		
		// 입력 받아서 배열에 저장

		// 크기가 5인 정수 배열에 숫자를 입력 받아서 저장
		// 숫자 입력
		// num[0] : 7

		Scanner sc = new Scanner(System.in);
		
		/*int[] num = new int[5];

		System.out.println("숫자 입력:");

		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "]:");
			num[i] = sc.nextInt();
		}

		// 배열의 값 출력
		// num[0] = 7
		System.out.println("입력된 값 출력:");

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]= " + num[i]);
		}
		*/
		
		
		
		//5명의 이름 입력 받아서 출력
		
		//String[] name = new String[4]; //이름 목록 총 4개 
		String[] name = new String[5]; //5로 선언해야지 배열 0~4가 나온다.
		
		System.out.println("이름 입력:");
		for (int i = 0; i < name.length; i++) {
			System.out.print("name[" + i + "]: ");
			name[i] =sc.next();
		}
		
		System.out.println("입력된 값 출력:");
		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "]= " + name[i]);
		}
		
		sc.close();

	}

}






















