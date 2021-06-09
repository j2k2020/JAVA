package ch04.sec02;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pay;
		
		System.out.println("번호 입력(1.현금 2.카드): ");
		num = sc.nextInt();
		
		if(num == 1 || num == 2) {
			//제대로 입력한 경우
			System.out.println("지불액 입력:");
			pay = sc.nextInt();
			
			if(num == 1) {
				System.out.println("할인액 10%");
				System.out.println("할인액:"+(int)(pay*0.1)+" 원");
			}else {
				System.out.println("할인액 5%");
				System.out.println("할인액:"+(int)(pay/20)+" 원");
			}
		}else {
			//잘 못 입력한 경우
			System.out.println("잘못된 입력 입니다.");
			
		}
		
		sc.close();

	}

}
