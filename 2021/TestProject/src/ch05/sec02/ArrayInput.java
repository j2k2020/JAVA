package ch05.sec02;

import java.util.Scanner;

//�迭 �ʱⰪ: �޸� �Ҵ� ���� �� �ڷ����� �⺻������ �ʱ�ȭ

public class ArrayInput {
	public static void main(String[] args) {
		//���� �Է�: 5�� �Է�
		//������ ��� ���
		//score, total, average
		//���� �Է�
		//�л� 1: 97
		//...
		//����:
		//���:
		
		Scanner sc=new Scanner(System.in);
		int[] score= new int[5];
		int total = 0;
		float average =0;
		
		System.out.println("������ �Է��ϼ���.");

		for (int i = 0; i < score.length; i++) {
			System.out.print("�л�" + (i+1) + "�� ����:");
			score[i] = sc.nextInt();
			total += score[i];
		}
		average = total / (float)score.length;
		
		System.out.println("\n����:"+total);
		System.out.println("\n���:"+average);
		
		sc.close();
	}
	

}






















