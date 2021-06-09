package ch05.sec02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

		// 1차원 배열 - 배열의 크기는 5, name,gram.list,read
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];
		int[] gram = new int[5];
		int[] list = new int[5];
		int[] read = new int[5];
		int total, count = 0;
		String answ, grade;

		System.out.println("******TOIEC 점수 입력******");

		do {
			System.out.print((count + 1) + "번 성명 입력:");
			name[count] = sc.next();
			System.out.print((count + 1) + "번 문법 점수 입력:");
			gram[count] = sc.nextInt();
			System.out.print((count + 1) + "번 듣기 점수 입력:");
			list[count] = sc.nextInt();
			System.out.print((count + 1) + "번 독해 점수 입력:");
			read[count] = sc.nextInt();
			System.out.println();

			count++;

			System.out.println("계속 입력하시겠습니까?(y입력하면 계속):");
			answ = sc.next();

		} while (answ.equals("y") && count < 5);

		System.out.println("******TOIEC 시험 결과******");
		for (int j = 0; j < count; j++) {
			total = (gram[j] + list[j] + read[j]);

			switch (total / 200) {
			case 4:
				grade = "1등급";
				break;
			case 3:
				grade = "2등급";
				break;
			case 2:
				grade = "3등급";
				break;
			default:
				grade = "4등급";
				break;
			}
			System.out.println((j+1)+"번 "+name[j]+" "+total+" "+grade);

		}
		sc.close();

	}

}
