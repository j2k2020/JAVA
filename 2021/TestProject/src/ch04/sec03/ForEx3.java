package ch04.sec03;

import java.util.Scanner;

public class ForEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("start �Է�: ");
		int fst = sc.nextInt(); //����� ���ϴ� �������� �Է�
		
		System.out.println("end �Է�: ");
		int las = sc.nextInt();
		
		int sum =0;
		
		for(int i=fst; i<=las; i++) {
			
			sum += i;	
		}
		System.out.println(fst+ "~" + las + "��: " + sum);
		
		
		sc.close();
	}

}
