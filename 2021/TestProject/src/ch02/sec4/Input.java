package ch02.sec4;

import java.util.Scanner;

//ScannerŬ������ �̿��� Ű �Է�
//�ڵ� import : ctrl+shift +o

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("ù��° ���� �Է�:");
		num1 = sc.nextInt(); //�Է��� ���� ������ ��ȯ�ؼ� num1�� ����
		System.out.println(num1);
		
		//�ι�° �Է�
		System.out.println("�ι�° ���� �Է�:");
		num2 = sc.nextInt(); 
		System.out.println(num2);
		
		// �� ���� �� ���
		System.out.println("�� ���� ��: "+(num1+num2));
		
		
		//�� ���� �� ���
		System.out.println("�� ���� ��: "+(num1*num2));
		
		
		sc.close(); //���ҽ� ���� ���� ����  �ݱ�

	}

}
