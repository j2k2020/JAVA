package ch04.sec03;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		int person, num, socor;
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력:");
		person = sc.nextInt();
		
		for(int i=1; i<=person; i++ ) {
			System.out.println("학생"+i+"점수입력:");		
			num = sc.nextInt();
			sum += num;
			
		}
		
		sc.close();
	}

}
