package ch03.sec04;

import java.util.Scanner;

public class TimeCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secon = sc.nextInt();
		
		int hor=secon/60;
		int min=secon%3600/60;
		int sec=secon%3600%60;
		
		System.out.println( secon+"�ʴ� "+hor+"�ð� "+min+"�� "+sec+"���Դϴ�.");
		
		sc.close();
		
	}

}
