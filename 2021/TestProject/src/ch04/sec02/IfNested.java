package ch04.sec02;

import java.util.Scanner;

public class IfNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, order, tot, distot, dis;
		int num1 = 1200000;
		int num2 = 400000;

		System.out.println("*********상품 정보*********");
		System.out.println("1 노트북 : 1,200,000 원 ");
		System.out.println("2 디지털카메라 : 400,000 원 ");
		System.out.println("*************************");

		System.out.println("상품번호 입력:");
		num = sc.nextInt();
		System.out.println("주문수량 입력:");
		order = sc.nextInt();
		
		
		if(num == 1) {
			//노트북을 선택
			
			tot = num * 1200000;			
			dis = (int) (tot * 0.1);
			distot = tot-dis;
			
			System.out.println("상품명: 노트북");
			System.out.println("가격: 1,200,000 원 ");
			System.out.println("주문수량: "+order);
			System.out.println("주문액: "+(num2*tot));
			System.out.println("할인액:"+dis+" 원");
			System.out.println("총지불액:"+distot+" 원");
		} else {
			
			tot = num * 400000;
			dis = (int) (tot * 0.1);
			distot = tot - dis;
			
			System.out.println("상품명: 디지털카메라");
			System.out.println("가격: 400,000  원 ");
			System.out.println("주문수량: " + order);
			System.out.println("주문액: " + (num2*tot));
			System.out.println("할인액:" + dis + " 원");
			System.out.println("총지불액:" + distot + " 원");
			
		}
			
	
		
		sc.close();

	}

}
