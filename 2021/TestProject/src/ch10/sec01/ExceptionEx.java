package ch10.sec01;

import java.util.Scanner;

public class ExceptionEx {
	public static void main(String[] args) {
		// ���� 2�� �Է� �ް�
		// ������ ����: 0���� ����� ����
		// ���� ó�� ����: "0���� ���� �� �����ϴ�"
		Scanner sc = new Scanner(System.in);
		int n1, n2;

		System.out.println("����1:");
		n1 = sc.nextInt();
		System.out.println("����2:");
		n2 = sc.nextInt();

		try {
			System.out.println("������ ���:" + n1 / n2);
		} catch (Exception e) {
			System.out.println("0���� ���� �� ����!!!");
		}

		sc.close();

	}

}
