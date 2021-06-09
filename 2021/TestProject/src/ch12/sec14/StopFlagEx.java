package ch12.sec14;

public class StopFlagEx {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		
		//1초 정지 후
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printThread.setStop(true);
		//stop
		

	}

}
