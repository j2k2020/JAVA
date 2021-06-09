package ch04.sec02;

//switch문
//주의!! -> 수식으로는 결과가 정수, 문자열, 문자 값이어야 함
//case 뒤의 value로는 반드시 하나의 값만 사용(범위1~10는 올 수 없음)
//case 다음에는 콜론(:),(;)아님
//

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		
		System.out.println("점수 입력:");
		score= sc.nextInt();
		int num = score /10;
		
		switch(num) { //year는 정수 값
		case 10:	
		case 9: 
				System.out.println("A"); break;
			case 8: 
				System.out.println("B"); break;
			case 7: 
				System.out.println("C"); break;
			case 6: 
				System.out.println("D"); break;
			default: 
				System.out.println("F");
		}
		sc.close();
	}

}
