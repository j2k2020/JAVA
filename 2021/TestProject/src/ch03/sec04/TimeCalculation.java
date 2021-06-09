package ch03.sec04;

import java.util.Scanner;

public class TimeCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secon = sc.nextInt();
		
		int hor=secon/60;
		int min=secon%3600/60;
		int sec=secon%3600%60;
		
		System.out.println( secon+"초는 "+hor+"시간 "+min+"분 "+sec+"초입니다.");
		
		sc.close();
		
	}

}
