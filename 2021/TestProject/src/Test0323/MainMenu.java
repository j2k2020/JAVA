package Test0323;

import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
		System.out.println("******************************");
		System.out.println("         도서 관리 프로그램");
		System.out.println("******************************");
		System.out.println("         다음 메뉴에서 선택");
		System.out.println("******************************");
		System.out.println("1.도서 등록");
		System.out.println("2.도서 정보 조회");
		System.out.println("3.도서 정보 수정");
		System.out.println("4.도서 정보 삭제");
		System.out.println("5.종료");
		
		System.out.println("------------------------------");
		System.out.print("메뉴 번호 입력: ");
		
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
			System.out.println("종료!");
		}
		sc.close();
		
	}

}
