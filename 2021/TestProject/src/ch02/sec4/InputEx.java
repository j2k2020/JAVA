package ch02.sec4;

import java.util.Scanner;

//ScannerŬ������ �̿��� Ű �Է�
//�ڵ� import : ctrl+shift+o

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String num;
		float score; //flote
		String grade;
		
		System.out.print("�̸� �Է�:");
		name = sc.nextLine(); 
		System.out.println("�г� �Է�:");
		num = sc.nextLine();
		System.out.println("���� �Է�:");
		score = sc.nextFloat();
		System.out.println("���� �Է�:");
		grade = sc.nextLine();
		
		System.out.println("�̸�: "+name);
		System.out.println("�г�: "+num);
		System.out.println("����: "+score);
		System.out.println("����: "+grade);
	
		
		
		sc.close(); //���ҽ� ���� ���� ����  �ݱ�

	}

}
