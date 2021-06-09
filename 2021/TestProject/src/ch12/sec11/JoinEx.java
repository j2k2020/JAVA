package ch12.sec11;

public class JoinEx {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		sumThread.join();
		
		
		System.out.println("1~100гу: "+sumThread.getSum());
	}

}
