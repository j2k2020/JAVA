package ch03.sec04;

import java.util.Scanner;

public class ArithmeticOperatorEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		
		
		System.out.println("�������� �Է�:");
		kor = sc.nextInt();
		System.out.println("�������� �Է�:");
		eng = sc.nextInt();
		System.out.println("�������� �Է�:");
		math = sc.nextInt();
		
		int total = kor+eng+math;
		double avg = (double)total/3.0; //average=total/3f or 3.0f
		
		System.out.println("����:"+kor);
		System.out.println("����:"+eng);
		System.out.println("����:"+math);
		System.out.println("����:"+total);
		System.out.println("���:"+avg);
		
		sc.close();
		
	}

}






