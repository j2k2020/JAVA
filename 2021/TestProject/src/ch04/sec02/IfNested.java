package ch04.sec02;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, order, tot, distot, dis;
		int num1 = 1200000;
		int num2 = 400000;

		System.out.println("*********��ǰ ����*********");
		System.out.println("1 ��Ʈ�� : 1,200,000 �� ");
		System.out.println("2 ������ī�޶� : 400,000 �� ");
		System.out.println("*************************");

		System.out.println("��ǰ��ȣ �Է�:");
		num = sc.nextInt();
		System.out.println("�ֹ����� �Է�:");
		order = sc.nextInt();
		
		
		if(num == 1) {
			//��Ʈ���� ����
			
			tot = num * 1200000;			
			dis = (int) (tot * 0.1);
			distot = tot-dis;
			
			System.out.println("��ǰ��: ��Ʈ��");
			System.out.println("����: 1,200,000 �� ");
			System.out.println("�ֹ�����: "+order);
			System.out.println("�ֹ���: "+(num2*tot));
			System.out.println("���ξ�:"+dis+" ��");
			System.out.println("�����Ҿ�:"+distot+" ��");
		} else {
			
			tot = num * 400000;
			dis = (int) (tot * 0.1);
			distot = tot - dis;
			
			System.out.println("��ǰ��: ������ī�޶�");
			System.out.println("����: 400,000  �� ");
			System.out.println("�ֹ�����: " + order);
			System.out.println("�ֹ���: " + (num2*tot));
			System.out.println("���ξ�:" + dis + " ��");
			System.out.println("�����Ҿ�:" + distot + " ��");
			
		}
			
	
		
		sc.close();

	}

}
