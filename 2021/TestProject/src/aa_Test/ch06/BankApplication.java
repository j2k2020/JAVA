package aa_Test.ch06;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run){
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			
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
		}System.out.println("프로그램 종료!");
	}

	
	//계좌생성하기
	
	private static void createAcount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		
		System.out.println("계좌번호:");
		String ano = sc.next();
		
		System.out.println("계좌주:");
		String owner = sc.next();
		
		System.out.println("초기입금액:");
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
