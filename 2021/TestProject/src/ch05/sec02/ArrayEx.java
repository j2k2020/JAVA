package ch05.sec02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

		// 1���� �迭 - �迭�� ũ��� 5, name,gram.list,read
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];
		int[] gram = new int[5];
		int[] list = new int[5];
		int[] read = new int[5];
		int total, count = 0;
		String answ, grade;

		System.out.println("******TOIEC ���� �Է�******");

		do {
			System.out.print((count + 1) + "�� ���� �Է�:");
			name[count] = sc.next();
			System.out.print((count + 1) + "�� ���� ���� �Է�:");
			gram[count] = sc.nextInt();
			System.out.print((count + 1) + "�� ��� ���� �Է�:");
			list[count] = sc.nextInt();
			System.out.print((count + 1) + "�� ���� ���� �Է�:");
			read[count] = sc.nextInt();
			System.out.println();

			count++;

			System.out.println("��� �Է��Ͻðڽ��ϱ�?(y�Է��ϸ� ���):");
			answ = sc.next();

		} while (answ.equals("y") && count < 5);

		System.out.println("******TOIEC ���� ���******");
		for (int j = 0; j < count; j++) {
			total = (gram[j] + list[j] + read[j]);

			switch (total / 200) {
			case 4:
				grade = "1���";
				break;
			case 3:
				grade = "2���";
				break;
			case 2:
				grade = "3���";
				break;
			default:
				grade = "4���";
				break;
			}
			System.out.println((j+1)+"�� "+name[j]+" "+total+" "+grade);

		}
		sc.close();

	}

}