package ch03.sec04;

import java.util.Scanner;

public class ArithmeticOperatorEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		
		
		System.out.println("국어점수 입력:");
		kor = sc.nextInt();
		System.out.println("영어점수 입력:");
		eng = sc.nextInt();
		System.out.println("수학점수 입력:");
		math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = (double)total/3.0; //average=total/3f or 3.0f
		
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		
		sc.close();
		
	}

}






