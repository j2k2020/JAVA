package aa_Test.ch06;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run){
			System.out.println("-----------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------");
			System.out.println("����>");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAcount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run=false;
			}
		}System.out.println("���α׷� ����!");
	}

	
	//���»����ϱ�
	
	private static void createAcount() {
		System.out.println("----------");
		System.out.println("���»���");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ:");
		String ano = sc.next();
		
		System.out.println("������:");
		String owner = sc.next();
		
		System.out.println("�ʱ��Աݾ�:");
		String balance = sc.next();
		
	}
	
	

	private static void accountList() {
		// TODO Auto-generated method stub
		
	}
	
	

	private static void deposit() {
		// TODO Auto-generated method stub
		
	}
	
	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}


}
