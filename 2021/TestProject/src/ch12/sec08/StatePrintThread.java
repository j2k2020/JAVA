package ch12.sec08;

//TargetThread의 상태를 지속적으로
public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targThread) {
		this.targetThread = targThread;
	}
	
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태:"+state);
			
		}
		
	}

}
