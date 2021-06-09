package ch04.sec03;

public class ForEx1 {
	public static void main(String[] args) {
				
		int sum = 0;
		int i;
		
		for( i=1; i<=10; i++) {
			if(i%2!=1) {
				sum += i;
			}
		}
		System.out.println("1~"+(i+1)+"гу: "+sum);
	}

}
