package ch06.sec07;

import java.util.Scanner;

//�ϳ��� java ���Ͽ� ���� Ŭ���� �ۼ�

class Add { //���ϱ�
	// �ʵ�
	private int a, b;

	// �޼ҵ� .. ������: �ʵ� �� �ʱ�ȭ
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// �޼ҵ�
	public void calculate() {
		System.out.print("���ϱ�: " + (a + b));
	}
}




class subtract { //����
	// �ʵ�
	private int a, b;

	// �޼ҵ� .. ������: �ʵ� �� �ʱ�ȭ
	public subtract(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// �޼ҵ�
	public void calculate() {
		System.out.print("����: " + (a - b));
	}
}




class multiply { //���ϱ�
	// �ʵ�
	private int a, b;

	// �޼ҵ� .. ������: �ʵ� �� �ʱ�ȭ
	public multiply(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// �޼ҵ�
	public void calculate() {
		System.out.print("���ϱ�: " + (a * b));
	}
}




class divide { //������
	// �ʵ�
	private double a, b;

	// �޼ҵ� .. ������: �ʵ� �� �ʱ�ȭ
	public divide(double a, double b) {
		this.a = a;
		this.b = b;
	}

	// �޼ҵ�
	public void calculate() {
		System.out.println("������: " + (a / b));
	}
}





public class MultiCalass {
	public static void main(String[] args) {
		// ������ ���ڿ� �����ڸ� �Է� �޾Ƽ� ���� ����� ���
		// switch���� ����ؼ� �����ڿ� �ش��ϴ� Ŭ������ ��ü �����ؼ� �޼ҵ� ���
		// ���� ����
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;

		// ����
		// ���� 1, 2�Է�
		System.out.print("����1 �Է�:");
		a = sc.nextInt();
		System.out.print("����2 �Է�:");
		b = sc.nextInt();

		// ������ �Է�
		System.out.print("������(+, -, *, /) �Է�:");
		operator = sc.next().charAt(0); // ������ 1���� �Է�

		// switch�� ����ؼ� �����ڿ� �ش�Ǵ� Ŭ������ ��ü�� �����ؼ� �޼ҵ� ȣ��
		// ����� ���
		switch (operator) {
		case '+':
			Add add = new Add(a, b);
			add.calculate();
			break;

		case '-':
			subtract sub = new subtract(a, b);
			sub.calculate();
			break;

		case '*':
			multiply multi = new multiply(a, b);
			multi.calculate();
			break;

		case '/':
			divide div = new divide(a, b);
			div.calculate();
			break;
			default:
				System.out.println("�߸��� ����");
		}
		sc.close();

	}

}
