package Test0323;

import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
		System.out.println("******************************");
		System.out.println("         ���� ���� ���α׷�");
		System.out.println("******************************");
		System.out.println("         ���� �޴����� ����");
		System.out.println("******************************");
		System.out.println("1.���� ���");
		System.out.println("2.���� ���� ��ȸ");
		System.out.println("3.���� ���� ����");
		System.out.println("4.���� ���� ����");
		System.out.println("5.����");
		
		System.out.println("------------------------------");
		System.out.print("�޴� ��ȣ �Է�: ");
		
		Scanner sc = new Scanner(System.in);
		int menuNum;
		menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1 :
			BookInsert bis = new BookInsert();
			bis.insert();
			break;
		case 5: 
			System.out.println("------------------------");
			System.out.println("����!");
		}
		sc.close();
		
	}

}
