package ch05.sec02;

import java.util.Scanner;

//�迭 �ʱⰪ: �޸� �Ҵ� ���� �� �ڷ����� �⺻������ �ʱ�ȭ

public class Array3 {
	public static void main(String[] args) {
		/*
		 * int[] arr1 = new int[3]; for(int i=0; i<arr1.length; i++) {
		 * System.out.println("arr1["+i+"]= "+arr1[i]); }
		 * 
		 * double[] arr2 = new double[3]; for(int i=0; i<arr2.length; i++) {
		 * System.out.println("arr2["+i+"]= "+arr2[i]); }
		 * 
		 * String[] arr3 = new String[3]; for(int i=0; i<arr3.length; i++) {
		 * System.out.println("arr3["+i+"]= "+arr3[i]); }
		 */

		
		
		
		
		// �Է� �޾Ƽ� �迭�� ����

		// ũ�Ⱑ 5�� ���� �迭�� ���ڸ� �Է� �޾Ƽ� ����
		// ���� �Է�
		// num[0] : 7

		Scanner sc = new Scanner(System.in);
		
		/*int[] num = new int[5];

		System.out.println("���� �Է�:");

		for (int i = 0; i < num.length; i++) {
			System.out.print("num[" + i + "]:");
			num[i] = sc.nextInt();
		}

		// �迭�� �� ���
		// num[0] = 7
		System.out.println("�Էµ� �� ���:");

		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "]= " + num[i]);
		}
		*/
		
		
		
		//5���� �̸� �Է� �޾Ƽ� ���
		
		//String[] name = new String[4]; //�̸� ��� �� 4�� 
		String[] name = new String[5]; //5�� �����ؾ��� �迭 0~4�� ���´�.
		
		System.out.println("�̸� �Է�:");
		for (int i = 0; i < name.length; i++) {
			System.out.print("name[" + i + "]: ");
			name[i] =sc.next();
		}
		
		System.out.println("�Էµ� �� ���:");
		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "]= " + name[i]);
		}
		
		sc.close();

	}

}






















