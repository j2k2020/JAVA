package ch04.sec03;

import java.util.Scanner;

public class While3 {
	public static void main(String[] args) {
		int person, num, socor;
		int sum =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �� �Է�:");
		person = sc.nextInt();
		
		for(int i=1; i<=person; i++ ) {
			System.out.println("�л�"+i+"�����Է�:");		
			num = sc.nextInt();
			sum += num;
			
		}
		
		sc.close();
	}

}
