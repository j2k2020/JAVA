package ch04.sec02;

import java.util.Scanner;

public class MutipleIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade;
		
		System.out.println("���� �Է�(0~100): ");
		int score = sc.nextInt();
		
		if(score >= 90) 
			grade = 'A';
		else if(score >= 80) grade = 'B';
		else if(score >= 70) grade = 'C';
		else if(score >= 60) grade = 'D';
		else 
		   grade = 'F';
		
		System.out.println("����: "+grade);
		
		sc.close();
		
		

	}

}