package ch06.sec01;

import java.util.Scanner;

public class Student {
	//�ʵ�
	int stdNo;
	String stdName;
	int year;
	int score;
	
	//�޼ҵ�
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*********�л� ���� �Է�**********");
		System.out.println("�й�:");
		stdNo= sc.nextInt();
		System.out.println("����:");
		stdName = sc.next();
		System.out.println("�г�:");
		year = sc.nextInt();
		System.out.println("����:");
		score = sc.nextInt();
		
		sc.close();
	}
	
	public void area() {
		System.out.println("\n*********�л� ���� ��ȸ**********");
		System.out.println("�й�:"+stdNo);
		System.out.println("����:"+stdName);
		System.out.println("�г�:"+year);
		System.out.println("����:"+score);
	}
}
