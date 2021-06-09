package ch02.sec4;

import java.util.Scanner;

//Scanner클래스를 이용한 키 입력
//자동 import : ctrl+shift+o

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String num;
		float score; //flote
		String grade;
		
		System.out.print("이름 입력:");
		name = sc.nextLine(); 
		System.out.println("학년 입력:");
		num = sc.nextLine();
		System.out.println("점수 입력:");
		score = sc.nextFloat();
		System.out.println("학점 입력:");
		grade = sc.nextLine();
		
		System.out.println("이름: "+name);
		System.out.println("학년: "+num);
		System.out.println("점수: "+score);
		System.out.println("학점: "+grade);
	
		
		
		sc.close(); //리소스 낭비 막기 위해  닫기

	}

}
