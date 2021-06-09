package ch11.sec06;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		// ·£´ý
		Random rm = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.println(rm.nextInt(10)+1);
		}

	}

}
