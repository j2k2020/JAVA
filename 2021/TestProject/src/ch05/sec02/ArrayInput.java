package ch05.sec02;

import java.util.Scanner;

//배열 초기값: 메모리 할당 받을 때 자료형의 기본값으로 초기화

public class ArrayInput {
	public static void main(String[] args) {
		//점수 입력: 5개 입력
		//총점과 평균 출력
		//score, total, average
		//점수 입력
		//학생 1: 97
		//...
		//총점:
		//평균:
		
		Scanner sc=new Scanner(System.in);
		int[] score= new int[5];
		int total = 0;
		float average =0;
		
		System.out.println("점수를 입력하세요.");

		for (int i = 0; i < score.length; i++) {
			System.out.print("학생" + (i+1) + "의 점수:");
			score[i] = sc.nextInt();
			total += score[i];
		}
		average = total / (float)score.length;
		
		System.out.println("\n총점:"+total);
		System.out.println("\n평균:"+average);
		
		sc.close();
	}
	

}






















